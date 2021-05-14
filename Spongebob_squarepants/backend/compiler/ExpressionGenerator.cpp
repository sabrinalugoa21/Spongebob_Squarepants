#include "PascalBaseVisitor.h"
#include "antlr4-runtime.h"

#include "intermediate/symtab/Predefined.h"
#include "intermediate/type/Typespec.h"
#include "CodeGenerator.h"
#include "ExpressionGenerator.h"
#include "Compiler.h"

namespace backend { namespace compiler {

void ExpressionGenerator::emitExpression(PascalParser::ExpressionContext *ctx)
{
    PascalParser::SimpleExpressionContext *simpleCtx1 =
                                            ctx->simpleExpression()[0];
    PascalParser::RelOpContext *relOpCtx = ctx->relOp();
    Typespec *type1 = simpleCtx1->type;
    emitSimpleExpression(simpleCtx1);

    // More than one simple expression?
    if (relOpCtx != nullptr)
    {
        string op = relOpCtx->getText();
        PascalParser::SimpleExpressionContext *simpleCtx2 =
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

void ExpressionGenerator::emitSimpleExpression(PascalParser::SimpleExpressionContext *ctx)
{
    int count = ctx->term().size();
    bool negate =    (ctx->sign() != nullptr)
                  && (ctx->sign()->getText() == "-");

    // First term.
    PascalParser::TermContext *termCtx1 = ctx->term()[0];
    Typespec *type1 = termCtx1->type;
    emitTerm(termCtx1);

    if (negate) emit(type1 == Predefined::integerType ? INEG : FNEG);

    // Loop over the subsequent terms.
    for (int i = 1; i < count; i++)
    {
        string op = toLowerCase(ctx->addOp()[i-1]->getText());
        PascalParser::TermContext *termCtx2 = ctx->term()[i];
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

void ExpressionGenerator::emitTerm(PascalParser::TermContext *ctx)
{
    int count = ctx->factor().size();

    // First factor.
    PascalParser::FactorContext *factorCtx1 = ctx->factor()[0];
    Typespec *type1 = factorCtx1->type;
    compiler->visit(factorCtx1);

    // Loop over the subsequent factors.
    for (int i = 1; i < count; i++)
    {
        string op = toLowerCase(ctx->mulOp()[i-1]->getText());
        PascalParser::FactorContext *factorCtx2 = ctx->factor()[i];
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

void ExpressionGenerator::emitNotFactor(PascalParser::NotFactorContext *ctx)
{
    compiler->visit(ctx->factor());
    emit(ICONST_1);
    emit(IXOR);
}

void ExpressionGenerator::emitLoadValue(PascalParser::VariableContext *varCtx)
{
    // Load the scalar value or structure address.
    Typespec *variableType = emitLoadVariable(varCtx);

    // Load an array element's or record field's value.
    int modifierCount = varCtx->modifier().size();
    if (modifierCount > 0)
    {
        PascalParser::ModifierContext *lastModCtx =
                                        varCtx->modifier()[modifierCount - 1];

        if (lastModCtx->indexList() != nullptr)
        {
            emitLoadArrayElementValue(variableType);
        }
        else
        {
            emitLoadRecordFieldValue(lastModCtx->field(), variableType);
        }
    }
}

Typespec *ExpressionGenerator::emitLoadVariable(
                                        PascalParser::VariableContext *varCtx)
{
    SymtabEntry *variableId = varCtx->entry;
    Typespec *variableType = variableId->getType();
    int modifierCount = varCtx->modifier().size();

    // Scalar value or structure address.
    CodeGenerator::emitLoadValue(variableId);  // why need CodeGenerator::?

    // Loop over subscript and field modifiers.
    for (int i = 0; i < modifierCount; ++i)
    {
        PascalParser::ModifierContext *modCtx = varCtx->modifier()[i];
        bool lastModifier = i == modifierCount - 1;

        // Subscript
        if (modCtx->indexList() != nullptr)
        {
            variableType = emitLoadArrayElementAccess(
                            modCtx->indexList(), variableType, lastModifier);
        }

        // Field
        else if (!lastModifier)
        {
            variableType = emitLoadRecordField(modCtx->field(), variableType);
        }
    }

    return variableType;
}

Typespec *ExpressionGenerator::emitLoadArrayElementAccess(
                                PascalParser::IndexListContext *indexListCtx,
                                Typespec *elmtType, bool lastModifier)
{
    int indexCount = indexListCtx->index().size();

    // Loop over the subscripts.
    for (int i = 0; i < indexCount; i++)
    {
        PascalParser::IndexContext *indexCtx = indexListCtx->index()[i];
        emitExpression(indexCtx->expression());

        Typespec *indexType = elmtType->getArrayIndexType();

        if (indexType->getForm() == SUBRANGE)
        {
            int min = indexType->getSubrangeMinValue();
            if (min != 0)
            {
                emitLoadConstant(min);
                emit(ISUB);
            }
        }

        if (!lastModifier || (i < indexCount - 1)) emit(AALOAD);
        elmtType = elmtType->getArrayElementType();
    }

    return elmtType;
}

void ExpressionGenerator::emitLoadArrayElementValue(Typespec *elmtType)
{
    Form form = SCALAR;

    if (elmtType != nullptr)
    {
        elmtType = elmtType->baseType();
        form = elmtType->getForm();
    }

    // Load a character from a string.
    if (elmtType == Predefined::charType)
    {
        emit(INVOKEVIRTUAL, "java/lang/StringBuilder.charAt(I)C");
    }

    // Load an array element.
    else
    {
        emit(  elmtType == Predefined::integerType ? IALOAD
             : elmtType == Predefined::realType    ? FALOAD
             : elmtType == Predefined::booleanType ? BALOAD
             : elmtType == Predefined::charType    ? CALOAD
             : form == ENUMERATION                 ? IALOAD
             :                                       AALOAD);
    }
}

void ExpressionGenerator::emitLoadRecordFieldValue(
                    PascalParser::FieldContext *fieldCtx, Typespec *recordType)
{
    emitLoadRecordField(fieldCtx, recordType);
}

Typespec *ExpressionGenerator::emitLoadRecordField(
                    PascalParser::FieldContext *fieldCtx, Typespec *recordType)
{
    SymtabEntry *fieldId = fieldCtx->entry;
    string fieldName = fieldId->getName();
    Typespec *fieldType = fieldCtx->type;

    string recordTypePath = recordType->getRecordTypePath();
    string fieldPath = recordTypePath + "/" + fieldName;
    emit(GETFIELD, fieldPath, typeDescriptor(fieldType));

    return fieldType;
}

void ExpressionGenerator::emitLoadIntegerConstant(PascalParser::NumberContext *intCtx)
{
    int value = stoi(intCtx->getText());
    emitLoadConstant(value);
}

void ExpressionGenerator::emitLoadRealConstant(PascalParser::NumberContext *realCtx)
{
    float value = stof(realCtx->getText());
    emitLoadConstant(value);
}

}} // namespace backend::compiler
