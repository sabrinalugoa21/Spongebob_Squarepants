#include <string>
#include <vector>
#include <map>

#include "Spongebob_SquarepantsBaseVisitor.h"
#include "antlr4-runtime.h"

#include "intermediate/symbtab/Predefined.h"
#include "Compiler.h"
#include "StatementGenerator.h"

namespace backend { namespace compiler {

using namespace std;
using namespace intermediate;

void StatementGenerator::emitAssignment(Spongebob_SquarepantsParser::AssignmentStatementContext *ctx)
{
	Spongebob_SquarepantsParser::VariableContext *varCtx  = ctx->lhs()->variable();
	Spongebob_SquarepantsParser::ExpressionContext *exprCtx = ctx->rhs()->expression();
    SymtabEntry *varId = varCtx->entry;
    Typespec *varType  = varCtx->type;
    Typespec *exprType = exprCtx->type;

    // The last modifier, if any, is the variable's last subscript or field.
    int modifierCount = varCtx->modifier().size();
    Spongebob_SquarepantsParser::ModifierContext *lastModCtx = modifierCount == 0
                            ? nullptr : varCtx->modifier()[modifierCount - 1];

    // The target variable has subscripts and/or fields.
    if (modifierCount > 0)
    {
        lastModCtx = varCtx->modifier()[modifierCount - 1];
        compiler->visit(varCtx);
    }

    // Emit code to evaluate the expression.
    compiler->visit(exprCtx);

    // float variable := integer constant
    if (   (varType == Predefined::realType)
        && (exprType->baseType() == Predefined::integerType)) emit(I2F);

    // Emit code to store the expression value into the target variable.
    // The target variable has no subscripts or fields.
    if (lastModCtx == nullptr) emitStoreValue(varId, varId->getType());

    // The target variable is a field.
    else if (lastModCtx->field() != nullptr)
    {
        emitStoreValue(lastModCtx->field()->entry, lastModCtx->field()->type);
    }

    // The target variable is an array element.
    else
    {
        emitStoreValue(nullptr, varType);
    }
}

void StatementGenerator::emitIf(Spongebob_SquarepantsParser::IfStatementContext *ctx)
{
   	Label *TopThen = new Label();
	Label *TopElse = new Label();
	Label *ExitLabel = new Label();

	compiler->visit(ctx->expression());
	if (ctx->falseStatement()) emit(IFEQ, TopElse);
	else emit(IFEQ, ExitLabel);
	emitLabel(TopThen);
	compiler->visit(ctx->trueStatement());
	emit(GOTO, ExitLabel);
	if (ctx->falseStatement())  {
		emitLabel(TopElse);
		compiler->visit(ctx->falseStatement());
	}
	emitLabel(ExitLabel);
}


void StatementGenerator::emitWhile(Spongebob_SquarepantsParser::WhileStatementContext *ctx)
{
    	Label *loopTopLabel = new Label();
	Label *loopExitLabel = new Label();

	emitLabel(loopTopLabel);

	compiler->visit(ctx->expression());
	emit(IFEQ, loopExitLabel);
	compiler->visit(ctx->statement());
	emit(GOTO, loopTopLabel);

	emitLabel(loopExitLabel);
}


void StatementGenerator::emitFunctionCall(Spongebob_SquarepantsParser::FunctionCallContext *ctx)
{
    	SymtabEntry *val = ctx->functionName()->entry;
	emitCall(val, ctx->argumentList());
}

void StatementGenerator::emitCall(SymtabEntry *routineId,
		Spongebob_SquarepantsParser::ArgumentListContext *argListCtx)
{
    	string FnName = routineId->getName();
	string ArgType = "";

	for (Spongebob_SquarepantsParser::ArgumentContext *ex : argListCtx->argument()) {
		ex->expression()->type;
	}
}

void StatementGenerator::emitWrite(Spongebob_SquarepantsParser::WriteStatementContext *ctx)
{
    emitWrite(ctx->writeArguments(), false);
}

void StatementGenerator::emitWriteln(Spongebob_SquarepantsParser::WritelnStatementContext *ctx)
{
    emitWrite(ctx->writeArguments(), true);
}

void StatementGenerator::emitWrite(Spongebob_SquarepantsParser::WriteArgumentsContext *argsCtx,
                      bool needLF)
{
    emit(GETSTATIC, "java/lang/System/out", "Ljava/io/PrintStream;");

    // WRITELN with no arguments.
    if (argsCtx == nullptr)
    {
        emit(INVOKEVIRTUAL, "java/io/PrintStream.println()V");
        localStack->decrease(1);
    }

    // Generate code for the arguments.
    else
    {
        string format;
        int exprCount = createWriteFormat(argsCtx, format, needLF);

        // Load the format string.
        emit(LDC, format);

        // Emit the arguments array.
       if (exprCount > 0)
        {
            emitArgumentsArray(argsCtx, exprCount);

            emit(INVOKEVIRTUAL,
                        string("java/io/PrintStream/printf(Ljava/lang/String;")
                      + string("[Ljava/lang/Object;)")
                      + string("Ljava/io/PrintStream;"));
            localStack->decrease(2);
            emit(POP);
        }
        else
        {
            emit(INVOKEVIRTUAL,
                 "java/io/PrintStream/print(Ljava/lang/String;)V");
            localStack->decrease(2);
        }
    }
}

int StatementGenerator::createWriteFormat(
		Spongebob_SquarepantsParser::WriteArgumentsContext *argsCtx,
                                string& format, bool needLF)
{
    int exprCount = 0;
    format += "\"";

    // Loop over the write arguments.
    for (Spongebob_SquarepantsParser::WriteArgumentContext *argCtx : argsCtx->writeArgument())
    {
        Typespec *type = argCtx->expression()->type;
        string argText = argCtx->getText();

        // Append any literal strings.
        if (argText[0] == '\'') format += convertString(argText, true);

        // For any other expressions, append a field specifier.
        else
        {
            exprCount++;
            format.append("%");

            Spongebob_SquarepantsParser::FieldWidthContext *fwCtx = argCtx->fieldWidth();
            if (fwCtx != nullptr)
            {
                string sign = (   (fwCtx->sign() != nullptr)
                               && (fwCtx->sign()->getText() == "-")) ? "-" : "";
                format += sign + fwCtx->integerConstant()->getText();

                Spongebob_SquarepantsParser::DecimalPlacesContext *dpCtx =
                                                        fwCtx->decimalPlaces();
                if (dpCtx != nullptr)
                {
                    format += "." + dpCtx->integerConstant()->getText();
                }
            }

            string typeFlag = type == Predefined::integerType ? "d"
                            : type == Predefined::realType    ? "f"
                            : type == Predefined::booleanType ? "b"
                            : type == Predefined::charType    ? "c"
                            :                                  "s";
            format += typeFlag;
        }
    }

    format += needLF ? "\\n\"" : "\"";

    return exprCount;
}

void StatementGenerator::emitArgumentsArray(
		Spongebob_SquarepantsParser::WriteArgumentsContext *argsCtx, int exprCount)
{
    // Create the arguments array.
    emitLoadConstant(exprCount);
    emit(ANEWARRAY, "java/lang/Object");

    int index = 0;

    // Loop over the write arguments to fill the arguments array.
    for (Spongebob_SquarepantsParser::WriteArgumentContext *argCtx :
                                                argsCtx->writeArgument())
    {
        string argText = argCtx->getText();
        Spongebob_SquarepantsParser::ExpressionContext *exprCtx = argCtx->expression();
        Typespec *type = exprCtx->type->baseType();

        // Skip string constants, which were made part of
        // the format string.
        if (argText[0] != '\'')
        {
            emit(DUP);
            emitLoadConstant(index++);

            compiler->visit(exprCtx);

            Form form = type->getForm();
            if (    ((form == SCALAR) || (form == ENUMERATION))
                 && (type != Predefined::stringType))
            {
                emit(INVOKESTATIC, valueOfSignature(type));
            }

            // Store the value into the array.
            emit(AASTORE);
        }
    }
}
}

}} // namespace backend::compiler
