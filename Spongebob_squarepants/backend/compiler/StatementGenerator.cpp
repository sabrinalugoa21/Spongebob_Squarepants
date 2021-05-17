#include <string>
#include <vector>
#include <map>

#include "PascalBaseVisitor.h"
#include "antlr4-runtime.h"

#include "intermediate/symbtab/Predefined.h"
#include "Compiler.h"
#include "StatementGenerator.h"

namespace backend { namespace compiler {

using namespace std;
using namespace intermediate;

void StatementGenerator::emitAssignment(PascalParser::AssignmentStatementContext *ctx)
{
    PascalParser::VariableContext *varCtx  = ctx->lhs()->variable();
    PascalParser::ExpressionContext *exprCtx = ctx->rhs()->expression();
    SymtabEntry *varId = varCtx->entry;
    Typespec *varType  = varCtx->type;
    Typespec *exprType = exprCtx->type;

    // The last modifier, if any, is the variable's last subscript or field.
    int modifierCount = varCtx->modifier().size();
    PascalParser::ModifierContext *lastModCtx = modifierCount == 0
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

void StatementGenerator::emitIf(PascalParser::IfStatementContext *ctx)
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

void StatementGenerator::emitCase(PascalParser::CaseStatementContext *ctx)
{
    	vector<Label*> Label_Arr;
	Label* ExitLabel = new Label();
	Label_Arr.push_back(new Label());
	int count = 0;


	for(PascalParser::CaseBranchContext *brch : ctx->caseBranchList()->caseBranch()) {

		if (!brch->statement()) break;

		for (PascalParser::CaseConstantContext *cse : brch->caseConstantList()->caseConstant())  {
			emitLabel(Label_Arr[count]);
			count++;
			compiler->visit(ctx->expression());
			emitLoadConstant(cse->value);

			Label_Arr.push_back(new Label());
			emit(IF_ICMPNE, Label_Arr[count]);

			compiler->visit(brch->statement());

			emit(GOTO, ExitLabel);

		}
	}
	emitLabel(Label_Arr[count]);
	emitLabel(ExitLabel);
}

void StatementGenerator::emitRepeat(PascalParser::RepeatStatementContext *ctx)
{
    Label *loopTopLabel  = new Label();
    Label *loopExitLabel = new Label();

    emitLabel(loopTopLabel);

    compiler->visit(ctx->statementList());
    compiler->visit(ctx->expression());
    emit(IFNE, loopExitLabel);
    emit(GOTO, loopTopLabel);

    emitLabel(loopExitLabel);
}

void StatementGenerator::emitWhile(PascalParser::WhileStatementContext *ctx)
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

void StatementGenerator::emitFor(PascalParser::ForStatementContext *ctx)
{
    	Label *TopLoop = new Label();
	Label  *ExitLoop = new Label();

	compiler->visit(ctx->expression(0));

	string variableName = ctx->variable()->variableIdentifier()->getText();
	string name = programName + "/" + variableName;

	emitStoreValue(ctx->variable()->variableIdentifier()->entry, ctx->variable()->variableIdentifier()->type);
	
	emitLabel(TopLoop);
	emitLoadValue(ctx->variable()->variableIdentifier()->entry);
	compiler->visit(ctx->expression(1));
	if (ctx->TO()) emit(IF_ICMPGT, ExitLoop);
	else emit(IF_ICMPLT, ExitLoop);
	compiler->visit(ctx->statement());

	emitLoadValue(ctx->variable()->variableIdentifier()->entry);
	emit(ICONST_1);
	if (ctx->TO()) emit(IADD);
	else emit(ISUB);

	emitStoreValue(ctx->variable()->variableIdentifier()->entry, ctx->variable()->variableIdentifier()->type);

	emit(GOTO, TopLoop);
	emitLabel(ExitLoop);
}

void StatementGenerator::emitProcedureCall(PascalParser::ProcedureCallStatementContext *ctx)
{
    	SymtabEntry *val = ctx->procedureName()->entry;
	emitCall(val, ctx->argumentList());
}

void StatementGenerator::emitFunctionCall(PascalParser::FunctionCallContext *ctx)
{
    	SymtabEntry *val = ctx->functionName()->entry;
	emitCall(val, ctx->argumentList());
}

void StatementGenerator::emitCall(SymtabEntry *routineId,
                                  PascalParser::ArgumentListContext *argListCtx)
{
    	string FnName = routineId->getName();
	string ArgType = "";

	for (PascalParser::ArgumentContext *ex : argListCtx->argument()) {
		ex->expression()->type;
	}
}

void StatementGenerator::emitWrite(PascalParser::WriteStatementContext *ctx)
{
    emitWrite(ctx->writeArguments(), false);
}

void StatementGenerator::emitWriteln(PascalParser::WritelnStatementContext *ctx)
{
    emitWrite(ctx->writeArguments(), true);
}

void StatementGenerator::emitWrite(PascalParser::WriteArgumentsContext *argsCtx,
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
                                PascalParser::WriteArgumentsContext *argsCtx,
                                string& format, bool needLF)
{
    int exprCount = 0;
    format += "\"";

    // Loop over the write arguments.
    for (PascalParser::WriteArgumentContext *argCtx : argsCtx->writeArgument())
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

            PascalParser::FieldWidthContext *fwCtx = argCtx->fieldWidth();
            if (fwCtx != nullptr)
            {
                string sign = (   (fwCtx->sign() != nullptr)
                               && (fwCtx->sign()->getText() == "-")) ? "-" : "";
                format += sign + fwCtx->integerConstant()->getText();

                PascalParser::DecimalPlacesContext *dpCtx =
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
                    PascalParser::WriteArgumentsContext *argsCtx, int exprCount)
{
    // Create the arguments array.
    emitLoadConstant(exprCount);
    emit(ANEWARRAY, "java/lang/Object");

    int index = 0;

    // Loop over the write arguments to fill the arguments array.
    for (PascalParser::WriteArgumentContext *argCtx :
                                                argsCtx->writeArgument())
    {
        string argText = argCtx->getText();
        PascalParser::ExpressionContext *exprCtx = argCtx->expression();
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

void StatementGenerator::emitRead(PascalParser::ReadStatementContext *ctx)
{
    emitRead(ctx->readArguments(), false);
}

void StatementGenerator::emitReadln(PascalParser::ReadlnStatementContext *ctx)
{
    emitRead(ctx->readArguments(), true);
}

void StatementGenerator::emitRead(PascalParser::ReadArgumentsContext *argsCtx,
                                  bool needSkip)
{
    int size = argsCtx->variable().size();

    // Loop over read arguments.
    for (int i = 0; i < size; i++)
    {
        PascalParser::VariableContext *varCtx = argsCtx->variable()[i];
        Typespec *varType = varCtx->type;

        if (varType == Predefined::integerType)
        {
            emit(GETSTATIC, programName + "/_sysin Ljava/util/Scanner;");
            emit(INVOKEVIRTUAL, "java/util/Scanner/nextInt()I");
            emitStoreValue(varCtx->entry, nullptr);
        }
        else if (varType == Predefined::realType)
        {
            emit(GETSTATIC, programName + "/_sysin Ljava/util/Scanner;");
            emit(INVOKEVIRTUAL, "java/util/Scanner/nextFloat()F");
            emitStoreValue(varCtx->entry, nullptr);
        }
        else if (varType == Predefined::booleanType)
        {
            emit(GETSTATIC, programName + "/_sysin Ljava/util/Scanner;");
            emit(INVOKEVIRTUAL, "java/util/Scanner/nextBoolean()Z");
            emitStoreValue(varCtx->entry, nullptr);
        }
        else if (varType == Predefined::charType)
        {
            emit(GETSTATIC, programName + "/_sysin Ljava/util/Scanner;");
            emit(LDC, "\"\"");
            emit(INVOKEVIRTUAL,
                 string("java/util/Scanner/useDelimiter(Ljava/lang/String;)") +
                 string("Ljava/util/Scanner;"));
            emit(POP);
            emit(GETSTATIC, programName + "/_sysin Ljava/util/Scanner;");
            emit(INVOKEVIRTUAL, "java/util/Scanner/next()Ljava/lang/String;");
            emit(ICONST_0);
            emit(INVOKEVIRTUAL, "java/lang/String/charAt(I)C");
            emitStoreValue(varCtx->entry, nullptr);

            emit(GETSTATIC, programName + "/_sysin Ljava/util/Scanner;");
            emit(INVOKEVIRTUAL, "java/util/Scanner/reset()Ljava/util/Scanner;");

        }
        else  // string
        {
            emit(GETSTATIC, programName + "/_sysin Ljava/util/Scanner;");
            emit(INVOKEVIRTUAL, "java/util/Scanner/next()Ljava/lang/String;");
            emitStoreValue(varCtx->entry, nullptr);
        }
    }

    // READLN: Skip the rest of the input line.
    if (needSkip)
    {
        emit(GETSTATIC, programName + "/_sysin Ljava/util/Scanner;");
        emit(INVOKEVIRTUAL, "java/util/Scanner/nextLine()Ljava/lang/String;");
        emit(POP);
    }
}

}} // namespace backend::compiler
