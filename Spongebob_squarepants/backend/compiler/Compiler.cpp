#include "intermediate/symbtab/Predefined.h"
#include "Compiler.h"

namespace backend { namespace compiler {

Object Compiler::visitProgram(Spongebob_SquarepantsParser::ProgramContext *ctx)
{
    createNewGenerators(code);
    programCode->emitProgram(ctx);
    return nullptr;
}

Object Compiler::visitRoutineDefinition(
		Spongebob_SquarepantsParser::RoutineDefinitionContext *ctx)
{
    createNewGenerators(programCode);
    programCode->emitRoutine(ctx);
    return nullptr;
}

Object Compiler::visitStatement(Spongebob_SquarepantsParser::StatementContext *ctx)
{
    if (   (ctx->compoundStatement() == nullptr)
        && (ctx->emptyStatement() == nullptr))
    {
        statementCode->emitComment(ctx);
    }

    return visitChildren(ctx);
}

Object Compiler::visitAssignmentStatement(
		Spongebob_SquarepantsParser::AssignmentStatementContext *ctx)
{
    statementCode->emitAssignment(ctx);
    return nullptr;
}

Object Compiler::visitIfStatement(Spongebob_SquarepantsParser::IfStatementContext *ctx)
{
    statementCode->emitIf(ctx);
    return nullptr;
}

Object Compiler::visitWhileStatement(Spongebob_SquarepantsParser::WhileStatementContext *ctx)
{
    statementCode->emitWhile(ctx);
    return nullptr;
}


Object Compiler::visitExpression(Spongebob_SquarepantsParser::ExpressionContext *ctx)
{
    expressionCode->emitExpression(ctx);
    return nullptr;
}

Object Compiler::visitVariableFactor(Spongebob_SquarepantsParser::VariableFactorContext *ctx)
{
    expressionCode->emitLoadValue(ctx->variable());
    return nullptr;
}

Object Compiler::visitVariable(Spongebob_SquarepantsParser::VariableContext *ctx)
{
    expressionCode->emitLoadVariable(ctx);
    return nullptr;
}

Object Compiler::visitNumberFactor(Spongebob_SquarepantsParser::NumberFactorContext *ctx)
{
    if (ctx->type == Predefined::integerType)
    {
        expressionCode->emitLoadIntegerConstant(ctx->number());
    }
    else
    {
        expressionCode->emitLoadRealConstant(ctx->number());
    }

    return nullptr;
}

Object Compiler::visitCharacterFactor(Spongebob_SquarepantsParser::CharacterFactorContext *ctx)
{
    char ch = ctx->getText()[1];
    expressionCode->emitLoadConstant(ch);

    return nullptr;
}

Object Compiler::visitStringFactor(Spongebob_SquarepantsParser::StringFactorContext *ctx)
{
    string jasminString = convertString(ctx->getText(), true);
    expressionCode->emitLoadConstant(jasminString);

    return nullptr;
}

Object Compiler::visitNotFactor(Spongebob_SquarepantsParser::NotFactorContext *ctx)
{
    expressionCode->emitNotFactor(ctx);
    return nullptr;
}

Object Compiler::visitParenthesizedFactor(Spongebob_SquarepantsParser::ParenthesizedFactorContext *ctx)
{
    return visit(ctx->expression());
}

Object Compiler::visitWriteStatement(Spongebob_SquarepantsParser::WriteStatementContext *ctx)
{
    statementCode->emitWrite(ctx);
    return nullptr;
}

Object Compiler::visitWritelnStatement(Spongebob_SquarepantsParser::WritelnStatementContext *ctx)
{
    statementCode->emitWriteln(ctx);
    return nullptr;
}


}}  // namespace backend::compiler
