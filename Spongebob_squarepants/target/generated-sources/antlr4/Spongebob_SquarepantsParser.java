// Generated from Spongebob_Squarepants.g4 by ANTLR 4.4

	#include <map>
    #include "intermediate/symtab/Symtab.h"
    #include "intermediate/type/Typespec.h"
    using namespace intermediate::symtab;
    using namespace intermediate::type;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Spongebob_SquarepantsParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__15=1, T__14=2, T__13=3, T__12=4, T__11=5, T__10=6, T__9=7, T__8=8, 
		T__7=9, T__6=10, T__5=11, T__4=12, T__3=13, T__2=14, T__1=15, T__0=16, 
		BIKINIBOTTOM=17, IMAGOODNOODLE=18, ANETERNITYLATER=19, GOODBYEFRIEND=20, 
		FISFORFRIENDS=21, FISFORFIRE=22, RAVOLIRAVIOLIGIVEME=23, THEFORMULOLI=24, 
		IMREADYPROMOTION=25, ORDERUP=26, YOUFORGOTTHEPICKLES=27, DOODLEBOB=28, 
		TBUN=29, BBUN=30, STARFISH=31, IDENTIFIER=32, BUBBLEBUDDY=33, SPONGEBOB=34, 
		QUOTE=35, PLANKTON=36, SQUIDWARD=37, MAGICCONCH=38, IMAGINATION=39, OR=40, 
		AND=41;
	public static final String[] tokenNames = {
		"<INVALID>", "'Me Money!'", "'aye aye captain'", "'!='", "'>='", "'<'", 
		"'=='", "'>'", "'<='", "'!'", "'Money!'", "'I will destroy all of you!'", 
		"'I went to college!'", "'is'", "'+'", "','", "'-'", "BIKINIBOTTOM", "IMAGOODNOODLE", 
		"ANETERNITYLATER", "GOODBYEFRIEND", "FISFORFRIENDS", "FISFORFIRE", "RAVOLIRAVIOLIGIVEME", 
		"THEFORMULOLI", "IMREADYPROMOTION", "ORDERUP", "YOUFORGOTTHEPICKLES", 
		"DOODLEBOB", "'('", "')'", "'*'", "IDENTIFIER", "BUBBLEBUDDY", "SPONGEBOB", 
		"'''", "PLANKTON", "SQUIDWARD", "MAGICCONCH", "IMAGINATION", "OR", "AND"
	};
	public static final int
		RULE_program = 0, RULE_programHeader = 1, RULE_block = 2, RULE_declarations = 3, 
		RULE_constantsPart = 4, RULE_constantDefinitionList = 5, RULE_constantDefinition = 6, 
		RULE_constantIdentifier = 7, RULE_constant = 8, RULE_sign = 9, RULE_variablesPart = 10, 
		RULE_variableDeclarationList = 11, RULE_variableDeclarations = 12, RULE_variableIdentifierList = 13, 
		RULE_variableIdentifier = 14, RULE_typeSpecification = 15, RULE_simpleType = 16, 
		RULE_typeIdentifier = 17, RULE_statement = 18, RULE_compoundStatement = 19, 
		RULE_emptyStatement = 20, RULE_statementlist = 21, RULE_assignmentStatement = 22, 
		RULE_lhs = 23, RULE_rhs = 24, RULE_ifStatement = 25, RULE_truestatement = 26, 
		RULE_falsestatement = 27, RULE_whileStatement = 28, RULE_writeStatement = 29, 
		RULE_writelnStatement = 30, RULE_writeArguments = 31, RULE_writeArgument = 32, 
		RULE_expression = 33, RULE_krabby_patty_meal = 34, RULE_term = 35, RULE_krabby_patty = 36, 
		RULE_variable = 37, RULE_number = 38, RULE_unsignedNumber = 39, RULE_integerConstant = 40, 
		RULE_realConstant = 41, RULE_characterConstant = 42, RULE_stringConstant = 43, 
		RULE_relOp = 44, RULE_addOp = 45, RULE_mulOp = 46;
	public static final String[] ruleNames = {
		"program", "programHeader", "block", "declarations", "constantsPart", 
		"constantDefinitionList", "constantDefinition", "constantIdentifier", 
		"constant", "sign", "variablesPart", "variableDeclarationList", "variableDeclarations", 
		"variableIdentifierList", "variableIdentifier", "typeSpecification", "simpleType", 
		"typeIdentifier", "statement", "compoundStatement", "emptyStatement", 
		"statementlist", "assignmentStatement", "lhs", "rhs", "ifStatement", "truestatement", 
		"falsestatement", "whileStatement", "writeStatement", "writelnStatement", 
		"writeArguments", "writeArgument", "expression", "krabby_patty_meal", 
		"term", "krabby_patty", "variable", "number", "unsignedNumber", "integerConstant", 
		"realConstant", "characterConstant", "stringConstant", "relOp", "addOp", 
		"mulOp"
	};

	@Override
	public String getGrammarFileName() { return "Spongebob_Squarepants.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Spongebob_SquarepantsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public ProgramHeaderContext programHeader() {
			return getRuleContext(ProgramHeaderContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94); programHeader();
			setState(95); block();
			setState(96); match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramHeaderContext extends ParserRuleContext {
		public TerminalNode BIKINIBOTTOM() { return getToken(Spongebob_SquarepantsParser.BIKINIBOTTOM, 0); }
		public ProgramHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).enterProgramHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).exitProgramHeader(this);
		}
	}

	public final ProgramHeaderContext programHeader() throws RecognitionException {
		ProgramHeaderContext _localctx = new ProgramHeaderContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_programHeader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98); match(BIKINIBOTTOM);
			setState(99); match(T__14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101); declarations();
			setState(102); compoundStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationsContext extends ParserRuleContext {
		public VariablesPartContext variablesPart() {
			return getRuleContext(VariablesPartContext.class,0);
		}
		public ConstantsPartContext constantsPart() {
			return getRuleContext(ConstantsPartContext.class,0);
		}
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).enterDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).exitDeclarations(this);
		}
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_la = _input.LA(1);
			if (_la==IMAGOODNOODLE) {
				{
				setState(104); constantsPart();
				setState(105); match(T__14);
				}
			}

			setState(112);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(109); variablesPart();
				setState(110); match(T__14);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantsPartContext extends ParserRuleContext {
		public ConstantDefinitionListContext constantDefinitionList() {
			return getRuleContext(ConstantDefinitionListContext.class,0);
		}
		public TerminalNode IMAGOODNOODLE() { return getToken(Spongebob_SquarepantsParser.IMAGOODNOODLE, 0); }
		public ConstantsPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantsPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).enterConstantsPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).exitConstantsPart(this);
		}
	}

	public final ConstantsPartContext constantsPart() throws RecognitionException {
		ConstantsPartContext _localctx = new ConstantsPartContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_constantsPart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114); match(IMAGOODNOODLE);
			setState(115); constantDefinitionList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantDefinitionListContext extends ParserRuleContext {
		public List<ConstantDefinitionContext> constantDefinition() {
			return getRuleContexts(ConstantDefinitionContext.class);
		}
		public ConstantDefinitionContext constantDefinition(int i) {
			return getRuleContext(ConstantDefinitionContext.class,i);
		}
		public ConstantDefinitionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDefinitionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).enterConstantDefinitionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).exitConstantDefinitionList(this);
		}
	}

	public final ConstantDefinitionListContext constantDefinitionList() throws RecognitionException {
		ConstantDefinitionListContext _localctx = new ConstantDefinitionListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_constantDefinitionList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(117); constantDefinition();
			setState(122);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(118); match(T__14);
					setState(119); constantDefinition();
					}
					} 
				}
				setState(124);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantDefinitionContext extends ParserRuleContext {
		public ConstantIdentifierContext constantIdentifier() {
			return getRuleContext(ConstantIdentifierContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstantDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).enterConstantDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).exitConstantDefinition(this);
		}
	}

	public final ConstantDefinitionContext constantDefinition() throws RecognitionException {
		ConstantDefinitionContext _localctx = new ConstantDefinitionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_constantDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125); constantIdentifier();
			setState(126); match(T__3);
			setState(127); constant();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantIdentifierContext extends ParserRuleContext {
		public Typespec * type;
		public SymtabEntry * entry;
		public TerminalNode IDENTIFIER() { return getToken(Spongebob_SquarepantsParser.IDENTIFIER, 0); }
		public ConstantIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).enterConstantIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).exitConstantIdentifier(this);
		}
	}

	public final ConstantIdentifierContext constantIdentifier() throws RecognitionException {
		ConstantIdentifierContext _localctx = new ConstantIdentifierContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_constantIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129); match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public Typespec * type;
		public Object value;
		public UnsignedNumberContext unsignedNumber() {
			return getRuleContext(UnsignedNumberContext.class,0);
		}
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(Spongebob_SquarepantsParser.IDENTIFIER, 0); }
		public StringConstantContext stringConstant() {
			return getRuleContext(StringConstantContext.class,0);
		}
		public CharacterConstantContext characterConstant() {
			return getRuleContext(CharacterConstantContext.class,0);
		}
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).exitConstant(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_constant);
		int _la;
		try {
			setState(140);
			switch (_input.LA(1)) {
			case T__2:
			case T__0:
			case IDENTIFIER:
			case BUBBLEBUDDY:
			case SPONGEBOB:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				_la = _input.LA(1);
				if (_la==T__2 || _la==T__0) {
					{
					setState(131); sign();
					}
				}

				setState(136);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(134); match(IDENTIFIER);
					}
					break;
				case BUBBLEBUDDY:
				case SPONGEBOB:
					{
					setState(135); unsignedNumber();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case PLANKTON:
				enterOuterAlt(_localctx, 2);
				{
				setState(138); characterConstant();
				}
				break;
			case SQUIDWARD:
				enterOuterAlt(_localctx, 3);
				{
				setState(139); stringConstant();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SignContext extends ParserRuleContext {
		public SignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).enterSign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).exitSign(this);
		}
	}

	public final SignContext sign() throws RecognitionException {
		SignContext _localctx = new SignContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_sign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			_la = _input.LA(1);
			if ( !(_la==T__2 || _la==T__0) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariablesPartContext extends ParserRuleContext {
		public VariableDeclarationListContext variableDeclarationList() {
			return getRuleContext(VariableDeclarationListContext.class,0);
		}
		public VariablesPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variablesPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).enterVariablesPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).exitVariablesPart(this);
		}
	}

	public final VariablesPartContext variablesPart() throws RecognitionException {
		VariablesPartContext _localctx = new VariablesPartContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variablesPart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144); variableDeclarationList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationListContext extends ParserRuleContext {
		public List<VariableDeclarationsContext> variableDeclarations() {
			return getRuleContexts(VariableDeclarationsContext.class);
		}
		public VariableDeclarationsContext variableDeclarations(int i) {
			return getRuleContext(VariableDeclarationsContext.class,i);
		}
		public VariableDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).enterVariableDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).exitVariableDeclarationList(this);
		}
	}

	public final VariableDeclarationListContext variableDeclarationList() throws RecognitionException {
		VariableDeclarationListContext _localctx = new VariableDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_variableDeclarationList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(146); variableDeclarations();
			setState(151);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(147); match(T__14);
					setState(148); variableDeclarations();
					}
					} 
				}
				setState(153);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationsContext extends ParserRuleContext {
		public TypeSpecificationContext typeSpecification() {
			return getRuleContext(TypeSpecificationContext.class,0);
		}
		public VariableIdentifierListContext variableIdentifierList() {
			return getRuleContext(VariableIdentifierListContext.class,0);
		}
		public VariableDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).enterVariableDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).exitVariableDeclarations(this);
		}
	}

	public final VariableDeclarationsContext variableDeclarations() throws RecognitionException {
		VariableDeclarationsContext _localctx = new VariableDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variableDeclarations);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154); typeSpecification();
			setState(155); match(T__3);
			setState(156); variableIdentifierList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableIdentifierListContext extends ParserRuleContext {
		public VariableIdentifierContext variableIdentifier(int i) {
			return getRuleContext(VariableIdentifierContext.class,i);
		}
		public List<VariableIdentifierContext> variableIdentifier() {
			return getRuleContexts(VariableIdentifierContext.class);
		}
		public VariableIdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableIdentifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).enterVariableIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).exitVariableIdentifierList(this);
		}
	}

	public final VariableIdentifierListContext variableIdentifierList() throws RecognitionException {
		VariableIdentifierListContext _localctx = new VariableIdentifierListContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_variableIdentifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158); variableIdentifier();
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(159); match(T__1);
				setState(160); variableIdentifier();
				}
				}
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableIdentifierContext extends ParserRuleContext {
		public Typespec * type;
		public SyntabEntry * entry;
		public TerminalNode IDENTIFIER() { return getToken(Spongebob_SquarepantsParser.IDENTIFIER, 0); }
		public VariableIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).enterVariableIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).exitVariableIdentifier(this);
		}
	}

	public final VariableIdentifierContext variableIdentifier() throws RecognitionException {
		VariableIdentifierContext _localctx = new VariableIdentifierContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_variableIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166); match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeSpecificationContext extends ParserRuleContext {
		public Typespec * type;
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public TypeSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).enterTypeSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).exitTypeSpecification(this);
		}
	}

	public final TypeSpecificationContext typeSpecification() throws RecognitionException {
		TypeSpecificationContext _localctx = new TypeSpecificationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_typeSpecification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168); simpleType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleTypeContext extends ParserRuleContext {
		public Typespec * type;
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public SimpleTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).enterSimpleType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).exitSimpleType(this);
		}
	}

	public final SimpleTypeContext simpleType() throws RecognitionException {
		SimpleTypeContext _localctx = new SimpleTypeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_simpleType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170); typeIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeIdentifierContext extends ParserRuleContext {
		public Typespec * type;
		public TerminalNode IDENTIFIER() { return getToken(Spongebob_SquarepantsParser.IDENTIFIER, 0); }
		public TypeIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).enterTypeIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).exitTypeIdentifier(this);
		}
	}

	public final TypeIdentifierContext typeIdentifier() throws RecognitionException {
		TypeIdentifierContext _localctx = new TypeIdentifierContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_typeIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172); match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public WriteStatementContext writeStatement() {
			return getRuleContext(WriteStatementContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public EmptyStatementContext emptyStatement() {
			return getRuleContext(EmptyStatementContext.class,0);
		}
		public WritelnStatementContext writelnStatement() {
			return getRuleContext(WritelnStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_statement);
		try {
			setState(181);
			switch (_input.LA(1)) {
			case ANETERNITYLATER:
				enterOuterAlt(_localctx, 1);
				{
				setState(174); compoundStatement();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(175); assignmentStatement();
				}
				break;
			case FISFORFRIENDS:
				enterOuterAlt(_localctx, 3);
				{
				setState(176); ifStatement();
				}
				break;
			case THEFORMULOLI:
				enterOuterAlt(_localctx, 4);
				{
				setState(177); whileStatement();
				}
				break;
			case ORDERUP:
				enterOuterAlt(_localctx, 5);
				{
				setState(178); writeStatement();
				}
				break;
			case YOUFORGOTTHEPICKLES:
				enterOuterAlt(_localctx, 6);
				{
				setState(179); writelnStatement();
				}
				break;
			case T__14:
			case GOODBYEFRIEND:
			case STARFISH:
				enterOuterAlt(_localctx, 7);
				{
				setState(180); emptyStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompoundStatementContext extends ParserRuleContext {
		public StatementlistContext statementlist() {
			return getRuleContext(StatementlistContext.class,0);
		}
		public TerminalNode ANETERNITYLATER() { return getToken(Spongebob_SquarepantsParser.ANETERNITYLATER, 0); }
		public TerminalNode GOODBYEFRIEND() { return getToken(Spongebob_SquarepantsParser.GOODBYEFRIEND, 0); }
		public CompoundStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).enterCompoundStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).exitCompoundStatement(this);
		}
	}

	public final CompoundStatementContext compoundStatement() throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_compoundStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183); match(ANETERNITYLATER);
			setState(184); statementlist();
			setState(185); match(GOODBYEFRIEND);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmptyStatementContext extends ParserRuleContext {
		public EmptyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).enterEmptyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).exitEmptyStatement(this);
		}
	}

	public final EmptyStatementContext emptyStatement() throws RecognitionException {
		EmptyStatementContext _localctx = new EmptyStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementlistContext extends ParserRuleContext {
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).enterStatementlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).exitStatementlist(this);
		}
	}

	public final StatementlistContext statementlist() throws RecognitionException {
		StatementlistContext _localctx = new StatementlistContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_statementlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189); statement();
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(190); match(T__14);
				setState(191); statement();
				}
				}
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentStatementContext extends ParserRuleContext {
		public RhsContext rhs() {
			return getRuleContext(RhsContext.class,0);
		}
		public LhsContext lhs() {
			return getRuleContext(LhsContext.class,0);
		}
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).enterAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).exitAssignmentStatement(this);
		}
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_assignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197); lhs();
			setState(198); match(T__3);
			setState(199); rhs();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LhsContext extends ParserRuleContext {
		public TypeSpec * type;
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public LhsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lhs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).enterLhs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).exitLhs(this);
		}
	}

	public final LhsContext lhs() throws RecognitionException {
		LhsContext _localctx = new LhsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_lhs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201); variable();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RhsContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RhsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rhs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).enterRhs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).exitRhs(this);
		}
	}

	public final RhsContext rhs() throws RecognitionException {
		RhsContext _localctx = new RhsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_rhs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203); expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public FalsestatementContext falsestatement() {
			return getRuleContext(FalsestatementContext.class,0);
		}
		public TerminalNode FISFORFRIENDS() { return getToken(Spongebob_SquarepantsParser.FISFORFRIENDS, 0); }
		public TruestatementContext truestatement() {
			return getRuleContext(TruestatementContext.class,0);
		}
		public TerminalNode FISFORFIRE() { return getToken(Spongebob_SquarepantsParser.FISFORFIRE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205); match(FISFORFRIENDS);
			setState(206); match(TBUN);
			setState(207); expression();
			setState(208); match(BBUN);
			setState(209); match(STARFISH);
			setState(210); truestatement();
			setState(211); match(STARFISH);
			setState(214);
			_la = _input.LA(1);
			if (_la==FISFORFIRE) {
				{
				setState(212); match(FISFORFIRE);
				setState(213); falsestatement();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TruestatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TruestatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_truestatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).enterTruestatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).exitTruestatement(this);
		}
	}

	public final TruestatementContext truestatement() throws RecognitionException {
		TruestatementContext _localctx = new TruestatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_truestatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216); statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FalsestatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public FalsestatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_falsestatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).enterFalsestatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).exitFalsestatement(this);
		}
	}

	public final FalsestatementContext falsestatement() throws RecognitionException {
		FalsestatementContext _localctx = new FalsestatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_falsestatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218); statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode THEFORMULOLI() { return getToken(Spongebob_SquarepantsParser.THEFORMULOLI, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).exitWhileStatement(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220); match(THEFORMULOLI);
			setState(221); match(TBUN);
			setState(222); expression();
			setState(223); match(BBUN);
			setState(224); match(STARFISH);
			setState(225); statement();
			setState(226); match(STARFISH);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WriteStatementContext extends ParserRuleContext {
		public TerminalNode ORDERUP() { return getToken(Spongebob_SquarepantsParser.ORDERUP, 0); }
		public WriteArgumentsContext writeArguments() {
			return getRuleContext(WriteArgumentsContext.class,0);
		}
		public WriteStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).enterWriteStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).exitWriteStatement(this);
		}
	}

	public final WriteStatementContext writeStatement() throws RecognitionException {
		WriteStatementContext _localctx = new WriteStatementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_writeStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228); match(ORDERUP);
			setState(229); match(TBUN);
			setState(230); writeArguments();
			setState(231); match(BBUN);
			setState(232); match(T__14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WritelnStatementContext extends ParserRuleContext {
		public TerminalNode MAGICCONCH() { return getToken(Spongebob_SquarepantsParser.MAGICCONCH, 0); }
		public TerminalNode YOUFORGOTTHEPICKLES() { return getToken(Spongebob_SquarepantsParser.YOUFORGOTTHEPICKLES, 0); }
		public WriteArgumentsContext writeArguments() {
			return getRuleContext(WriteArgumentsContext.class,0);
		}
		public WritelnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writelnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).enterWritelnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).exitWritelnStatement(this);
		}
	}

	public final WritelnStatementContext writelnStatement() throws RecognitionException {
		WritelnStatementContext _localctx = new WritelnStatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_writelnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234); match(YOUFORGOTTHEPICKLES);
			setState(235); match(TBUN);
			setState(236); writeArguments();
			setState(237); match(BBUN);
			setState(238); match(T__14);
			setState(239); match(MAGICCONCH);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WriteArgumentsContext extends ParserRuleContext {
		public WriteArgumentContext writeArgument(int i) {
			return getRuleContext(WriteArgumentContext.class,i);
		}
		public List<WriteArgumentContext> writeArgument() {
			return getRuleContexts(WriteArgumentContext.class);
		}
		public WriteArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).enterWriteArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).exitWriteArguments(this);
		}
	}

	public final WriteArgumentsContext writeArguments() throws RecognitionException {
		WriteArgumentsContext _localctx = new WriteArgumentsContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_writeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241); writeArgument();
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(242); match(T__1);
				setState(243); writeArgument();
				}
				}
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WriteArgumentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WriteArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).enterWriteArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).exitWriteArgument(this);
		}
	}

	public final WriteArgumentContext writeArgument() throws RecognitionException {
		WriteArgumentContext _localctx = new WriteArgumentContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_writeArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249); expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public Typespec * type;
		public List<Krabby_patty_mealContext> krabby_patty_meal() {
			return getRuleContexts(Krabby_patty_mealContext.class);
		}
		public Krabby_patty_mealContext krabby_patty_meal(int i) {
			return getRuleContext(Krabby_patty_mealContext.class,i);
		}
		public RelOpContext relOp() {
			return getRuleContext(RelOpContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251); krabby_patty_meal();
			setState(255);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__12) | (1L << T__11) | (1L << T__10) | (1L << T__9) | (1L << T__8))) != 0)) {
				{
				setState(252); relOp();
				setState(253); krabby_patty_meal();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Krabby_patty_mealContext extends ParserRuleContext {
		public Typespec * type;
		public AddOpContext addOp(int i) {
			return getRuleContext(AddOpContext.class,i);
		}
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<AddOpContext> addOp() {
			return getRuleContexts(AddOpContext.class);
		}
		public Krabby_patty_mealContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_krabby_patty_meal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).enterKrabby_patty_meal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).exitKrabby_patty_meal(this);
		}
	}

	public final Krabby_patty_mealContext krabby_patty_meal() throws RecognitionException {
		Krabby_patty_mealContext _localctx = new Krabby_patty_mealContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_krabby_patty_meal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257); term();
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__6) | (1L << OR))) != 0)) {
				{
				{
				setState(258); addOp();
				setState(259); term();
				}
				}
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public Typespec * type;
		public Krabby_pattyContext krabby_patty(int i) {
			return getRuleContext(Krabby_pattyContext.class,i);
		}
		public List<MulOpContext> mulOp() {
			return getRuleContexts(MulOpContext.class);
		}
		public List<Krabby_pattyContext> krabby_patty() {
			return getRuleContexts(Krabby_pattyContext.class);
		}
		public MulOpContext mulOp(int i) {
			return getRuleContext(MulOpContext.class,i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266); krabby_patty();
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__4) | (1L << AND))) != 0)) {
				{
				{
				setState(267); mulOp();
				setState(268); krabby_patty();
				}
				}
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Krabby_pattyContext extends ParserRuleContext {
		public Typespec * type;
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode TBUN() { return getToken(Spongebob_SquarepantsParser.TBUN, 0); }
		public TerminalNode BBUN() { return getToken(Spongebob_SquarepantsParser.BBUN, 0); }
		public Krabby_patty_mealContext krabby_patty_meal() {
			return getRuleContext(Krabby_patty_mealContext.class,0);
		}
		public TerminalNode DOODLEBOB() { return getToken(Spongebob_SquarepantsParser.DOODLEBOB, 0); }
		public Krabby_pattyContext krabby_patty() {
			return getRuleContext(Krabby_pattyContext.class,0);
		}
		public StringConstantContext stringConstant() {
			return getRuleContext(StringConstantContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public CharacterConstantContext characterConstant() {
			return getRuleContext(CharacterConstantContext.class,0);
		}
		public Krabby_pattyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_krabby_patty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).enterKrabby_patty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).exitKrabby_patty(this);
		}
	}

	public final Krabby_pattyContext krabby_patty() throws RecognitionException {
		Krabby_pattyContext _localctx = new Krabby_pattyContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_krabby_patty);
		try {
			setState(285);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(275); variable();
				}
				break;
			case BUBBLEBUDDY:
			case SPONGEBOB:
				enterOuterAlt(_localctx, 2);
				{
				setState(276); number();
				}
				break;
			case PLANKTON:
				enterOuterAlt(_localctx, 3);
				{
				setState(277); characterConstant();
				}
				break;
			case SQUIDWARD:
				enterOuterAlt(_localctx, 4);
				{
				setState(278); stringConstant();
				}
				break;
			case DOODLEBOB:
				enterOuterAlt(_localctx, 5);
				{
				setState(279); match(DOODLEBOB);
				setState(280); krabby_patty();
				}
				break;
			case TBUN:
				enterOuterAlt(_localctx, 6);
				{
				setState(281); match(TBUN);
				setState(282); krabby_patty_meal();
				setState(283); match(BBUN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public Typespect * type;
		public TerminalNode IDENTIFIER() { return getToken(Spongebob_SquarepantsParser.IDENTIFIER, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287); match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public UnsignedNumberContext unsignedNumber() {
			return getRuleContext(UnsignedNumberContext.class,0);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289); unsignedNumber();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnsignedNumberContext extends ParserRuleContext {
		public IntegerConstantContext integerConstant() {
			return getRuleContext(IntegerConstantContext.class,0);
		}
		public RealConstantContext realConstant() {
			return getRuleContext(RealConstantContext.class,0);
		}
		public UnsignedNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).enterUnsignedNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).exitUnsignedNumber(this);
		}
	}

	public final UnsignedNumberContext unsignedNumber() throws RecognitionException {
		UnsignedNumberContext _localctx = new UnsignedNumberContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_unsignedNumber);
		try {
			setState(293);
			switch (_input.LA(1)) {
			case BUBBLEBUDDY:
				enterOuterAlt(_localctx, 1);
				{
				setState(291); integerConstant();
				}
				break;
			case SPONGEBOB:
				enterOuterAlt(_localctx, 2);
				{
				setState(292); realConstant();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerConstantContext extends ParserRuleContext {
		public TerminalNode BUBBLEBUDDY() { return getToken(Spongebob_SquarepantsParser.BUBBLEBUDDY, 0); }
		public IntegerConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).enterIntegerConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).exitIntegerConstant(this);
		}
	}

	public final IntegerConstantContext integerConstant() throws RecognitionException {
		IntegerConstantContext _localctx = new IntegerConstantContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_integerConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295); match(BUBBLEBUDDY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RealConstantContext extends ParserRuleContext {
		public TerminalNode SPONGEBOB() { return getToken(Spongebob_SquarepantsParser.SPONGEBOB, 0); }
		public RealConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_realConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).enterRealConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).exitRealConstant(this);
		}
	}

	public final RealConstantContext realConstant() throws RecognitionException {
		RealConstantContext _localctx = new RealConstantContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_realConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297); match(SPONGEBOB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CharacterConstantContext extends ParserRuleContext {
		public TerminalNode PLANKTON() { return getToken(Spongebob_SquarepantsParser.PLANKTON, 0); }
		public CharacterConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_characterConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).enterCharacterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).exitCharacterConstant(this);
		}
	}

	public final CharacterConstantContext characterConstant() throws RecognitionException {
		CharacterConstantContext _localctx = new CharacterConstantContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_characterConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299); match(PLANKTON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringConstantContext extends ParserRuleContext {
		public TerminalNode SQUIDWARD() { return getToken(Spongebob_SquarepantsParser.SQUIDWARD, 0); }
		public StringConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).enterStringConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).exitStringConstant(this);
		}
	}

	public final StringConstantContext stringConstant() throws RecognitionException {
		StringConstantContext _localctx = new StringConstantContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_stringConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301); match(SQUIDWARD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelOpContext extends ParserRuleContext {
		public RelOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).enterRelOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).exitRelOp(this);
		}
	}

	public final RelOpContext relOp() throws RecognitionException {
		RelOpContext _localctx = new RelOpContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_relOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__12) | (1L << T__11) | (1L << T__10) | (1L << T__9) | (1L << T__8))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddOpContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(Spongebob_SquarepantsParser.OR, 0); }
		public AddOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).enterAddOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).exitAddOp(this);
		}
	}

	public final AddOpContext addOp() throws RecognitionException {
		AddOpContext _localctx = new AddOpContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_addOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__6) | (1L << OR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MulOpContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(Spongebob_SquarepantsParser.AND, 0); }
		public MulOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).enterMulOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).exitMulOp(this);
		}
	}

	public final MulOpContext mulOp() throws RecognitionException {
		MulOpContext _localctx = new MulOpContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_mulOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__4) | (1L << AND))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3+\u0138\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\5\5n\n\5\3\5\3\5\3\5\5\5s\n\5\3\6\3\6\3\6\3\7\3\7\3\7\7"+
		"\7{\n\7\f\7\16\7~\13\7\3\b\3\b\3\b\3\b\3\t\3\t\3\n\5\n\u0087\n\n\3\n\3"+
		"\n\5\n\u008b\n\n\3\n\3\n\5\n\u008f\n\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\7"+
		"\r\u0098\n\r\f\r\16\r\u009b\13\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\7"+
		"\17\u00a4\n\17\f\17\16\17\u00a7\13\17\3\20\3\20\3\21\3\21\3\22\3\22\3"+
		"\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00b8\n\24\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\27\3\27\3\27\7\27\u00c3\n\27\f\27\16\27\u00c6\13"+
		"\27\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\5\33\u00d9\n\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3"+
		" \3 \3 \3!\3!\3!\7!\u00f7\n!\f!\16!\u00fa\13!\3\"\3\"\3#\3#\3#\3#\5#\u0102"+
		"\n#\3$\3$\3$\3$\7$\u0108\n$\f$\16$\u010b\13$\3%\3%\3%\3%\7%\u0111\n%\f"+
		"%\16%\u0114\13%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u0120\n&\3\'\3\'\3(\3"+
		"(\3)\3)\5)\u0128\n)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\60"+
		"\2\2\61\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:"+
		"<>@BDFHJLNPRTVXZ\\^\2\6\4\2\20\20\22\22\3\2\5\n\5\2\3\3\f\f**\4\2\r\16"+
		"++\u0123\2`\3\2\2\2\4d\3\2\2\2\6g\3\2\2\2\bm\3\2\2\2\nt\3\2\2\2\fw\3\2"+
		"\2\2\16\177\3\2\2\2\20\u0083\3\2\2\2\22\u008e\3\2\2\2\24\u0090\3\2\2\2"+
		"\26\u0092\3\2\2\2\30\u0094\3\2\2\2\32\u009c\3\2\2\2\34\u00a0\3\2\2\2\36"+
		"\u00a8\3\2\2\2 \u00aa\3\2\2\2\"\u00ac\3\2\2\2$\u00ae\3\2\2\2&\u00b7\3"+
		"\2\2\2(\u00b9\3\2\2\2*\u00bd\3\2\2\2,\u00bf\3\2\2\2.\u00c7\3\2\2\2\60"+
		"\u00cb\3\2\2\2\62\u00cd\3\2\2\2\64\u00cf\3\2\2\2\66\u00da\3\2\2\28\u00dc"+
		"\3\2\2\2:\u00de\3\2\2\2<\u00e6\3\2\2\2>\u00ec\3\2\2\2@\u00f3\3\2\2\2B"+
		"\u00fb\3\2\2\2D\u00fd\3\2\2\2F\u0103\3\2\2\2H\u010c\3\2\2\2J\u011f\3\2"+
		"\2\2L\u0121\3\2\2\2N\u0123\3\2\2\2P\u0127\3\2\2\2R\u0129\3\2\2\2T\u012b"+
		"\3\2\2\2V\u012d\3\2\2\2X\u012f\3\2\2\2Z\u0131\3\2\2\2\\\u0133\3\2\2\2"+
		"^\u0135\3\2\2\2`a\5\4\3\2ab\5\6\4\2bc\7\13\2\2c\3\3\2\2\2de\7\23\2\2e"+
		"f\7\4\2\2f\5\3\2\2\2gh\5\b\5\2hi\5(\25\2i\7\3\2\2\2jk\5\n\6\2kl\7\4\2"+
		"\2ln\3\2\2\2mj\3\2\2\2mn\3\2\2\2nr\3\2\2\2op\5\26\f\2pq\7\4\2\2qs\3\2"+
		"\2\2ro\3\2\2\2rs\3\2\2\2s\t\3\2\2\2tu\7\24\2\2uv\5\f\7\2v\13\3\2\2\2w"+
		"|\5\16\b\2xy\7\4\2\2y{\5\16\b\2zx\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2"+
		"\2}\r\3\2\2\2~|\3\2\2\2\177\u0080\5\20\t\2\u0080\u0081\7\17\2\2\u0081"+
		"\u0082\5\22\n\2\u0082\17\3\2\2\2\u0083\u0084\7\"\2\2\u0084\21\3\2\2\2"+
		"\u0085\u0087\5\24\13\2\u0086\u0085\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u008a"+
		"\3\2\2\2\u0088\u008b\7\"\2\2\u0089\u008b\5P)\2\u008a\u0088\3\2\2\2\u008a"+
		"\u0089\3\2\2\2\u008b\u008f\3\2\2\2\u008c\u008f\5V,\2\u008d\u008f\5X-\2"+
		"\u008e\u0086\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008d\3\2\2\2\u008f\23"+
		"\3\2\2\2\u0090\u0091\t\2\2\2\u0091\25\3\2\2\2\u0092\u0093\5\30\r\2\u0093"+
		"\27\3\2\2\2\u0094\u0099\5\32\16\2\u0095\u0096\7\4\2\2\u0096\u0098\5\32"+
		"\16\2\u0097\u0095\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099"+
		"\u009a\3\2\2\2\u009a\31\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009d\5 \21"+
		"\2\u009d\u009e\7\17\2\2\u009e\u009f\5\34\17\2\u009f\33\3\2\2\2\u00a0\u00a5"+
		"\5\36\20\2\u00a1\u00a2\7\21\2\2\u00a2\u00a4\5\36\20\2\u00a3\u00a1\3\2"+
		"\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6"+
		"\35\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00a9\7\"\2\2\u00a9\37\3\2\2\2\u00aa"+
		"\u00ab\5\"\22\2\u00ab!\3\2\2\2\u00ac\u00ad\5$\23\2\u00ad#\3\2\2\2\u00ae"+
		"\u00af\7\"\2\2\u00af%\3\2\2\2\u00b0\u00b8\5(\25\2\u00b1\u00b8\5.\30\2"+
		"\u00b2\u00b8\5\64\33\2\u00b3\u00b8\5:\36\2\u00b4\u00b8\5<\37\2\u00b5\u00b8"+
		"\5> \2\u00b6\u00b8\5*\26\2\u00b7\u00b0\3\2\2\2\u00b7\u00b1\3\2\2\2\u00b7"+
		"\u00b2\3\2\2\2\u00b7\u00b3\3\2\2\2\u00b7\u00b4\3\2\2\2\u00b7\u00b5\3\2"+
		"\2\2\u00b7\u00b6\3\2\2\2\u00b8\'\3\2\2\2\u00b9\u00ba\7\25\2\2\u00ba\u00bb"+
		"\5,\27\2\u00bb\u00bc\7\26\2\2\u00bc)\3\2\2\2\u00bd\u00be\3\2\2\2\u00be"+
		"+\3\2\2\2\u00bf\u00c4\5&\24\2\u00c0\u00c1\7\4\2\2\u00c1\u00c3\5&\24\2"+
		"\u00c2\u00c0\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5"+
		"\3\2\2\2\u00c5-\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c8\5\60\31\2\u00c8"+
		"\u00c9\7\17\2\2\u00c9\u00ca\5\62\32\2\u00ca/\3\2\2\2\u00cb\u00cc\5L\'"+
		"\2\u00cc\61\3\2\2\2\u00cd\u00ce\5D#\2\u00ce\63\3\2\2\2\u00cf\u00d0\7\27"+
		"\2\2\u00d0\u00d1\7\37\2\2\u00d1\u00d2\5D#\2\u00d2\u00d3\7 \2\2\u00d3\u00d4"+
		"\7!\2\2\u00d4\u00d5\5\66\34\2\u00d5\u00d8\7!\2\2\u00d6\u00d7\7\30\2\2"+
		"\u00d7\u00d9\58\35\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\65"+
		"\3\2\2\2\u00da\u00db\5&\24\2\u00db\67\3\2\2\2\u00dc\u00dd\5&\24\2\u00dd"+
		"9\3\2\2\2\u00de\u00df\7\32\2\2\u00df\u00e0\7\37\2\2\u00e0\u00e1\5D#\2"+
		"\u00e1\u00e2\7 \2\2\u00e2\u00e3\7!\2\2\u00e3\u00e4\5&\24\2\u00e4\u00e5"+
		"\7!\2\2\u00e5;\3\2\2\2\u00e6\u00e7\7\34\2\2\u00e7\u00e8\7\37\2\2\u00e8"+
		"\u00e9\5@!\2\u00e9\u00ea\7 \2\2\u00ea\u00eb\7\4\2\2\u00eb=\3\2\2\2\u00ec"+
		"\u00ed\7\35\2\2\u00ed\u00ee\7\37\2\2\u00ee\u00ef\5@!\2\u00ef\u00f0\7 "+
		"\2\2\u00f0\u00f1\7\4\2\2\u00f1\u00f2\7(\2\2\u00f2?\3\2\2\2\u00f3\u00f8"+
		"\5B\"\2\u00f4\u00f5\7\21\2\2\u00f5\u00f7\5B\"\2\u00f6\u00f4\3\2\2\2\u00f7"+
		"\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9A\3\2\2\2"+
		"\u00fa\u00f8\3\2\2\2\u00fb\u00fc\5D#\2\u00fcC\3\2\2\2\u00fd\u0101\5F$"+
		"\2\u00fe\u00ff\5Z.\2\u00ff\u0100\5F$\2\u0100\u0102\3\2\2\2\u0101\u00fe"+
		"\3\2\2\2\u0101\u0102\3\2\2\2\u0102E\3\2\2\2\u0103\u0109\5H%\2\u0104\u0105"+
		"\5\\/\2\u0105\u0106\5H%\2\u0106\u0108\3\2\2\2\u0107\u0104\3\2\2\2\u0108"+
		"\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010aG\3\2\2\2"+
		"\u010b\u0109\3\2\2\2\u010c\u0112\5J&\2\u010d\u010e\5^\60\2\u010e\u010f"+
		"\5J&\2\u010f\u0111\3\2\2\2\u0110\u010d\3\2\2\2\u0111\u0114\3\2\2\2\u0112"+
		"\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113I\3\2\2\2\u0114\u0112\3\2\2\2"+
		"\u0115\u0120\5L\'\2\u0116\u0120\5N(\2\u0117\u0120\5V,\2\u0118\u0120\5"+
		"X-\2\u0119\u011a\7\36\2\2\u011a\u0120\5J&\2\u011b\u011c\7\37\2\2\u011c"+
		"\u011d\5F$\2\u011d\u011e\7 \2\2\u011e\u0120\3\2\2\2\u011f\u0115\3\2\2"+
		"\2\u011f\u0116\3\2\2\2\u011f\u0117\3\2\2\2\u011f\u0118\3\2\2\2\u011f\u0119"+
		"\3\2\2\2\u011f\u011b\3\2\2\2\u0120K\3\2\2\2\u0121\u0122\7\"\2\2\u0122"+
		"M\3\2\2\2\u0123\u0124\5P)\2\u0124O\3\2\2\2\u0125\u0128\5R*\2\u0126\u0128"+
		"\5T+\2\u0127\u0125\3\2\2\2\u0127\u0126\3\2\2\2\u0128Q\3\2\2\2\u0129\u012a"+
		"\7#\2\2\u012aS\3\2\2\2\u012b\u012c\7$\2\2\u012cU\3\2\2\2\u012d\u012e\7"+
		"&\2\2\u012eW\3\2\2\2\u012f\u0130\7\'\2\2\u0130Y\3\2\2\2\u0131\u0132\t"+
		"\3\2\2\u0132[\3\2\2\2\u0133\u0134\t\4\2\2\u0134]\3\2\2\2\u0135\u0136\t"+
		"\5\2\2\u0136_\3\2\2\2\23mr|\u0086\u008a\u008e\u0099\u00a5\u00b7\u00c4"+
		"\u00d8\u00f8\u0101\u0109\u0112\u011f\u0127";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}