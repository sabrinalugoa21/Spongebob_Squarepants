#ifndef COMPILER_H_
#define COMPILER_H_

#include "Spongebob_SquarepantsBaseVisitor.h"
#include "antlr4-runtime.h"

#include "intermediate/symbtab/SymtabStack.h"
#include "intermediate/symbtab/SymtabEntry.h"
#include "intermediate/type/Typespec.h"
#include "ProgramGenerator.h"
#include "StatementGenerator.h"
#include "ExpressionGenerator.h"

namespace backend { namespace compiler {

using namespace std;
using namespace intermediate::symtab;
using namespace intermediate::type;

class CodeGenerator;

class Compiler : public Spongebob_SquarepantsBaseVisitor
{
private:
    SymtabEntry *programId;  // symbol table entry of the program name
    string programName;      // the program name

    CodeGenerator       *code;            // base code generator
    ProgramGenerator    *programCode;     // program code generator
    StatementGenerator  *statementCode;   // statement code generator
    ExpressionGenerator *expressionCode;  // expression code generator

public:
    /**
     * Constructor for the base compiler.
     * @param programId the symtab entry for the program name.
     */
    Compiler(SymtabEntry *programId)
        : programId(programId), programName(programId->getName()),
          code(new CodeGenerator(programName, "j", this)),
          programCode(nullptr), statementCode(nullptr),
          expressionCode(nullptr) {}

    /**
     * Constructor for child compilers of procedures and functions.
     * @param parent the parent compiler.
     */
    Compiler(Compiler *parent)
        : programId(parent->programId), programName(parent->programName),
          code(parent->code), programCode(parent->programCode),
          statementCode(nullptr), expressionCode(nullptr) {}

    /**
     * Get the name of the object (Jasmin) file.
     * @return the file name.
     */
    string getObjectFileName() { return code->getObjectFileName(); }

    Object visitProgram(Spongebob_SquarepantsParser::ProgramContext *ctx) override;
    Object visitRoutineDefinition(Spongebob_SquarepantsParser::RoutineDefinitionContext *ctx) override;
    Object visitStatement(Spongebob_SquarepantsParser::StatementContext *ctx) override;
    Object visitAssignmentStatement(Spongebob_SquarepantsParser::AssignmentStatementContext *ctx) override;
    Object visitIfStatement(Spongebob_SquarepantsParser::IfStatementContext *ctx) override;
    Object visitWhileStatement(Spongebob_SquarepantsParserr::WhileStatementContext *ctx) override;
    Object visitExpression(Spongebob_SquarepantsParser::ExpressionContext *ctx) override;
    Object visitVariableFactor(Spongebob_SquarepantsParser::VariableFactorContext *ctx) override;
    Object visitVariable(Spongebob_SquarepantsParser::VariableContext *ctx) override;
    Object visitNumberFactor(Spongebob_SquarepantsParser::NumberFactorContext *ctx) override;
    Object visitCharacterFactor(Spongebob_SquarepantsParser::CharacterFactorContext *ctx) override;
    Object visitStringFactor(Spongebob_SquarepantsParser::StringFactorContext *ctx) override;
    Object visitNotFactor(Spongebob_SquarepantsParser::NotFactorContext *ctx) override;
    Object visitParenthesizedFactor(Spongebob_SquarepantsParser::ParenthesizedFactorContext *ctx) override;
    Object visitWriteStatement(Spongebob_SquarepantsParser::WriteStatementContext *ctx) override;
    Object visitWritelnStatement(Spongebob_SquarepantsParser::WritelnStatementContext *ctx) override;
private:
    /**
     * Create new child code generators.
     * @param parentGenerator the parent code generator.
     */
    void createNewGenerators(CodeGenerator *parentGenerator)
    {
        programCode    = new ProgramGenerator(parentGenerator, this);
        statementCode  = new StatementGenerator(programCode, this);
        expressionCode = new ExpressionGenerator(programCode, this);
    }
};

}}  // namespace backend::compiler

#endif /* COMPILER_H_ */
