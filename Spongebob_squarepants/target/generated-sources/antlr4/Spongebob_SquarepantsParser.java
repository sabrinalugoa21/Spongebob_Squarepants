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
		T__18=1, T__17=2, T__16=3, T__15=4, T__14=5, T__13=6, T__12=7, T__11=8, 
		T__10=9, T__9=10, T__8=11, T__7=12, T__6=13, T__5=14, T__4=15, T__3=16, 
		T__2=17, T__1=18, T__0=19, BIKINIBOTTOM=20, IMAGOODNOODLE=21, ANETERNITYLATER=22, 
		GOODBYEFRIEND=23, FISFORFRIENDS=24, FISFORFIRE=25, RAVIOLIRAVIOLIGIVEME=26, 
		THEFORMULOLI=27, IMREADYPROMOTION=28, ORDERUP=29, YOUFORGOTTHEPICKLES=30, 
		DOODLEBOB=31, IMMAGOOFYGOOBER=32, OR=33, AND=34, TBUN=35, BBUN=36, STARFISH=37, 
		IDENTIFIER=38, BUBBLEBUDDY=39, SPONGEBOB=40, QUOTE=41, PLANKTON=42, SQUIDWARD=43, 
		MAGICCONCH=44, IMAGINATION=45;
	public static final String[] tokenNames = {
		"<INVALID>", "'aye aye captain'", "'MONEY'", "'!='", "'>='", "'['", "'<'", 
		"'=='", "']'", "'>'", "'<='", "'!'", "'ME MONEY'", "'I will destroy all of you!'", 
		"'I went to college!'", "'is'", "'+'", "','", "'-'", "'.'", "BIKINIBOTTOM", 
		"IMAGOODNOODLE", "ANETERNITYLATER", "GOODBYEFRIEND", "FISFORFRIENDS", 
		"FISFORFIRE", "RAVIOLIRAVIOLIGIVEME", "THEFORMULOLI", "IMREADYPROMOTION", 
		"ORDERUP", "YOUFORGOTTHEPICKLES", "DOODLEBOB", "IMMAGOOFYGOOBER", "OR", 
		"AND", "'('", "')'", "'*'", "IDENTIFIER", "BUBBLEBUDDY", "SPONGEBOB", 
		"'''", "PLANKTON", "SQUIDWARD", "MAGICCONCH", "IMAGINATION"
	};
	public static final int
		RULE_program = 0, RULE_programHeader = 1, RULE_block = 2, RULE_declarations = 3, 
		RULE_constantsPart = 4, RULE_constantDefinitionList = 5, RULE_constantDefinition = 6, 
		RULE_constantIdentifier = 7, RULE_constant = 8, RULE_sign = 9, RULE_variablesPart = 10, 
		RULE_variableDeclarationList = 11, RULE_variableDeclarations = 12, RULE_variableIdentifierList = 13, 
		RULE_variableIdentifier = 14, RULE_typeSpecification = 15, RULE_simpleType = 16, 
		RULE_enumerationType = 17, RULE_enumerationConstant = 18, RULE_typeIdentifier = 19, 
		RULE_statement = 20, RULE_compoundStatement = 21, RULE_emptyStatement = 22, 
		RULE_statementlist = 23, RULE_assignmentStatement = 24, RULE_lhs = 25, 
		RULE_rhs = 26, RULE_ifStatement = 27, RULE_truestatement = 28, RULE_falsestatement = 29, 
		RULE_whileStatement = 30, RULE_writeStatement = 31, RULE_writelnStatement = 32, 
		RULE_writeArguments = 33, RULE_writeArgument = 34, RULE_expression = 35, 
		RULE_simpleExpression = 36, RULE_term = 37, RULE_factor = 38, RULE_variable = 39, 
		RULE_modifier = 40, RULE_indexList = 41, RULE_index = 42, RULE_field = 43, 
		RULE_number = 44, RULE_unsignedNumber = 45, RULE_integerConstant = 46, 
		RULE_realConstant = 47, RULE_characterConstant = 48, RULE_stringConstant = 49, 
		RULE_relOp = 50, RULE_addOp = 51, RULE_mulOp = 52;
	public static final String[] ruleNames = {
		"program", "programHeader", "block", "declarations", "constantsPart", 
		"constantDefinitionList", "constantDefinition", "constantIdentifier", 
		"constant", "sign", "variablesPart", "variableDeclarationList", "variableDeclarations", 
		"variableIdentifierList", "variableIdentifier", "typeSpecification", "simpleType", 
		"enumerationType", "enumerationConstant", "typeIdentifier", "statement", 
		"compoundStatement", "emptyStatement", "statementlist", "assignmentStatement", 
		"lhs", "rhs", "ifStatement", "truestatement", "falsestatement", "whileStatement", 
		"writeStatement", "writelnStatement", "writeArguments", "writeArgument", 
		"expression", "simpleExpression", "term", "factor", "variable", "modifier", 
		"indexList", "index", "field", "number", "unsignedNumber", "integerConstant", 
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
			setState(106); programHeader();
			setState(107); block();
			setState(108); match(T__8);
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
			setState(110); match(BIKINIBOTTOM);
			setState(111); match(T__18);
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
			setState(113); declarations();
			setState(114); compoundStatement();
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
			setState(119);
			_la = _input.LA(1);
			if (_la==IMAGOODNOODLE) {
				{
				setState(116); constantsPart();
				setState(117); match(T__18);
				}
			}

			setState(124);
			_la = _input.LA(1);
			if (_la==IMMAGOOFYGOOBER) {
				{
				setState(121); variablesPart();
				setState(122); match(T__18);
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
			setState(126); match(IMAGOODNOODLE);
			setState(127); constantDefinitionList();
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
			setState(129); constantDefinition();
			setState(134);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(130); match(T__18);
					setState(131); constantDefinition();
					}
					} 
				}
				setState(136);
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
			setState(137); constantIdentifier();
			setState(138); match(T__4);
			setState(139); constant();
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
			setState(141); match(IDENTIFIER);
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
			setState(152);
			switch (_input.LA(1)) {
			case T__3:
			case T__1:
			case IDENTIFIER:
			case BUBBLEBUDDY:
			case SPONGEBOB:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				_la = _input.LA(1);
				if (_la==T__3 || _la==T__1) {
					{
					setState(143); sign();
					}
				}

				setState(148);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(146); match(IDENTIFIER);
					}
					break;
				case BUBBLEBUDDY:
				case SPONGEBOB:
					{
					setState(147); unsignedNumber();
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
				setState(150); characterConstant();
				}
				break;
			case SQUIDWARD:
				enterOuterAlt(_localctx, 3);
				{
				setState(151); stringConstant();
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
			setState(154);
			_la = _input.LA(1);
			if ( !(_la==T__3 || _la==T__1) ) {
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
		public TerminalNode IMMAGOOFYGOOBER() { return getToken(Spongebob_SquarepantsParser.IMMAGOOFYGOOBER, 0); }
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
			setState(156); match(IMMAGOOFYGOOBER);
			setState(157); variableDeclarationList();
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
			setState(159); variableDeclarations();
			setState(164);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(160); match(T__18);
					setState(161); variableDeclarations();
					}
					} 
				}
				setState(166);
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
			setState(167); variableIdentifierList();
			setState(168); match(T__4);
			setState(169); typeSpecification();
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
			setState(171); variableIdentifier();
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(172); match(T__2);
				setState(173); variableIdentifier();
				}
				}
				setState(178);
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
			setState(179); match(IDENTIFIER);
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
			setState(181); simpleType();
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
		public SimpleTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleType; }
	 
		public SimpleTypeContext() { }
		public void copyFrom(SimpleTypeContext ctx) {
			super.copyFrom(ctx);
			this.type = ctx.type;
		}
	}
	public static class EnumerationTypespecContext extends SimpleTypeContext {
		public EnumerationTypeContext enumerationType() {
			return getRuleContext(EnumerationTypeContext.class,0);
		}
		public EnumerationTypespecContext(SimpleTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).enterEnumerationTypespec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).exitEnumerationTypespec(this);
		}
	}
	public static class TypeIdentifierTypespecContext extends SimpleTypeContext {
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public TypeIdentifierTypespecContext(SimpleTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).enterTypeIdentifierTypespec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).exitTypeIdentifierTypespec(this);
		}
	}

	public final SimpleTypeContext simpleType() throws RecognitionException {
		SimpleTypeContext _localctx = new SimpleTypeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_simpleType);
		try {
			setState(185);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new TypeIdentifierTypespecContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(183); typeIdentifier();
				}
				break;
			case TBUN:
				_localctx = new EnumerationTypespecContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(184); enumerationType();
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

	public static class EnumerationTypeContext extends ParserRuleContext {
		public EnumerationConstantContext enumerationConstant(int i) {
			return getRuleContext(EnumerationConstantContext.class,i);
		}
		public List<EnumerationConstantContext> enumerationConstant() {
			return getRuleContexts(EnumerationConstantContext.class);
		}
		public EnumerationTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerationType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).enterEnumerationType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).exitEnumerationType(this);
		}
	}

	public final EnumerationTypeContext enumerationType() throws RecognitionException {
		EnumerationTypeContext _localctx = new EnumerationTypeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_enumerationType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187); match(TBUN);
			setState(188); enumerationConstant();
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(189); match(T__2);
				setState(190); enumerationConstant();
				}
				}
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(196); match(BBUN);
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

	public static class EnumerationConstantContext extends ParserRuleContext {
		public ConstantIdentifierContext constantIdentifier() {
			return getRuleContext(ConstantIdentifierContext.class,0);
		}
		public EnumerationConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerationConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).enterEnumerationConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).exitEnumerationConstant(this);
		}
	}

	public final EnumerationConstantContext enumerationConstant() throws RecognitionException {
		EnumerationConstantContext _localctx = new EnumerationConstantContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_enumerationConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198); constantIdentifier();
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
		enterRule(_localctx, 38, RULE_typeIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200); match(IDENTIFIER);
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
		enterRule(_localctx, 40, RULE_statement);
		try {
			setState(209);
			switch (_input.LA(1)) {
			case ANETERNITYLATER:
				enterOuterAlt(_localctx, 1);
				{
				setState(202); compoundStatement();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(203); assignmentStatement();
				}
				break;
			case FISFORFRIENDS:
				enterOuterAlt(_localctx, 3);
				{
				setState(204); ifStatement();
				}
				break;
			case RAVIOLIRAVIOLIGIVEME:
				enterOuterAlt(_localctx, 4);
				{
				setState(205); whileStatement();
				}
				break;
			case ORDERUP:
				enterOuterAlt(_localctx, 5);
				{
				setState(206); writeStatement();
				}
				break;
			case YOUFORGOTTHEPICKLES:
				enterOuterAlt(_localctx, 6);
				{
				setState(207); writelnStatement();
				}
				break;
			case T__18:
			case GOODBYEFRIEND:
			case FISFORFIRE:
				enterOuterAlt(_localctx, 7);
				{
				setState(208); emptyStatement();
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
		enterRule(_localctx, 42, RULE_compoundStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211); match(ANETERNITYLATER);
			setState(212); statementlist();
			setState(213); match(GOODBYEFRIEND);
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
		enterRule(_localctx, 44, RULE_emptyStatement);
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
		enterRule(_localctx, 46, RULE_statementlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217); statement();
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__18) {
				{
				{
				setState(218); match(T__18);
				setState(219); statement();
				}
				}
				setState(224);
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
		enterRule(_localctx, 48, RULE_assignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225); lhs();
			setState(226); match(T__4);
			setState(227); rhs();
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
		enterRule(_localctx, 50, RULE_lhs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229); variable();
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
		enterRule(_localctx, 52, RULE_rhs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231); expression();
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
		public TerminalNode TBUN() { return getToken(Spongebob_SquarepantsParser.TBUN, 0); }
		public TerminalNode BBUN() { return getToken(Spongebob_SquarepantsParser.BBUN, 0); }
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
		enterRule(_localctx, 54, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233); match(FISFORFRIENDS);
			setState(234); match(TBUN);
			setState(235); expression();
			setState(236); match(BBUN);
			setState(237); truestatement();
			setState(240);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(238); match(FISFORFIRE);
				setState(239); falsestatement();
				}
				break;
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
		enterRule(_localctx, 56, RULE_truestatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242); statement();
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
		enterRule(_localctx, 58, RULE_falsestatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244); statement();
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode THEFORMULOLI() { return getToken(Spongebob_SquarepantsParser.THEFORMULOLI, 0); }
		public TerminalNode RAVIOLIRAVIOLIGIVEME() { return getToken(Spongebob_SquarepantsParser.RAVIOLIRAVIOLIGIVEME, 0); }
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
		enterRule(_localctx, 60, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246); match(RAVIOLIRAVIOLIGIVEME);
			setState(247); expression();
			setState(248); match(THEFORMULOLI);
			setState(249); statement();
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
		public TerminalNode TBUN() { return getToken(Spongebob_SquarepantsParser.TBUN, 0); }
		public TerminalNode BBUN() { return getToken(Spongebob_SquarepantsParser.BBUN, 0); }
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
		enterRule(_localctx, 62, RULE_writeStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251); match(ORDERUP);
			setState(252); match(TBUN);
			setState(253); writeArguments();
			setState(254); match(BBUN);
			setState(255); match(T__18);
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
		public TerminalNode TBUN() { return getToken(Spongebob_SquarepantsParser.TBUN, 0); }
		public TerminalNode BBUN() { return getToken(Spongebob_SquarepantsParser.BBUN, 0); }
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
		enterRule(_localctx, 64, RULE_writelnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257); match(YOUFORGOTTHEPICKLES);
			setState(258); match(TBUN);
			setState(259); writeArguments();
			setState(260); match(BBUN);
			setState(261); match(T__18);
			setState(262); match(MAGICCONCH);
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
		enterRule(_localctx, 66, RULE_writeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264); writeArgument();
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(265); match(T__2);
				setState(266); writeArgument();
				}
				}
				setState(271);
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
		enterRule(_localctx, 68, RULE_writeArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272); expression();
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
		public SimpleExpressionContext simpleExpression(int i) {
			return getRuleContext(SimpleExpressionContext.class,i);
		}
		public List<SimpleExpressionContext> simpleExpression() {
			return getRuleContexts(SimpleExpressionContext.class);
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
		enterRule(_localctx, 70, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274); simpleExpression();
			setState(278);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__15) | (1L << T__13) | (1L << T__12) | (1L << T__10) | (1L << T__9))) != 0)) {
				{
				setState(275); relOp();
				setState(276); simpleExpression();
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

	public static class SimpleExpressionContext extends ParserRuleContext {
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
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public List<AddOpContext> addOp() {
			return getRuleContexts(AddOpContext.class);
		}
		public SimpleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).enterSimpleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).exitSimpleExpression(this);
		}
	}

	public final SimpleExpressionContext simpleExpression() throws RecognitionException {
		SimpleExpressionContext _localctx = new SimpleExpressionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_simpleExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			_la = _input.LA(1);
			if (_la==T__3 || _la==T__1) {
				{
				setState(280); sign();
				}
			}

			setState(283); term();
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__7) | (1L << OR))) != 0)) {
				{
				{
				setState(284); addOp();
				setState(285); term();
				}
				}
				setState(291);
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
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public List<MulOpContext> mulOp() {
			return getRuleContexts(MulOpContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
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
		enterRule(_localctx, 74, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292); factor();
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__5) | (1L << AND))) != 0)) {
				{
				{
				setState(293); mulOp();
				setState(294); factor();
				}
				}
				setState(300);
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

	public static class FactorContext extends ParserRuleContext {
		public Typespec * type;
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode DOODLEBOB() { return getToken(Spongebob_SquarepantsParser.DOODLEBOB, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_factor);
		try {
			setState(311);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(301); variable();
				}
				break;
			case BUBBLEBUDDY:
			case SPONGEBOB:
				enterOuterAlt(_localctx, 2);
				{
				setState(302); number();
				}
				break;
			case PLANKTON:
				enterOuterAlt(_localctx, 3);
				{
				setState(303); characterConstant();
				}
				break;
			case SQUIDWARD:
				enterOuterAlt(_localctx, 4);
				{
				setState(304); stringConstant();
				}
				break;
			case DOODLEBOB:
				enterOuterAlt(_localctx, 5);
				{
				setState(305); match(DOODLEBOB);
				setState(306); factor();
				}
				break;
			case TBUN:
				enterOuterAlt(_localctx, 6);
				{
				setState(307); match(TBUN);
				setState(308); expression();
				setState(309); match(BBUN);
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
		public Typespec * type;
		public SymtabEntry * entry;
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public VariableIdentifierContext variableIdentifier() {
			return getRuleContext(VariableIdentifierContext.class,0);
		}
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
		enterRule(_localctx, 78, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313); variableIdentifier();
			setState(317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14 || _la==T__0) {
				{
				{
				setState(314); modifier();
				}
				}
				setState(319);
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

	public static class ModifierContext extends ParserRuleContext {
		public IndexListContext indexList() {
			return getRuleContext(IndexListContext.class,0);
		}
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).exitModifier(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_modifier);
		try {
			setState(326);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(320); match(T__14);
				setState(321); indexList();
				setState(322); match(T__11);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(324); match(T__0);
				setState(325); field();
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

	public static class IndexListContext extends ParserRuleContext {
		public IndexContext index(int i) {
			return getRuleContext(IndexContext.class,i);
		}
		public List<IndexContext> index() {
			return getRuleContexts(IndexContext.class);
		}
		public IndexListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).enterIndexList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).exitIndexList(this);
		}
	}

	public final IndexListContext indexList() throws RecognitionException {
		IndexListContext _localctx = new IndexListContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_indexList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328); index();
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(329); match(T__2);
				setState(330); index();
				}
				}
				setState(335);
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

	public static class IndexContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).enterIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).exitIndex(this);
		}
	}

	public final IndexContext index() throws RecognitionException {
		IndexContext _localctx = new IndexContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_index);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336); expression();
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

	public static class FieldContext extends ParserRuleContext {
		public Typespec * type;
		public SymtabEntry * entry;
		public TerminalNode IDENTIFIER() { return getToken(Spongebob_SquarepantsParser.IDENTIFIER, 0); }
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Spongebob_SquarepantsListener ) ((Spongebob_SquarepantsListener)listener).exitField(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338); match(IDENTIFIER);
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
		enterRule(_localctx, 88, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340); unsignedNumber();
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
		enterRule(_localctx, 90, RULE_unsignedNumber);
		try {
			setState(344);
			switch (_input.LA(1)) {
			case BUBBLEBUDDY:
				enterOuterAlt(_localctx, 1);
				{
				setState(342); integerConstant();
				}
				break;
			case SPONGEBOB:
				enterOuterAlt(_localctx, 2);
				{
				setState(343); realConstant();
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
		enterRule(_localctx, 92, RULE_integerConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346); match(BUBBLEBUDDY);
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
		enterRule(_localctx, 94, RULE_realConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348); match(SPONGEBOB);
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
		enterRule(_localctx, 96, RULE_characterConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350); match(PLANKTON);
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
		enterRule(_localctx, 98, RULE_stringConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352); match(SQUIDWARD);
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
		enterRule(_localctx, 100, RULE_relOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__15) | (1L << T__13) | (1L << T__12) | (1L << T__10) | (1L << T__9))) != 0)) ) {
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
		enterRule(_localctx, 102, RULE_addOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__7) | (1L << OR))) != 0)) ) {
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
		enterRule(_localctx, 104, RULE_mulOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__5) | (1L << AND))) != 0)) ) {
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3/\u016b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\5\5z\n\5\3\5\3\5\3\5\5\5\177\n\5\3\6\3\6\3\6\3\7\3\7\3\7\7\7\u0087"+
		"\n\7\f\7\16\7\u008a\13\7\3\b\3\b\3\b\3\b\3\t\3\t\3\n\5\n\u0093\n\n\3\n"+
		"\3\n\5\n\u0097\n\n\3\n\3\n\5\n\u009b\n\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\7\r\u00a5\n\r\f\r\16\r\u00a8\13\r\3\16\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\7\17\u00b1\n\17\f\17\16\17\u00b4\13\17\3\20\3\20\3\21\3\21\3\22\3"+
		"\22\5\22\u00bc\n\22\3\23\3\23\3\23\3\23\7\23\u00c2\n\23\f\23\16\23\u00c5"+
		"\13\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\5\26\u00d4\n\26\3\27\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\31\7\31\u00df"+
		"\n\31\f\31\16\31\u00e2\13\31\3\32\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u00f3\n\35\3\36\3\36\3\37\3\37"+
		"\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3"+
		"#\7#\u010e\n#\f#\16#\u0111\13#\3$\3$\3%\3%\3%\3%\5%\u0119\n%\3&\5&\u011c"+
		"\n&\3&\3&\3&\3&\7&\u0122\n&\f&\16&\u0125\13&\3\'\3\'\3\'\3\'\7\'\u012b"+
		"\n\'\f\'\16\'\u012e\13\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u013a\n(\3)"+
		"\3)\7)\u013e\n)\f)\16)\u0141\13)\3*\3*\3*\3*\3*\3*\5*\u0149\n*\3+\3+\3"+
		"+\7+\u014e\n+\f+\16+\u0151\13+\3,\3,\3-\3-\3.\3.\3/\3/\5/\u015b\n/\3\60"+
		"\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\66"+
		"\2\2\67\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:"+
		"<>@BDFHJLNPRTVXZ\\^`bdfhj\2\6\4\2\22\22\24\24\5\2\5\6\b\t\13\f\5\2\4\4"+
		"\16\16##\4\2\17\20$$\u0156\2l\3\2\2\2\4p\3\2\2\2\6s\3\2\2\2\by\3\2\2\2"+
		"\n\u0080\3\2\2\2\f\u0083\3\2\2\2\16\u008b\3\2\2\2\20\u008f\3\2\2\2\22"+
		"\u009a\3\2\2\2\24\u009c\3\2\2\2\26\u009e\3\2\2\2\30\u00a1\3\2\2\2\32\u00a9"+
		"\3\2\2\2\34\u00ad\3\2\2\2\36\u00b5\3\2\2\2 \u00b7\3\2\2\2\"\u00bb\3\2"+
		"\2\2$\u00bd\3\2\2\2&\u00c8\3\2\2\2(\u00ca\3\2\2\2*\u00d3\3\2\2\2,\u00d5"+
		"\3\2\2\2.\u00d9\3\2\2\2\60\u00db\3\2\2\2\62\u00e3\3\2\2\2\64\u00e7\3\2"+
		"\2\2\66\u00e9\3\2\2\28\u00eb\3\2\2\2:\u00f4\3\2\2\2<\u00f6\3\2\2\2>\u00f8"+
		"\3\2\2\2@\u00fd\3\2\2\2B\u0103\3\2\2\2D\u010a\3\2\2\2F\u0112\3\2\2\2H"+
		"\u0114\3\2\2\2J\u011b\3\2\2\2L\u0126\3\2\2\2N\u0139\3\2\2\2P\u013b\3\2"+
		"\2\2R\u0148\3\2\2\2T\u014a\3\2\2\2V\u0152\3\2\2\2X\u0154\3\2\2\2Z\u0156"+
		"\3\2\2\2\\\u015a\3\2\2\2^\u015c\3\2\2\2`\u015e\3\2\2\2b\u0160\3\2\2\2"+
		"d\u0162\3\2\2\2f\u0164\3\2\2\2h\u0166\3\2\2\2j\u0168\3\2\2\2lm\5\4\3\2"+
		"mn\5\6\4\2no\7\r\2\2o\3\3\2\2\2pq\7\26\2\2qr\7\3\2\2r\5\3\2\2\2st\5\b"+
		"\5\2tu\5,\27\2u\7\3\2\2\2vw\5\n\6\2wx\7\3\2\2xz\3\2\2\2yv\3\2\2\2yz\3"+
		"\2\2\2z~\3\2\2\2{|\5\26\f\2|}\7\3\2\2}\177\3\2\2\2~{\3\2\2\2~\177\3\2"+
		"\2\2\177\t\3\2\2\2\u0080\u0081\7\27\2\2\u0081\u0082\5\f\7\2\u0082\13\3"+
		"\2\2\2\u0083\u0088\5\16\b\2\u0084\u0085\7\3\2\2\u0085\u0087\5\16\b\2\u0086"+
		"\u0084\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2"+
		"\2\2\u0089\r\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u008c\5\20\t\2\u008c\u008d"+
		"\7\21\2\2\u008d\u008e\5\22\n\2\u008e\17\3\2\2\2\u008f\u0090\7(\2\2\u0090"+
		"\21\3\2\2\2\u0091\u0093\5\24\13\2\u0092\u0091\3\2\2\2\u0092\u0093\3\2"+
		"\2\2\u0093\u0096\3\2\2\2\u0094\u0097\7(\2\2\u0095\u0097\5\\/\2\u0096\u0094"+
		"\3\2\2\2\u0096\u0095\3\2\2\2\u0097\u009b\3\2\2\2\u0098\u009b\5b\62\2\u0099"+
		"\u009b\5d\63\2\u009a\u0092\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u0099\3\2"+
		"\2\2\u009b\23\3\2\2\2\u009c\u009d\t\2\2\2\u009d\25\3\2\2\2\u009e\u009f"+
		"\7\"\2\2\u009f\u00a0\5\30\r\2\u00a0\27\3\2\2\2\u00a1\u00a6\5\32\16\2\u00a2"+
		"\u00a3\7\3\2\2\u00a3\u00a5\5\32\16\2\u00a4\u00a2\3\2\2\2\u00a5\u00a8\3"+
		"\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\31\3\2\2\2\u00a8"+
		"\u00a6\3\2\2\2\u00a9\u00aa\5\34\17\2\u00aa\u00ab\7\21\2\2\u00ab\u00ac"+
		"\5 \21\2\u00ac\33\3\2\2\2\u00ad\u00b2\5\36\20\2\u00ae\u00af\7\23\2\2\u00af"+
		"\u00b1\5\36\20\2\u00b0\u00ae\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3"+
		"\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\35\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5"+
		"\u00b6\7(\2\2\u00b6\37\3\2\2\2\u00b7\u00b8\5\"\22\2\u00b8!\3\2\2\2\u00b9"+
		"\u00bc\5(\25\2\u00ba\u00bc\5$\23\2\u00bb\u00b9\3\2\2\2\u00bb\u00ba\3\2"+
		"\2\2\u00bc#\3\2\2\2\u00bd\u00be\7%\2\2\u00be\u00c3\5&\24\2\u00bf\u00c0"+
		"\7\23\2\2\u00c0\u00c2\5&\24\2\u00c1\u00bf\3\2\2\2\u00c2\u00c5\3\2\2\2"+
		"\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c6\3\2\2\2\u00c5\u00c3"+
		"\3\2\2\2\u00c6\u00c7\7&\2\2\u00c7%\3\2\2\2\u00c8\u00c9\5\20\t\2\u00c9"+
		"\'\3\2\2\2\u00ca\u00cb\7(\2\2\u00cb)\3\2\2\2\u00cc\u00d4\5,\27\2\u00cd"+
		"\u00d4\5\62\32\2\u00ce\u00d4\58\35\2\u00cf\u00d4\5> \2\u00d0\u00d4\5@"+
		"!\2\u00d1\u00d4\5B\"\2\u00d2\u00d4\5.\30\2\u00d3\u00cc\3\2\2\2\u00d3\u00cd"+
		"\3\2\2\2\u00d3\u00ce\3\2\2\2\u00d3\u00cf\3\2\2\2\u00d3\u00d0\3\2\2\2\u00d3"+
		"\u00d1\3\2\2\2\u00d3\u00d2\3\2\2\2\u00d4+\3\2\2\2\u00d5\u00d6\7\30\2\2"+
		"\u00d6\u00d7\5\60\31\2\u00d7\u00d8\7\31\2\2\u00d8-\3\2\2\2\u00d9\u00da"+
		"\3\2\2\2\u00da/\3\2\2\2\u00db\u00e0\5*\26\2\u00dc\u00dd\7\3\2\2\u00dd"+
		"\u00df\5*\26\2\u00de\u00dc\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de\3\2"+
		"\2\2\u00e0\u00e1\3\2\2\2\u00e1\61\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00e4"+
		"\5\64\33\2\u00e4\u00e5\7\21\2\2\u00e5\u00e6\5\66\34\2\u00e6\63\3\2\2\2"+
		"\u00e7\u00e8\5P)\2\u00e8\65\3\2\2\2\u00e9\u00ea\5H%\2\u00ea\67\3\2\2\2"+
		"\u00eb\u00ec\7\32\2\2\u00ec\u00ed\7%\2\2\u00ed\u00ee\5H%\2\u00ee\u00ef"+
		"\7&\2\2\u00ef\u00f2\5:\36\2\u00f0\u00f1\7\33\2\2\u00f1\u00f3\5<\37\2\u00f2"+
		"\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f39\3\2\2\2\u00f4\u00f5\5*\26\2"+
		"\u00f5;\3\2\2\2\u00f6\u00f7\5*\26\2\u00f7=\3\2\2\2\u00f8\u00f9\7\34\2"+
		"\2\u00f9\u00fa\5H%\2\u00fa\u00fb\7\35\2\2\u00fb\u00fc\5*\26\2\u00fc?\3"+
		"\2\2\2\u00fd\u00fe\7\37\2\2\u00fe\u00ff\7%\2\2\u00ff\u0100\5D#\2\u0100"+
		"\u0101\7&\2\2\u0101\u0102\7\3\2\2\u0102A\3\2\2\2\u0103\u0104\7 \2\2\u0104"+
		"\u0105\7%\2\2\u0105\u0106\5D#\2\u0106\u0107\7&\2\2\u0107\u0108\7\3\2\2"+
		"\u0108\u0109\7.\2\2\u0109C\3\2\2\2\u010a\u010f\5F$\2\u010b\u010c\7\23"+
		"\2\2\u010c\u010e\5F$\2\u010d\u010b\3\2\2\2\u010e\u0111\3\2\2\2\u010f\u010d"+
		"\3\2\2\2\u010f\u0110\3\2\2\2\u0110E\3\2\2\2\u0111\u010f\3\2\2\2\u0112"+
		"\u0113\5H%\2\u0113G\3\2\2\2\u0114\u0118\5J&\2\u0115\u0116\5f\64\2\u0116"+
		"\u0117\5J&\2\u0117\u0119\3\2\2\2\u0118\u0115\3\2\2\2\u0118\u0119\3\2\2"+
		"\2\u0119I\3\2\2\2\u011a\u011c\5\24\13\2\u011b\u011a\3\2\2\2\u011b\u011c"+
		"\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u0123\5L\'\2\u011e\u011f\5h\65\2\u011f"+
		"\u0120\5L\'\2\u0120\u0122\3\2\2\2\u0121\u011e\3\2\2\2\u0122\u0125\3\2"+
		"\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124K\3\2\2\2\u0125\u0123"+
		"\3\2\2\2\u0126\u012c\5N(\2\u0127\u0128\5j\66\2\u0128\u0129\5N(\2\u0129"+
		"\u012b\3\2\2\2\u012a\u0127\3\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a\3\2"+
		"\2\2\u012c\u012d\3\2\2\2\u012dM\3\2\2\2\u012e\u012c\3\2\2\2\u012f\u013a"+
		"\5P)\2\u0130\u013a\5Z.\2\u0131\u013a\5b\62\2\u0132\u013a\5d\63\2\u0133"+
		"\u0134\7!\2\2\u0134\u013a\5N(\2\u0135\u0136\7%\2\2\u0136\u0137\5H%\2\u0137"+
		"\u0138\7&\2\2\u0138\u013a\3\2\2\2\u0139\u012f\3\2\2\2\u0139\u0130\3\2"+
		"\2\2\u0139\u0131\3\2\2\2\u0139\u0132\3\2\2\2\u0139\u0133\3\2\2\2\u0139"+
		"\u0135\3\2\2\2\u013aO\3\2\2\2\u013b\u013f\5\36\20\2\u013c\u013e\5R*\2"+
		"\u013d\u013c\3\2\2\2\u013e\u0141\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u0140"+
		"\3\2\2\2\u0140Q\3\2\2\2\u0141\u013f\3\2\2\2\u0142\u0143\7\7\2\2\u0143"+
		"\u0144\5T+\2\u0144\u0145\7\n\2\2\u0145\u0149\3\2\2\2\u0146\u0147\7\25"+
		"\2\2\u0147\u0149\5X-\2\u0148\u0142\3\2\2\2\u0148\u0146\3\2\2\2\u0149S"+
		"\3\2\2\2\u014a\u014f\5V,\2\u014b\u014c\7\23\2\2\u014c\u014e\5V,\2\u014d"+
		"\u014b\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2"+
		"\2\2\u0150U\3\2\2\2\u0151\u014f\3\2\2\2\u0152\u0153\5H%\2\u0153W\3\2\2"+
		"\2\u0154\u0155\7(\2\2\u0155Y\3\2\2\2\u0156\u0157\5\\/\2\u0157[\3\2\2\2"+
		"\u0158\u015b\5^\60\2\u0159\u015b\5`\61\2\u015a\u0158\3\2\2\2\u015a\u0159"+
		"\3\2\2\2\u015b]\3\2\2\2\u015c\u015d\7)\2\2\u015d_\3\2\2\2\u015e\u015f"+
		"\7*\2\2\u015fa\3\2\2\2\u0160\u0161\7,\2\2\u0161c\3\2\2\2\u0162\u0163\7"+
		"-\2\2\u0163e\3\2\2\2\u0164\u0165\t\3\2\2\u0165g\3\2\2\2\u0166\u0167\t"+
		"\4\2\2\u0167i\3\2\2\2\u0168\u0169\t\5\2\2\u0169k\3\2\2\2\31y~\u0088\u0092"+
		"\u0096\u009a\u00a6\u00b2\u00bb\u00c3\u00d3\u00e0\u00f2\u010f\u0118\u011b"+
		"\u0123\u012c\u0139\u013f\u0148\u014f\u015a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}