#ifndef SEMANTICS_H_
#define SEMANTICS_H_

#include <map>

#include "PascalBaseVisitor.h"
#include "antlr4-runtime.h"

#include "intermediate/symtab/SymtabStack.h"
#include "intermediate/symtab/SymtabEntry.h"
#include "intermediate/symtab/Predefined.h"
#include "intermediate/type/Typespec.h"
#include "intermediate/util/BackendMode.h"
#include "SemanticErrorHandler.h"

namespace frontend {

using namespace std;
using namespace intermediate::symtab;
using namespace intermediate::type;

class Semantics : public PascalBaseVisitor
{
private:
    BackendMode mode;
    SymtabStack *symtabStack;
    SymtabEntry *programId;
    SemanticErrorHandler error;

    map<string, Typespec *> *typeTable;

    /**
     * Return the number of values in a datatype.
     * @param type the datatype.
     * @return the number of values.
     */
    int typeCount(Typespec *type);

    /**
     * Determine whether or not an expression is a variable only.
     * @param exprCtx the ExpressionContext.
     * @return true if it's an expression only, else false.
     */
    bool expressionIsVariable(PascalParser::ExpressionContext *exprCtx);

    /**
     * Perform semantic operations on procedure and function call arguments.
     * @param listCtx the ArgumentListContext.
     * @param parameters the vector of parameters to fill.
     */
    void checkCallArguments(PascalParser::ArgumentListContext *listCtx,
                            vector<SymtabEntry *> *parms);

    /**
     * Determine the datatype of a variable that can have modifiers.
     * @param varCtx the VariableContext.
     * @param varType the variable's datatype without the modifiers.
     * @return the datatype with any modifiers.
     */
    Typespec *variableDatatype(PascalParser::VariableContext *varCtx,
                               Typespec *varType);

    /**
     * Create a new record type.
     * @param recordTypeSpecCtx the RecordTypespecContext.
     * @param recordTypeName the name of the record type.
     * @return the symbol table entry of the record type identifier.
     */
    SymtabEntry *createRecordType(
                        PascalParser::RecordTypespecContext *recordTypeSpecCtx,
                        string recordTypeName);

    /**
     * Create the fully qualified type pathname of a record type.
     * @param recordType the record type.
     * @return the pathname.
     */
    string createRecordTypePath(Typespec *recordType);

    /**
     * Create the symbol table for a record type.
     * @param ctx the RecordFieldsContext,
     * @param ownerId the symbol table entry of the owner's identifier.
     * @return the symbol table.
     */
    Symtab *createRecordSymtab(
                PascalParser::RecordFieldsContext *ctx, SymtabEntry *ownerId);

public:
    Semantics(BackendMode mode) : mode(mode), programId(nullptr)
    {
        // Create and initialize the symbol table stack.
        symtabStack = new SymtabStack();
        Predefined::initialize(symtabStack);

        typeTable = new map<string, Typespec *>();
        (*typeTable)["integer"] = Predefined::integerType;
        (*typeTable)["real"]    = Predefined::realType;
        (*typeTable)["boolean"] = Predefined::booleanType;
        (*typeTable)["char"]    = Predefined::charType;
        (*typeTable)["string"]  = Predefined::stringType;
    }

    /**
     * Get the symbol table entry of the program identifier.
     * @return the entry.
     */
    SymtabEntry *getProgramId() { return programId; }

    /**
     * Get the count of semantic errors.
     * @return the count.
     */
    int getErrorCount() const { return error.getCount(); }

    /**
     * Return the default value for a given datatype.
     * @param type the datatype.
     */
    static Object defaultValue(Typespec *type);

    Object visitProgram(PascalParser::ProgramContext *ctx) override;
    Object visitProgramHeader(PascalParser::ProgramHeaderContext *ctx) override;
    Object visitConstantDefinition(PascalParser::ConstantDefinitionContext *ctx) override;
    Object visitConstant(PascalParser::ConstantContext *ctx) override;
    Object visitTypeDefinition(PascalParser::TypeDefinitionContext *ctx) override;
    Object visitRecordTypespec(PascalParser::RecordTypespecContext *ctx) override;
    Object visitSimpleTypespec(PascalParser::SimpleTypespecContext *ctx) override;
    Object visitTypeIdentifierTypespec(PascalParser::TypeIdentifierTypespecContext *ctx) override;
    Object visitTypeIdentifier(PascalParser::TypeIdentifierContext *ctx) override;
    Object visitEnumerationTypespec(PascalParser::EnumerationTypespecContext *ctx) override;
    Object visitSubrangeTypespec(PascalParser::SubrangeTypespecContext *ctx) override;
    Object visitArrayTypespec(PascalParser::ArrayTypespecContext *ctx) override;
    Object visitVariableDeclarations(PascalParser::VariableDeclarationsContext *ctx) override;
    Object visitRoutineDefinition(PascalParser::RoutineDefinitionContext *ctx) override;
    Object visitParameterDeclarationsList(PascalParser::ParameterDeclarationsListContext *ctx) override;
    Object visitParameterDeclarations(PascalParser::ParameterDeclarationsContext *ctx) override;
    Object visitAssignmentStatement(PascalParser::AssignmentStatementContext *ctx) override;
    Object visitLhs(PascalParser::LhsContext *ctx) override;
    Object visitIfStatement(PascalParser::IfStatementContext *ctx) override;
    Object visitCaseStatement(PascalParser::CaseStatementContext *ctx) override;
    Object visitRepeatStatement(PascalParser::RepeatStatementContext *ctx) override;
    Object visitWhileStatement(PascalParser::WhileStatementContext *ctx) override;
    Object visitForStatement(PascalParser::ForStatementContext *ctx) override;
    Object visitProcedureCallStatement(PascalParser::ProcedureCallStatementContext *ctx) override;
    Object visitFunctionCallFactor(PascalParser::FunctionCallFactorContext *ctx) override;
    Object visitExpression(PascalParser::ExpressionContext *ctx) override;
    Object visitSimpleExpression(PascalParser::SimpleExpressionContext *ctx) override;
    Object visitTerm(PascalParser::TermContext *ctx) override;
    Object visitVariableFactor(PascalParser::VariableFactorContext *ctx) override;
    Object visitVariable(PascalParser::VariableContext *ctx) override;
    Object visitVariableIdentifier(PascalParser::VariableIdentifierContext *ctx) override;
    Object visitNumberFactor(PascalParser::NumberFactorContext *ctx) override;
    Object visitCharacterFactor(PascalParser::CharacterFactorContext *ctx) override;
    Object visitStringFactor(PascalParser::StringFactorContext *ctx) override;
    Object visitNotFactor(PascalParser::NotFactorContext *ctx) override;
    Object visitParenthesizedFactor(PascalParser::ParenthesizedFactorContext *ctx) override;
};

} // namespace frontend

#endif /* SEMANTICS_H_ */
