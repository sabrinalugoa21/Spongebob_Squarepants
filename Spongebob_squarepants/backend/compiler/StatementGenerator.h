#ifndef STATEMENTGENERATOR_H_
#define STATEMENTGENERATOR_H_

#include <vector>
#include <map>

#include "CodeGenerator.h"

namespace backend { namespace compiler {

using namespace std;

class StatementGenerator : public CodeGenerator
{
public:
    /**
     * Constructor.
     * @param parent the parent code generator.
     * @param compiler the compiler to use.
     */
    StatementGenerator(CodeGenerator *parent, Compiler *compiler)
        : CodeGenerator(parent, compiler) {}

    /**
     * Emit code for an assignment statement.
     * @param ctx the AssignmentStatementContext.
     */
    void emitAssignment(Spongebob_SquarepantsParser::AssignmentStatementContext *ctx);

    /**
     * Emit code for an IF statement.
     * @param ctx the IfStatementContext.
     */
    void emitIf(Spongebob_SquarepantsParser::IfStatementContext *ctx);

    /**
     * Emit code for a WHILE statement.
     * @param ctx the WhileStatementContext.
     */
    void emitWhile(Spongebob_SquarepantsParser::WhileStatementContext *ctx);

    /**
     * Emit code for a FOR statement.
     * @param ctx the ForStatementContext.
     */
    void emitFor(Spongebob_SquarepantsParser::ForStatementContext *ctx);

    /**
     * Emit code for a procedure call statement.
     * @param ctx the ProcedureCallStatementContext.
     */
    void emitProcedureCall(Spongebob_SquarepantsParser::ProcedureCallStatementContext *ctx);

    /**
     * Emit code for a function call statement.
     * @param ctx the FunctionCallContext.
     */
    void emitFunctionCall(Spongebob_SquarepantsParser::FunctionCallContext *ctx);

    /**
     * Emit code for a WRITE statement.
     * @param ctx the WriteStatementContext.
     */
    void emitWrite(Spongebob_SquarepantsParser::WriteStatementContext *ctx);

    /**
     * Emit code for a WRITELN statement.
     * @param ctx the WritelnStatementContext.
     */
    void emitWriteln(Spongebob_SquarepantsParser::WritelnStatementContext *ctx);

    /**
     * Emit code for a READ statement.
     * @param ctx the ReadStatementContext.
     */
    void emitRead(Spongebob_SquarepantsParser::ReadStatementContext *ctx);

    /**
     * Emit code for a READLN statement.
     * @param ctx the ReadlnStatementContext.
     */
    void emitReadln(Spongebob_SquarepantsParser::ReadlnStatementContext *ctx);

private:

    /**
     * Emit code for the LOOKUPSWITCH instruction.
     * @param entries the table entries.
     * @param branchLabels the branch labels.
     */
    void emitLookupSwitch(map<int, Label *> *labelMap,
                          vector<Label *>& branchLabels);

    /**
     * Emit code for a call to WRITE or WRITELN.
     * @param argsCtx the WriteArgumentsContext.
     * @param needLF true if need a line feed.
     */
    void emitWrite(Spongebob_SquarepantsParser::WriteArgumentsContext *argsCtx, bool needLF);

    /**
     * Create the printf format string.
     * @param argsCtx the WriteArgumentsContext.
     * @param format the format string to create.
     * @return the count of expression arguments.
     */
    int createWriteFormat(Spongebob_SquarepantsParser::WriteArgumentsContext *argsCtx,
                          string& format, bool needLF);

    /**
     * Emit the printf arguments array.
     * @param argsCtx
     * @param exprCount
     */
    void emitArgumentsArray(Spongebob_SquarepantsParser::WriteArgumentsContext *argsCtx,
                            int exprCount);

    /**
     * Generate code for a call to READ or READLN.
     * @param argsCtx the ReadArgumentsContext.
     * @param needSkip true if need to skip the rest of the input line.
     */
    void emitRead(Spongebob_SquarepantsParser::ReadArgumentsContext *argsCtx, bool needSkip);
};

}} // namespace backend::compiler

#endif /* STATEMENTGENERATOR_H_ */
