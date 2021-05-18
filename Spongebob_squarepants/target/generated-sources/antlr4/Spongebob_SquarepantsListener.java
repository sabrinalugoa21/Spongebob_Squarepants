// Generated from Spongebob_Squarepants.g4 by ANTLR 4.4

	#include <map>
    #include "intermediate/symtab/Symtab.h"
    #include "intermediate/type/Typespec.h"
    using namespace intermediate::symtab;
    using namespace intermediate::type;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Spongebob_SquarepantsParser}.
 */
public interface Spongebob_SquarepantsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Spongebob_SquarepantsParser#variableIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableIdentifier(@NotNull Spongebob_SquarepantsParser.VariableIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Spongebob_SquarepantsParser#variableIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableIdentifier(@NotNull Spongebob_SquarepantsParser.VariableIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Spongebob_SquarepantsParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(@NotNull Spongebob_SquarepantsParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link Spongebob_SquarepantsParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(@NotNull Spongebob_SquarepantsParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link Spongebob_SquarepantsParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(@NotNull Spongebob_SquarepantsParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Spongebob_SquarepantsParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(@NotNull Spongebob_SquarepantsParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Spongebob_SquarepantsParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(@NotNull Spongebob_SquarepantsParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Spongebob_SquarepantsParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(@NotNull Spongebob_SquarepantsParser.ModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Spongebob_SquarepantsParser#sign}.
	 * @param ctx the parse tree
	 */
	void enterSign(@NotNull Spongebob_SquarepantsParser.SignContext ctx);
	/**
	 * Exit a parse tree produced by {@link Spongebob_SquarepantsParser#sign}.
	 * @param ctx the parse tree
	 */
	void exitSign(@NotNull Spongebob_SquarepantsParser.SignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeIdentifierTypespec}
	 * labeled alternative in {@link Spongebob_SquarepantsParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void enterTypeIdentifierTypespec(@NotNull Spongebob_SquarepantsParser.TypeIdentifierTypespecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeIdentifierTypespec}
	 * labeled alternative in {@link Spongebob_SquarepantsParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void exitTypeIdentifierTypespec(@NotNull Spongebob_SquarepantsParser.TypeIdentifierTypespecContext ctx);
	/**
	 * Enter a parse tree produced by {@link Spongebob_SquarepantsParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull Spongebob_SquarepantsParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link Spongebob_SquarepantsParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull Spongebob_SquarepantsParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link Spongebob_SquarepantsParser#writeArgument}.
	 * @param ctx the parse tree
	 */
	void enterWriteArgument(@NotNull Spongebob_SquarepantsParser.WriteArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Spongebob_SquarepantsParser#writeArgument}.
	 * @param ctx the parse tree
	 */
	void exitWriteArgument(@NotNull Spongebob_SquarepantsParser.WriteArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Spongebob_SquarepantsParser#truestatement}.
	 * @param ctx the parse tree
	 */
	void enterTruestatement(@NotNull Spongebob_SquarepantsParser.TruestatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Spongebob_SquarepantsParser#truestatement}.
	 * @param ctx the parse tree
	 */
	void exitTruestatement(@NotNull Spongebob_SquarepantsParser.TruestatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Spongebob_SquarepantsParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(@NotNull Spongebob_SquarepantsParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link Spongebob_SquarepantsParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(@NotNull Spongebob_SquarepantsParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code enumerationTypespec}
	 * labeled alternative in {@link Spongebob_SquarepantsParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void enterEnumerationTypespec(@NotNull Spongebob_SquarepantsParser.EnumerationTypespecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code enumerationTypespec}
	 * labeled alternative in {@link Spongebob_SquarepantsParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void exitEnumerationTypespec(@NotNull Spongebob_SquarepantsParser.EnumerationTypespecContext ctx);
	/**
	 * Enter a parse tree produced by {@link Spongebob_SquarepantsParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull Spongebob_SquarepantsParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Spongebob_SquarepantsParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull Spongebob_SquarepantsParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Spongebob_SquarepantsParser#typeSpecification}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpecification(@NotNull Spongebob_SquarepantsParser.TypeSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Spongebob_SquarepantsParser#typeSpecification}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpecification(@NotNull Spongebob_SquarepantsParser.TypeSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Spongebob_SquarepantsParser#programHeader}.
	 * @param ctx the parse tree
	 */
	void enterProgramHeader(@NotNull Spongebob_SquarepantsParser.ProgramHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link Spongebob_SquarepantsParser#programHeader}.
	 * @param ctx the parse tree
	 */
	void exitProgramHeader(@NotNull Spongebob_SquarepantsParser.ProgramHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link Spongebob_SquarepantsParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(@NotNull Spongebob_SquarepantsParser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Spongebob_SquarepantsParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(@NotNull Spongebob_SquarepantsParser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Spongebob_SquarepantsParser#unsignedNumber}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedNumber(@NotNull Spongebob_SquarepantsParser.UnsignedNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link Spongebob_SquarepantsParser#unsignedNumber}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedNumber(@NotNull Spongebob_SquarepantsParser.UnsignedNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link Spongebob_SquarepantsParser#enumerationConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumerationConstant(@NotNull Spongebob_SquarepantsParser.EnumerationConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link Spongebob_SquarepantsParser#enumerationConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumerationConstant(@NotNull Spongebob_SquarepantsParser.EnumerationConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link Spongebob_SquarepantsParser#characterConstant}.
	 * @param ctx the parse tree
	 */
	void enterCharacterConstant(@NotNull Spongebob_SquarepantsParser.CharacterConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link Spongebob_SquarepantsParser#characterConstant}.
	 * @param ctx the parse tree
	 */
	void exitCharacterConstant(@NotNull Spongebob_SquarepantsParser.CharacterConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link Spongebob_SquarepantsParser#variableDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarations(@NotNull Spongebob_SquarepantsParser.VariableDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Spongebob_SquarepantsParser#variableDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarations(@NotNull Spongebob_SquarepantsParser.VariableDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Spongebob_SquarepantsParser#constantIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterConstantIdentifier(@NotNull Spongebob_SquarepantsParser.ConstantIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Spongebob_SquarepantsParser#constantIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitConstantIdentifier(@NotNull Spongebob_SquarepantsParser.ConstantIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Spongebob_SquarepantsParser#index}.
	 * @param ctx the parse tree
	 */
	void enterIndex(@NotNull Spongebob_SquarepantsParser.IndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link Spongebob_SquarepantsParser#index}.
	 * @param ctx the parse tree
	 */
	void exitIndex(@NotNull Spongebob_SquarepantsParser.IndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link Spongebob_SquarepantsParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpression(@NotNull Spongebob_SquarepantsParser.SimpleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Spongebob_SquarepantsParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpression(@NotNull Spongebob_SquarepantsParser.SimpleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Spongebob_SquarepantsParser#relOp}.
	 * @param ctx the parse tree
	 */
	void enterRelOp(@NotNull Spongebob_SquarepantsParser.RelOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link Spongebob_SquarepantsParser#relOp}.
	 * @param ctx the parse tree
	 */
	void exitRelOp(@NotNull Spongebob_SquarepantsParser.RelOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link Spongebob_SquarepantsParser#writeArguments}.
	 * @param ctx the parse tree
	 */
	void enterWriteArguments(@NotNull Spongebob_SquarepantsParser.WriteArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Spongebob_SquarepantsParser#writeArguments}.
	 * @param ctx the parse tree
	 */
	void exitWriteArguments(@NotNull Spongebob_SquarepantsParser.WriteArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Spongebob_SquarepantsParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(@NotNull Spongebob_SquarepantsParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link Spongebob_SquarepantsParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(@NotNull Spongebob_SquarepantsParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link Spongebob_SquarepantsParser#typeIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeIdentifier(@NotNull Spongebob_SquarepantsParser.TypeIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Spongebob_SquarepantsParser#typeIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeIdentifier(@NotNull Spongebob_SquarepantsParser.TypeIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Spongebob_SquarepantsParser#integerConstant}.
	 * @param ctx the parse tree
	 */
	void enterIntegerConstant(@NotNull Spongebob_SquarepantsParser.IntegerConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link Spongebob_SquarepantsParser#integerConstant}.
	 * @param ctx the parse tree
	 */
	void exitIntegerConstant(@NotNull Spongebob_SquarepantsParser.IntegerConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link Spongebob_SquarepantsParser#constantsPart}.
	 * @param ctx the parse tree
	 */
	void enterConstantsPart(@NotNull Spongebob_SquarepantsParser.ConstantsPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link Spongebob_SquarepantsParser#constantsPart}.
	 * @param ctx the parse tree
	 */
	void exitConstantsPart(@NotNull Spongebob_SquarepantsParser.ConstantsPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link Spongebob_SquarepantsParser#writeStatement}.
	 * @param ctx the parse tree
	 */
	void enterWriteStatement(@NotNull Spongebob_SquarepantsParser.WriteStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Spongebob_SquarepantsParser#writeStatement}.
	 * @param ctx the parse tree
	 */
	void exitWriteStatement(@NotNull Spongebob_SquarepantsParser.WriteStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Spongebob_SquarepantsParser#constantDefinitionList}.
	 * @param ctx the parse tree
	 */
	void enterConstantDefinitionList(@NotNull Spongebob_SquarepantsParser.ConstantDefinitionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Spongebob_SquarepantsParser#constantDefinitionList}.
	 * @param ctx the parse tree
	 */
	void exitConstantDefinitionList(@NotNull Spongebob_SquarepantsParser.ConstantDefinitionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Spongebob_SquarepantsParser#statementlist}.
	 * @param ctx the parse tree
	 */
	void enterStatementlist(@NotNull Spongebob_SquarepantsParser.StatementlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link Spongebob_SquarepantsParser#statementlist}.
	 * @param ctx the parse tree
	 */
	void exitStatementlist(@NotNull Spongebob_SquarepantsParser.StatementlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link Spongebob_SquarepantsParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(@NotNull Spongebob_SquarepantsParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Spongebob_SquarepantsParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(@NotNull Spongebob_SquarepantsParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Spongebob_SquarepantsParser#indexList}.
	 * @param ctx the parse tree
	 */
	void enterIndexList(@NotNull Spongebob_SquarepantsParser.IndexListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Spongebob_SquarepantsParser#indexList}.
	 * @param ctx the parse tree
	 */
	void exitIndexList(@NotNull Spongebob_SquarepantsParser.IndexListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Spongebob_SquarepantsParser#variablesPart}.
	 * @param ctx the parse tree
	 */
	void enterVariablesPart(@NotNull Spongebob_SquarepantsParser.VariablesPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link Spongebob_SquarepantsParser#variablesPart}.
	 * @param ctx the parse tree
	 */
	void exitVariablesPart(@NotNull Spongebob_SquarepantsParser.VariablesPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link Spongebob_SquarepantsParser#falsestatement}.
	 * @param ctx the parse tree
	 */
	void enterFalsestatement(@NotNull Spongebob_SquarepantsParser.FalsestatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Spongebob_SquarepantsParser#falsestatement}.
	 * @param ctx the parse tree
	 */
	void exitFalsestatement(@NotNull Spongebob_SquarepantsParser.FalsestatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Spongebob_SquarepantsParser#constantDefinition}.
	 * @param ctx the parse tree
	 */
	void enterConstantDefinition(@NotNull Spongebob_SquarepantsParser.ConstantDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Spongebob_SquarepantsParser#constantDefinition}.
	 * @param ctx the parse tree
	 */
	void exitConstantDefinition(@NotNull Spongebob_SquarepantsParser.ConstantDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Spongebob_SquarepantsParser#stringConstant}.
	 * @param ctx the parse tree
	 */
	void enterStringConstant(@NotNull Spongebob_SquarepantsParser.StringConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link Spongebob_SquarepantsParser#stringConstant}.
	 * @param ctx the parse tree
	 */
	void exitStringConstant(@NotNull Spongebob_SquarepantsParser.StringConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link Spongebob_SquarepantsParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull Spongebob_SquarepantsParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Spongebob_SquarepantsParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull Spongebob_SquarepantsParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Spongebob_SquarepantsParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(@NotNull Spongebob_SquarepantsParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link Spongebob_SquarepantsParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(@NotNull Spongebob_SquarepantsParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link Spongebob_SquarepantsParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(@NotNull Spongebob_SquarepantsParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Spongebob_SquarepantsParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(@NotNull Spongebob_SquarepantsParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Spongebob_SquarepantsParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull Spongebob_SquarepantsParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Spongebob_SquarepantsParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull Spongebob_SquarepantsParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Spongebob_SquarepantsParser#addOp}.
	 * @param ctx the parse tree
	 */
	void enterAddOp(@NotNull Spongebob_SquarepantsParser.AddOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link Spongebob_SquarepantsParser#addOp}.
	 * @param ctx the parse tree
	 */
	void exitAddOp(@NotNull Spongebob_SquarepantsParser.AddOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link Spongebob_SquarepantsParser#realConstant}.
	 * @param ctx the parse tree
	 */
	void enterRealConstant(@NotNull Spongebob_SquarepantsParser.RealConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link Spongebob_SquarepantsParser#realConstant}.
	 * @param ctx the parse tree
	 */
	void exitRealConstant(@NotNull Spongebob_SquarepantsParser.RealConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link Spongebob_SquarepantsParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(@NotNull Spongebob_SquarepantsParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Spongebob_SquarepantsParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(@NotNull Spongebob_SquarepantsParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Spongebob_SquarepantsParser#writelnStatement}.
	 * @param ctx the parse tree
	 */
	void enterWritelnStatement(@NotNull Spongebob_SquarepantsParser.WritelnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Spongebob_SquarepantsParser#writelnStatement}.
	 * @param ctx the parse tree
	 */
	void exitWritelnStatement(@NotNull Spongebob_SquarepantsParser.WritelnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Spongebob_SquarepantsParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterDeclarations(@NotNull Spongebob_SquarepantsParser.DeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Spongebob_SquarepantsParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitDeclarations(@NotNull Spongebob_SquarepantsParser.DeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Spongebob_SquarepantsParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(@NotNull Spongebob_SquarepantsParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Spongebob_SquarepantsParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(@NotNull Spongebob_SquarepantsParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Spongebob_SquarepantsParser#mulOp}.
	 * @param ctx the parse tree
	 */
	void enterMulOp(@NotNull Spongebob_SquarepantsParser.MulOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link Spongebob_SquarepantsParser#mulOp}.
	 * @param ctx the parse tree
	 */
	void exitMulOp(@NotNull Spongebob_SquarepantsParser.MulOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link Spongebob_SquarepantsParser#lhs}.
	 * @param ctx the parse tree
	 */
	void enterLhs(@NotNull Spongebob_SquarepantsParser.LhsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Spongebob_SquarepantsParser#lhs}.
	 * @param ctx the parse tree
	 */
	void exitLhs(@NotNull Spongebob_SquarepantsParser.LhsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Spongebob_SquarepantsParser#enumerationType}.
	 * @param ctx the parse tree
	 */
	void enterEnumerationType(@NotNull Spongebob_SquarepantsParser.EnumerationTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Spongebob_SquarepantsParser#enumerationType}.
	 * @param ctx the parse tree
	 */
	void exitEnumerationType(@NotNull Spongebob_SquarepantsParser.EnumerationTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Spongebob_SquarepantsParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(@NotNull Spongebob_SquarepantsParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link Spongebob_SquarepantsParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(@NotNull Spongebob_SquarepantsParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link Spongebob_SquarepantsParser#variableDeclarationList}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationList(@NotNull Spongebob_SquarepantsParser.VariableDeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Spongebob_SquarepantsParser#variableDeclarationList}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationList(@NotNull Spongebob_SquarepantsParser.VariableDeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Spongebob_SquarepantsParser#variableIdentifierList}.
	 * @param ctx the parse tree
	 */
	void enterVariableIdentifierList(@NotNull Spongebob_SquarepantsParser.VariableIdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Spongebob_SquarepantsParser#variableIdentifierList}.
	 * @param ctx the parse tree
	 */
	void exitVariableIdentifierList(@NotNull Spongebob_SquarepantsParser.VariableIdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Spongebob_SquarepantsParser#rhs}.
	 * @param ctx the parse tree
	 */
	void enterRhs(@NotNull Spongebob_SquarepantsParser.RhsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Spongebob_SquarepantsParser#rhs}.
	 * @param ctx the parse tree
	 */
	void exitRhs(@NotNull Spongebob_SquarepantsParser.RhsContext ctx);
}