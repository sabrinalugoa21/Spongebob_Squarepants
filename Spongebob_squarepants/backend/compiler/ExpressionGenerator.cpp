#include "Spongebob_SquarepantsBaseVisitor.h"
#include "Includes/usr/local/include/antlr4-runtime/antlr4-runtime.h"

#include "intermediate/symbtab/Predefined.h"
#include "intermediate/type/Typespec.h"
#include "CodeGenerator.h"
#include "ExpressionGenerator.h"
#include "Compiler.h"

namespace backend { namespace compiler {

void ExpressionGenerator::emitExpression(Spongebob_SquarepantsParser::ExpressionContext *ctx)
{
	Spongebob_SquarepantsParser::SimpleExpressionContext *simpleCtx1 =
                                            ctx->simpleExpression()[0];
	Spongebob_SquarepantsParser::RelOpContext *relOpCtx = ctx->relOp();
    Typespec *type1 = simpleCtx1->type;
    emitSimpleExpression(simpleCtx1);

    // More than one simple expression?
    if (relOpCtx != nullptr)
    {
        string op = relOpCtx->getText();
        Spongebob_SquarepantsParser::SimpleExpressionContext *simpleCtx2 =
                                            ctx->simpleExpression()[1];
        Typespec *type2 = simpleCtx2->type;

        bool integerMode   = false;
        bool realMode      = false;
        bool characterMode = false;

        if (   (type1 == Predefined::integerType)
            && (type2 == Predefined::integerType))
        {
            integerMode = true;
        }
        else if (   (type1 == Predefined::realType)
                 || (type2 == Predefined::realType))
        {
            realMode = true;
        }
        else if (   (type1 == Predefined::charType)
                 && (type2 == Predefined::charType))
        {
            characterMode = true;
        }

        Label *trueLabel = new Label();
        Label *exitLabel = new Label();

        if (integerMode || characterMode)
        {
            emitSimpleExpression(simpleCtx2);

            if      (op == "=" ) emit(IF_ICMPEQ, trueLabel);
            else if (op == "<>") emit(IF_ICMPNE, trueLabel);
            else if (op == "<" ) emit(IF_ICMPLT, trueLabel);
            else if (op == "<=") emit(IF_ICMPLE, trueLabel);
            else if (op == ">" ) emit(IF_ICMPGT, trueLabel);
            else if (op == ">=") emit(IF_ICMPGE, trueLabel);
        }
        else if (realMode)
        {
            if (type1 == Predefined::integerType) emit(I2F);
            emitSimpleExpression(simpleCtx2);
            if (type2 == Predefined::integerType) emit(I2F);

            emit(FCMPG);

            if      (op == "=" ) emit(IFEQ, trueLabel);
            else if (op == "<>") emit(IFNE, trueLabel);
            else if (op == "<" ) emit(IFLT, trueLabel);
            else if (op == "<=") emit(IFLE, trueLabel);
            else if (op == ">" ) emit(IFGT, trueLabel);
            else if (op == ">=") emit(IFGE, trueLabel);
        }
        else  // stringMode
        {
            emitSimpleExpression(simpleCtx2);
            emit(INVOKEVIRTUAL,
                 "java/lang/String.compareTo(Ljava/lang/String;)I");
            localStack->decrease(1);

            if      (op == "=" ) emit(IFEQ, trueLabel);
            else if (op == "<>") emit(IFNE, trueLabel);
            else if (op == "<" ) emit(IFLT, trueLabel);
            else if (op == "<=") emit(IFLE, trueLabel);
            else if (op == ">" ) emit(IFGT, trueLabel);
            else if (op == ">=") emit(IFGE, trueLabel);
        }

        emit(ICONST_0); // false
        emit(GOTO, exitLabel);
        emitLabel(trueLabel);
        emit(ICONST_1); // true
        emitLabel(exitLabel);

        localStack->decrease(1);  // only one branch will be taken
    }
}

void ExpressionGenerator::emitSimpleExpression(Spongebob_SquarepantsParser::SimpleExpressionContext *ctx)
{
    int count = ctx->term().size();
    bool negate =    (ctx->sign() != nullptr)
                  && (ctx->sign()->getText() == "-");

    // First term.
    Spongebob_SquarepantsParser::TermContext *termCtx1 = ctx->term()[0];
    Typespec *type1 = termCtx1->type;
    emitTerm(termCtx1);

    if (negate) emit(type1 == Predefined::integerType ? INEG : FNEG);

    // Loop over the subsequent terms.
    for (int i = 1; i < count; i++)
    {
        string op = toLowerCase(ctx->addOp()[i-1]->getText());
        Spongebob_SquarepantsParser::TermContext *termCtx2 = ctx->term()[i];
        Typespec *type2 = termCtx2->type;

        bool integerMode = false;
        bool realMode    = false;
        bool booleanMode = false;

        if (   (type1 == Predefined::integerType)
            && (type2 == Predefined::integerType))
        {
            integerMode = true;
        }
        else if (   (type1 == Predefined::realType)
                 || (type2 == Predefined::realType))
        {
            realMode = true;
        }
        else if (   (type1 == Predefined::booleanType)
                 && (type2 == Predefined::booleanType))
        {
            booleanMode = true;
        }

        if (integerMode)
        {
            emitTerm(termCtx2);

            if (op == "+") emit(IADD);
            else           emit(ISUB);
//            localStack->decrease(1);
        }
        else if (realMode)
        {
            if (type1 == Predefined::integerType) emit(I2F);
            emitTerm(termCtx2);
            if (type2 == Predefined::integerType) emit(I2F);

            if (op == "+") emit(FADD);
            else           emit(FSUB);
        }
        else if (booleanMode)
        {
            emitTerm(termCtx2);
            emit(IOR);
        }
        else  // stringMode
        {
            emit(NEW, "java/lang/StringBuilder");
            emit(DUP_X1);
            emit(SWAP);
            emit(INVOKESTATIC,
                 string("java/lang/String/valueOf(Ljava/lang/Object;)") +
                 string("Ljava/lang/String;"));
            emit(INVOKESPECIAL,
                 string("java/lang/StringBuilder/<init>") +
                 string("(Ljava/lang/String;)V"));
            localStack->decrease(1);

            emitTerm(termCtx2);
            emit(INVOKEVIRTUAL,
                 string("java/lang/StringBuilder/append(Ljava/lang/String;)") +
                 string("Ljava/lang/StringBuilder;"));
            localStack->decrease(1);
            emit(INVOKEVIRTUAL,
                 string("java/lang/StringBuilder/toString()") +
                 string("Ljava/lang/String;"));
            localStack->decrease(1);
        }
    }
}

void ExpressionGenerator::emitTerm(Spongebob_SquarepantsParser::TermContext *ctx)
{
    int count = ctx->factor().size();

    // First factor.
    Spongebob_SquarepantsParser::FactorContext *factorCtx1 = ctx->factor()[0];
    Typespec *type1 = factorCtx1->type;
    compiler->visit(factorCtx1);

    // Loop over the subsequent factors.
    for (int i = 1; i < count; i++)
    {
        string op = toLowerCase(ctx->mulOp()[i-1]->getText());
        Spongebob_SquarepantsParser::FactorContext *factorCtx2 = ctx->factor()[i];
        Typespec *type2 = factorCtx2->type;

        bool integerMode = false;
        bool realMode    = false;

        if (   (type1 == Predefined::integerType)
            && (type2 == Predefined::integerType))
        {
            integerMode = true;
        }
        else if (   (type1 == Predefined::realType)
                 || (type2 == Predefined::realType))
        {
            realMode = true;
        }

        if (integerMode)
        {
            compiler->visit(factorCtx2);

            if      (op == "*")   emit(IMUL);
            else if (op == "/")   emit(FDIV);
            else if (op == "div") emit(IDIV);
            else if (op == "mod") emit(IREM);
        }
        else if (realMode)
        {
            if (type1 == Predefined::integerType) emit(I2F);
            compiler->visit(factorCtx2);
            if (type2 == Predefined::integerType) emit(I2F);

            if      (op == "*") emit(FMUL);
            else if (op == "/") emit(FDIV);
        }
        else  // booleanMode
        {
            compiler->visit(factorCtx2);
            emit(IAND);
        }
    }
}

void ExpressionGenerator::emitNotFactor(Spongebob_SquarepantsParser::NotFactorContext *ctx)
{
    compiler->visit(ctx->factor());
    emit(ICONST_1);
    emit(IXOR);
}

void ExpressionGenerator::emitLoadValue(Spongebob_SquarepantsParser::VariableContext *varCtx)
{
    // Load the scalar value or structure address.
    Typespec *variableType = emitLoadVariable(varCtx);
}

Typespec *ExpressionGenerator::emitLoadVariable(
		Spongebob_SquarepantsParser::VariableContext *varCtx)
{
    SymtabEntry *variableId = varCtx->entry;
    Typespec *variableType = variableId->getType();

    // Scalar value or structure address.
    CodeGenerator::emitLoadValue(variableId);  // why need CodeGenerator::?

    return variableType;
}

void ExpressionGenerator::emitLoadIntegerConstant(Spongebob_SquarepantsParser::NumberContext *intCtx)
{
    int value = stoi(intCtx->getText());
    emitLoadConstant(value);
}

void ExpressionGenerator::emitLoadRealConstant(Spongebob_SquarepantsParser::NumberContext *realCtx)
{
    float value = stof(realCtx->getText());
    emitLoadConstant(value);
}

}} // namespace backend::compiler
