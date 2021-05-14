#include "intermediate/symtab/Predefined.h"
#include "Compiler.h"

namespace backend { namespace compiler {

Object Compiler::visitProgram(PascalParser::ProgramContext *ctx)
{
    createNewGenerators(code);
    programCode->emitProgram(ctx);
    return nullptr;
}

Object Compiler::visitRoutineDefinition(
                                PascalParser::RoutineDefinitionContext *ctx)
{
    createNewGenerators(programCode);
    programCode->emitRoutine(ctx);
    return nullptr;
}

Object Compiler::visitStatement(PascalParser::StatementContext *ctx)
{
    if (   (ctx->compoundStatement() == nullptr)
        && (ctx->emptyStatement() == nullptr))
    {
        statementCode->emitComment(ctx);
    }

    return visitChildren(ctx);
}

Object Compiler::visitAssignmentStatement(
                                PascalParser::AssignmentStatementContext *ctx)
{
    statementCode->emitAssignment(ctx);
    return nullptr;
}

Object Compiler::visitIfStatement(PascalParser::IfStatementContext *ctx)
{
    statementCode->emitIf(ctx);
    return nullptr;
}

Object Compiler::visitCaseStatement(PascalParser::CaseStatementContext *ctx)
{
    statementCode->emitCase(ctx);
    return nullptr;
}

Object Compiler::visitRepeatStatement(PascalParser::RepeatStatementContext *ctx)
{
    statementCode->emitRepeat(ctx);
    return nullptr;
}

Object Compiler::visitWhileStatement(PascalParser::WhileStatementContext *ctx)
{
    statementCode->emitWhile(ctx);
    return nullptr;
}

Object Compiler::visitForStatement(PascalParser::ForStatementContext *ctx)
{
    statementCode->emitFor(ctx);
    return nullptr;
}

Object Compiler::visitProcedureCallStatement(
                            PascalParser::ProcedureCallStatementContext *ctx)
{
    statementCode->emitProcedureCall(ctx);
    return nullptr;
}

Object Compiler::visitExpression(PascalParser::ExpressionContext *ctx)
{
    expressionCode->emitExpression(ctx);
    return nullptr;
}

Object Compiler::visitVariableFactor(PascalParser::VariableFactorContext *ctx)
{
    expressionCode->emitLoadValue(ctx->variable());
    return nullptr;
}

Object Compiler::visitVariable(PascalParser::VariableContext *ctx)
{
    expressionCode->emitLoadVariable(ctx);
    return nullptr;
}

Object Compiler::visitNumberFactor(PascalParser::NumberFactorContext *ctx)
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

Object Compiler::visitCharacterFactor(PascalParser::CharacterFactorContext *ctx)
{
    char ch = ctx->getText()[1];
    expressionCode->emitLoadConstant(ch);

    return nullptr;
}

Object Compiler::visitStringFactor(PascalParser::StringFactorContext *ctx)
{
    string jasminString = convertString(ctx->getText(), true);
    expressionCode->emitLoadConstant(jasminString);

    return nullptr;
}

Object Compiler::visitFunctionCallFactor(
                                PascalParser::FunctionCallFactorContext *ctx)
{
    statementCode->emitFunctionCall(ctx->functionCall());
    return nullptr;
}

Object Compiler::visitNotFactor(PascalParser::NotFactorContext *ctx)
{
    expressionCode->emitNotFactor(ctx);
    return nullptr;
}

Object Compiler::visitParenthesizedFactor(
                                PascalParser::ParenthesizedFactorContext *ctx)
{
    return visit(ctx->expression());
}

Object Compiler::visitWriteStatement(PascalParser::WriteStatementContext *ctx)
{
    statementCode->emitWrite(ctx);
    return nullptr;
}

Object Compiler::visitWritelnStatement(PascalParser::WritelnStatementContext *ctx)
{
    statementCode->emitWriteln(ctx);
    return nullptr;
}

Object Compiler::visitReadStatement(PascalParser::ReadStatementContext *ctx)
{
    statementCode->emitRead(ctx);
    return nullptr;
}

Object Compiler::visitReadlnStatement(PascalParser::ReadlnStatementContext *ctx)
{
    statementCode->emitReadln(ctx);
    return nullptr;
}

}}  // namespace backend::compiler
