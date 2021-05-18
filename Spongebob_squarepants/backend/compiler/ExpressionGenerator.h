#ifndef EXPRESSIONGENERATOR_H_
#define EXPRESSIONGENERATOR_H_

#include "CodeGenerator.h"

namespace backend { namespace compiler {

class ExpressionGenerator : public CodeGenerator
{
public:
    /**
     * Constructor.
     * @param parent the parent code generator.
     * @param compiler the compiler to use.
     */
    ExpressionGenerator(CodeGenerator *parent, Compiler *compiler)
        : CodeGenerator(parent, compiler) {}

    /**
     * Emit code for an expression.
     * @param ctx the ExpressionContext.
     */
    void emitExpression(Spongebob_SquarepantsParser::ExpressionContext *ctx);

    /**
     * Emit code for a simple expression.
     * @param ctx the SimpleExpressionContext.
     */
    void emitSimpleExpression(Spongebob_SquarepantsParser::SimpleExpressionContext *ctx);

    /**
     * Emit code for a term.
     * @param ctx the TermContext.
     */
    void emitTerm(Spongebob_SquarepantsParser::TermContext *ctx);

    /**
     * Emit code for NOT.
     * @param ctx the NotFactorContext.
     */
    void emitNotFactor(Spongebob_SquarepantsParser::NotFactorContext *ctx);

    /**
     * Emit code to load a scalar variable's value
     * or a structured variable's address.
     * @param ctx the VariableContext.
     */
    void emitLoadValue(Spongebob_SquarepantsParser::VariableContext *varCtx);

    /**
     * Emit code to load a scalar variable's value
     * or a structured variable's address.
     * @param variableNode the variable node.
     */
    Typespec *emitLoadVariable(Spongebob_SquarepantsParser::VariableContext *varCtx);

    /**
     * Emit code to load an integer constant.
     * @parm intCtx the IntegerConstantContext.
     */
    void emitLoadIntegerConstant(Spongebob_SquarepantsParser::NumberContext *intCtx);

    /**
     * Emit code to load real constant.
     * @parm intCtx the IntegerConstantContext.
     */
    void emitLoadRealConstant(Spongebob_SquarepantsParser::NumberContext *realCtx);


};

}} // namespace backend::compiler

#endif /* EXPRESSIONGENERATOR_H_ */
