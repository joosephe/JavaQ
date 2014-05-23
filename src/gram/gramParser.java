// Generated from gram.g4 by ANTLR 4.2.2
package gram;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gramParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__32=1, T__31=2, T__30=3, T__29=4, T__28=5, T__27=6, T__26=7, T__25=8, 
		T__24=9, T__23=10, T__22=11, T__21=12, T__20=13, T__19=14, T__18=15, T__17=16, 
		T__16=17, T__15=18, T__14=19, T__13=20, T__12=21, T__11=22, T__10=23, 
		T__9=24, T__8=25, T__7=26, T__6=27, T__5=28, T__4=29, T__3=30, T__2=31, 
		T__1=32, T__0=33, Name=34, String=35, Number=36, WS=37;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "'state'", "'char'", "'!='", "'float'", "'while'", 
		"';'", "'{'", "'='", "'}'", "'if'", "'for'", "'<='", "'complex'", "'int'", 
		"'('", "'*'", "'circuit'", "','", "'gate'", "'>='", "'ensemble'", "'=='", 
		"'<'", "'bool'", "'>'", "'measurement'", "'string'", "')'", "'+'", "'transformation'", 
		"'-'", "'qubit'", "Name", "String", "Number", "WS"
	};
	public static final int
		RULE_program = 0, RULE_function = 1, RULE_functionInit = 2, RULE_functionCall = 3, 
		RULE_statements = 4, RULE_statement = 5, RULE_paramInits = 6, RULE_paramValues = 7, 
		RULE_initParameters = 8, RULE_parameters = 9, RULE_parameter = 10, RULE_functionCallParameter = 11, 
		RULE_expression = 12, RULE_expression0 = 13, RULE_expression1 = 14, RULE_expression2 = 15, 
		RULE_expression3 = 16, RULE_expression4 = 17, RULE_expression5 = 18, RULE_loops = 19, 
		RULE_forConditions = 20, RULE_conditionals = 21, RULE_conditions = 22, 
		RULE_paramValue = 23, RULE_type = 24;
	public static final String[] ruleNames = {
		"program", "function", "functionInit", "functionCall", "statements", "statement", 
		"paramInits", "paramValues", "initParameters", "parameters", "parameter", 
		"functionCallParameter", "expression", "expression0", "expression1", "expression2", 
		"expression3", "expression4", "expression5", "loops", "forConditions", 
		"conditionals", "conditions", "paramValue", "type"
	};

	@Override
	public String getGrammarFileName() { return "gram.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public gramParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(50); function();
				}
				}
				setState(53); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==18 );
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

	public static class FunctionContext extends ParserRuleContext {
		public FunctionInitContext functionInit() {
			return getRuleContext(FunctionInitContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55); match(18);
			setState(56); type();
			setState(57); functionInit();
			setState(58); match(8);
			setState(59); statements();
			setState(60); match(10);
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

	public static class FunctionInitContext extends ParserRuleContext {
		public InitParametersContext initParameters() {
			return getRuleContext(InitParametersContext.class,0);
		}
		public TerminalNode Name() { return getToken(gramParser.Name, 0); }
		public FunctionInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionInit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitFunctionInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionInitContext functionInit() throws RecognitionException {
		FunctionInitContext _localctx = new FunctionInitContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_functionInit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62); match(Name);
			setState(63); match(16);
			setState(65);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 3) | (1L << 5) | (1L << 14) | (1L << 15) | (1L << 20) | (1L << 22) | (1L << 25) | (1L << 27) | (1L << 28) | (1L << 31) | (1L << 33))) != 0)) {
				{
				setState(64); initParameters();
				}
			}

			setState(67); match(29);
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

	public static class FunctionCallContext extends ParserRuleContext {
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode Name() { return getToken(gramParser.Name, 0); }
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69); match(Name);
			setState(70); match(16);
			setState(72);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 3) | (1L << 5) | (1L << 14) | (1L << 15) | (1L << 20) | (1L << 22) | (1L << 25) | (1L << 27) | (1L << 28) | (1L << 31) | (1L << 33) | (1L << Name) | (1L << String) | (1L << Number))) != 0)) {
				{
				setState(71); parameters();
				}
			}

			setState(74); match(29);
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

	public static class StatementsContext extends ParserRuleContext {
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(76); statement();
				setState(77); match(7);
				}
				}
				setState(81); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 3) | (1L << 5) | (1L << 6) | (1L << 11) | (1L << 12) | (1L << 14) | (1L << 15) | (1L << 20) | (1L << 22) | (1L << 25) | (1L << 27) | (1L << 28) | (1L << 31) | (1L << 32) | (1L << 33) | (1L << Name) | (1L << String) | (1L << Number))) != 0) );
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
		public ConditionalsContext conditionals() {
			return getRuleContext(ConditionalsContext.class,0);
		}
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ParamInitsContext paramInits() {
			return getRuleContext(ParamInitsContext.class,0);
		}
		public LoopsContext loops() {
			return getRuleContext(LoopsContext.class,0);
		}
		public ParamValuesContext paramValues() {
			return getRuleContext(ParamValuesContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statement);
		try {
			setState(92);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(83); functionCall();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(84); parameter();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(85); paramInits();
				setState(86); match(9);
				setState(87); paramValues();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(89); loops();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(90); conditionals();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(91); expression();
				}
				break;
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

	public static class ParamInitsContext extends ParserRuleContext {
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode Name() { return getToken(gramParser.Name, 0); }
		public ParamInitsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramInits; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitParamInits(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamInitsContext paramInits() throws RecognitionException {
		ParamInitsContext _localctx = new ParamInitsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_paramInits);
		try {
			setState(97);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(94); parameter();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(95); functionCall();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(96); match(Name);
				}
				break;
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

	public static class ParamValuesContext extends ParserRuleContext {
		public ParamValueContext paramValue() {
			return getRuleContext(ParamValueContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode Name() { return getToken(gramParser.Name, 0); }
		public ParamValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramValues; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitParamValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamValuesContext paramValues() throws RecognitionException {
		ParamValuesContext _localctx = new ParamValuesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_paramValues);
		try {
			setState(102);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(99); functionCall();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(100); paramValue();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(101); match(Name);
				}
				break;
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

	public static class InitParametersContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public InitParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initParameters; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitInitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitParametersContext initParameters() throws RecognitionException {
		InitParametersContext _localctx = new InitParametersContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_initParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104); parameter();
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==19) {
				{
				{
				setState(105); match(19);
				setState(106); parameter();
				}
				}
				setState(111);
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

	public static class ParametersContext extends ParserRuleContext {
		public FunctionCallParameterContext functionCallParameter(int i) {
			return getRuleContext(FunctionCallParameterContext.class,i);
		}
		public List<FunctionCallParameterContext> functionCallParameter() {
			return getRuleContexts(FunctionCallParameterContext.class);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112); functionCallParameter();
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==19) {
				{
				{
				setState(113); match(19);
				setState(114); functionCallParameter();
				}
				}
				setState(119);
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

	public static class ParameterContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Name() { return getToken(gramParser.Name, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120); type();
			setState(121); match(Name);
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

	public static class FunctionCallParameterContext extends ParserRuleContext {
		public ParamValueContext paramValue() {
			return getRuleContext(ParamValueContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ParamInitsContext paramInits() {
			return getRuleContext(ParamInitsContext.class,0);
		}
		public ParamValuesContext paramValues() {
			return getRuleContext(ParamValuesContext.class,0);
		}
		public TerminalNode Name() { return getToken(gramParser.Name, 0); }
		public FunctionCallParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallParameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitFunctionCallParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallParameterContext functionCallParameter() throws RecognitionException {
		FunctionCallParameterContext _localctx = new FunctionCallParameterContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_functionCallParameter);
		try {
			setState(130);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(123); functionCall();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(124); paramInits();
				setState(125); match(9);
				setState(126); paramValues();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(128); match(Name);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(129); paramValue();
				}
				break;
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
		public Expression0Context expression0() {
			return getRuleContext(Expression0Context.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132); expression0();
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

	public static class Expression0Context extends ParserRuleContext {
		public Expression1Context expression1(int i) {
			return getRuleContext(Expression1Context.class,i);
		}
		public List<Expression1Context> expression1() {
			return getRuleContexts(Expression1Context.class);
		}
		public Expression0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression0; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitExpression0(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression0Context expression0() throws RecognitionException {
		Expression0Context _localctx = new Expression0Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_expression0);
		int _la;
		try {
			setState(139);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(134); expression1(0);
				setState(135);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 4) | (1L << 13) | (1L << 21) | (1L << 23) | (1L << 24) | (1L << 26))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(136); expression1(0);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(138); expression1(0);
				}
				break;
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

	public static class Expression1Context extends ParserRuleContext {
		public Expression2Context expression2() {
			return getRuleContext(Expression2Context.class,0);
		}
		public Expression1Context expression1() {
			return getRuleContext(Expression1Context.class,0);
		}
		public Expression1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression1; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitExpression1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression1Context expression1() throws RecognitionException {
		return expression1(0);
	}

	private Expression1Context expression1(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expression1Context _localctx = new Expression1Context(_ctx, _parentState);
		Expression1Context _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_expression1, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(142); expression2(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(149);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expression1Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression1);
					setState(144);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(145);
					_la = _input.LA(1);
					if ( !(_la==30 || _la==32) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(146); expression2(0);
					}
					} 
				}
				setState(151);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Expression2Context extends ParserRuleContext {
		public Expression2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression2; }
	 
		public Expression2Context() { }
		public void copyFrom(Expression2Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class KorrutamineJagamineContext extends Expression2Context {
		public Expression3Context expression3() {
			return getRuleContext(Expression3Context.class,0);
		}
		public Expression2Context expression2() {
			return getRuleContext(Expression2Context.class,0);
		}
		public KorrutamineJagamineContext(Expression2Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitKorrutamineJagamine(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TriviaalneAvaldis3Context extends Expression2Context {
		public Expression3Context expression3() {
			return getRuleContext(Expression3Context.class,0);
		}
		public TriviaalneAvaldis3Context(Expression2Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitTriviaalneAvaldis3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression2Context expression2() throws RecognitionException {
		return expression2(0);
	}

	private Expression2Context expression2(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expression2Context _localctx = new Expression2Context(_ctx, _parentState);
		Expression2Context _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_expression2, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new TriviaalneAvaldis3Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(153); expression3();
			}
			_ctx.stop = _input.LT(-1);
			setState(160);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new KorrutamineJagamineContext(new Expression2Context(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expression2);
					setState(155);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(156);
					_la = _input.LA(1);
					if ( !(_la==1 || _la==17) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(157); expression3();
					}
					} 
				}
				setState(162);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Expression3Context extends ParserRuleContext {
		public Expression3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression3; }
	 
		public Expression3Context() { }
		public void copyFrom(Expression3Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TriviaalneAvaldis2Context extends Expression3Context {
		public Expression4Context expression4() {
			return getRuleContext(Expression4Context.class,0);
		}
		public TriviaalneAvaldis2Context(Expression3Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitTriviaalneAvaldis2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaarneMiinusContext extends Expression3Context {
		public Expression3Context expression3() {
			return getRuleContext(Expression3Context.class,0);
		}
		public UnaarneMiinusContext(Expression3Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitUnaarneMiinus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression3Context expression3() throws RecognitionException {
		Expression3Context _localctx = new Expression3Context(_ctx, getState());
		enterRule(_localctx, 32, RULE_expression3);
		try {
			setState(166);
			switch (_input.LA(1)) {
			case 32:
				_localctx = new UnaarneMiinusContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(163); match(32);
				setState(164); expression3();
				}
				break;
			case Name:
			case String:
			case Number:
				_localctx = new TriviaalneAvaldis2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(165); expression4();
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

	public static class Expression4Context extends ParserRuleContext {
		public Expression4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression4; }
	 
		public Expression4Context() { }
		public void copyFrom(Expression4Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TriviaalneAvaldis1Context extends Expression4Context {
		public Expression5Context expression5() {
			return getRuleContext(Expression5Context.class,0);
		}
		public TriviaalneAvaldis1Context(Expression4Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitTriviaalneAvaldis1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunktsiooniValjakutseContext extends Expression4Context {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Name() { return getToken(gramParser.Name, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public FunktsiooniValjakutseContext(Expression4Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitFunktsiooniValjakutse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression4Context expression4() throws RecognitionException {
		Expression4Context _localctx = new Expression4Context(_ctx, getState());
		enterRule(_localctx, 34, RULE_expression4);
		int _la;
		try {
			setState(182);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new FunktsiooniValjakutseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(168); match(Name);
				setState(169); match(16);
				setState(178);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 32) | (1L << Name) | (1L << String) | (1L << Number))) != 0)) {
					{
					setState(170); expression();
					setState(175);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==19) {
						{
						{
						setState(171); match(19);
						setState(172); expression();
						}
						}
						setState(177);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(180); match(29);
				}
				break;

			case 2:
				_localctx = new TriviaalneAvaldis1Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(181); expression5();
				}
				break;
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

	public static class Expression5Context extends ParserRuleContext {
		public TerminalNode String() { return getToken(gramParser.String, 0); }
		public TerminalNode Number() { return getToken(gramParser.Number, 0); }
		public TerminalNode Name() { return getToken(gramParser.Name, 0); }
		public Expression5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression5; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitExpression5(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression5Context expression5() throws RecognitionException {
		Expression5Context _localctx = new Expression5Context(_ctx, getState());
		enterRule(_localctx, 36, RULE_expression5);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Name) | (1L << String) | (1L << Number))) != 0)) ) {
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

	public static class LoopsContext extends ParserRuleContext {
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public ForConditionsContext forConditions() {
			return getRuleContext(ForConditionsContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public LoopsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loops; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitLoops(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopsContext loops() throws RecognitionException {
		LoopsContext _localctx = new LoopsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_loops);
		try {
			setState(202);
			switch (_input.LA(1)) {
			case 12:
				enterOuterAlt(_localctx, 1);
				{
				setState(186); match(12);
				setState(187); match(16);
				setState(188); forConditions();
				setState(189); match(29);
				setState(190); match(8);
				setState(191); statements();
				setState(192); match(10);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 2);
				{
				setState(194); match(6);
				setState(195); match(16);
				setState(196); conditions();
				setState(197); match(29);
				setState(198); match(8);
				setState(199); statements();
				setState(200); match(10);
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

	public static class ForConditionsContext extends ParserRuleContext {
		public ForConditionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forConditions; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitForConditions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForConditionsContext forConditions() throws RecognitionException {
		ForConditionsContext _localctx = new ForConditionsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_forConditions);
		try {
			setState(206);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
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

	public static class ConditionalsContext extends ParserRuleContext {
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public ConditionalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionals; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitConditionals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalsContext conditionals() throws RecognitionException {
		ConditionalsContext _localctx = new ConditionalsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_conditionals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208); match(11);
			setState(209); match(16);
			setState(210); conditions();
			setState(211); match(29);
			setState(212); match(8);
			setState(213); statements();
			setState(214); match(10);
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

	public static class ConditionsContext extends ParserRuleContext {
		public ConditionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditions; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitConditions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionsContext conditions() throws RecognitionException {
		ConditionsContext _localctx = new ConditionsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_conditions);
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

	public static class ParamValueContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(gramParser.String, 0); }
		public TerminalNode Number() { return getToken(gramParser.Number, 0); }
		public ParamValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramValue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitParamValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamValueContext paramValue() throws RecognitionException {
		ParamValueContext _localctx = new ParamValueContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_paramValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			_la = _input.LA(1);
			if ( !(_la==String || _la==Number) ) {
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 3) | (1L << 5) | (1L << 14) | (1L << 15) | (1L << 20) | (1L << 22) | (1L << 25) | (1L << 27) | (1L << 28) | (1L << 31) | (1L << 33))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 14: return expression1_sempred((Expression1Context)_localctx, predIndex);

		case 15: return expression2_sempred((Expression2Context)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression2_sempred(Expression2Context _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expression1_sempred(Expression1Context _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\'\u00e1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\6\2\66\n\2\r\2\16\2\67\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4"+
		"\3\4\3\4\5\4D\n\4\3\4\3\4\3\5\3\5\3\5\5\5K\n\5\3\5\3\5\3\6\3\6\3\6\6\6"+
		"R\n\6\r\6\16\6S\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7_\n\7\3\b\3\b\3"+
		"\b\5\bd\n\b\3\t\3\t\3\t\5\ti\n\t\3\n\3\n\3\n\7\nn\n\n\f\n\16\nq\13\n\3"+
		"\13\3\13\3\13\7\13v\n\13\f\13\16\13y\13\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\5\r\u0085\n\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\5\17\u008e"+
		"\n\17\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u0096\n\20\f\20\16\20\u0099\13"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00a1\n\21\f\21\16\21\u00a4\13"+
		"\21\3\22\3\22\3\22\5\22\u00a9\n\22\3\23\3\23\3\23\3\23\3\23\7\23\u00b0"+
		"\n\23\f\23\16\23\u00b3\13\23\5\23\u00b5\n\23\3\23\3\23\5\23\u00b9\n\23"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\5\25\u00cd\n\25\3\26\3\26\5\26\u00d1\n\26\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\2"+
		"\4\36 \33\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\2\b\7"+
		"\2\6\6\17\17\27\27\31\32\34\34\4\2  \"\"\4\2\3\3\23\23\3\2$&\3\2%&\13"+
		"\2\4\5\7\7\20\21\26\26\30\30\33\33\35\36!!##\u00e2\2\65\3\2\2\2\49\3\2"+
		"\2\2\6@\3\2\2\2\bG\3\2\2\2\nQ\3\2\2\2\f^\3\2\2\2\16c\3\2\2\2\20h\3\2\2"+
		"\2\22j\3\2\2\2\24r\3\2\2\2\26z\3\2\2\2\30\u0084\3\2\2\2\32\u0086\3\2\2"+
		"\2\34\u008d\3\2\2\2\36\u008f\3\2\2\2 \u009a\3\2\2\2\"\u00a8\3\2\2\2$\u00b8"+
		"\3\2\2\2&\u00ba\3\2\2\2(\u00cc\3\2\2\2*\u00d0\3\2\2\2,\u00d2\3\2\2\2."+
		"\u00da\3\2\2\2\60\u00dc\3\2\2\2\62\u00de\3\2\2\2\64\66\5\4\3\2\65\64\3"+
		"\2\2\2\66\67\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28\3\3\2\2\29:\7\24\2\2:"+
		";\5\62\32\2;<\5\6\4\2<=\7\n\2\2=>\5\n\6\2>?\7\f\2\2?\5\3\2\2\2@A\7$\2"+
		"\2AC\7\22\2\2BD\5\22\n\2CB\3\2\2\2CD\3\2\2\2DE\3\2\2\2EF\7\37\2\2F\7\3"+
		"\2\2\2GH\7$\2\2HJ\7\22\2\2IK\5\24\13\2JI\3\2\2\2JK\3\2\2\2KL\3\2\2\2L"+
		"M\7\37\2\2M\t\3\2\2\2NO\5\f\7\2OP\7\t\2\2PR\3\2\2\2QN\3\2\2\2RS\3\2\2"+
		"\2SQ\3\2\2\2ST\3\2\2\2T\13\3\2\2\2U_\5\b\5\2V_\5\26\f\2WX\5\16\b\2XY\7"+
		"\13\2\2YZ\5\20\t\2Z_\3\2\2\2[_\5(\25\2\\_\5,\27\2]_\5\32\16\2^U\3\2\2"+
		"\2^V\3\2\2\2^W\3\2\2\2^[\3\2\2\2^\\\3\2\2\2^]\3\2\2\2_\r\3\2\2\2`d\5\26"+
		"\f\2ad\5\b\5\2bd\7$\2\2c`\3\2\2\2ca\3\2\2\2cb\3\2\2\2d\17\3\2\2\2ei\5"+
		"\b\5\2fi\5\60\31\2gi\7$\2\2he\3\2\2\2hf\3\2\2\2hg\3\2\2\2i\21\3\2\2\2"+
		"jo\5\26\f\2kl\7\25\2\2ln\5\26\f\2mk\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2"+
		"\2\2p\23\3\2\2\2qo\3\2\2\2rw\5\30\r\2st\7\25\2\2tv\5\30\r\2us\3\2\2\2"+
		"vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\25\3\2\2\2yw\3\2\2\2z{\5\62\32\2{|\7$"+
		"\2\2|\27\3\2\2\2}\u0085\5\b\5\2~\177\5\16\b\2\177\u0080\7\13\2\2\u0080"+
		"\u0081\5\20\t\2\u0081\u0085\3\2\2\2\u0082\u0085\7$\2\2\u0083\u0085\5\60"+
		"\31\2\u0084}\3\2\2\2\u0084~\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0083\3"+
		"\2\2\2\u0085\31\3\2\2\2\u0086\u0087\5\34\17\2\u0087\33\3\2\2\2\u0088\u0089"+
		"\5\36\20\2\u0089\u008a\t\2\2\2\u008a\u008b\5\36\20\2\u008b\u008e\3\2\2"+
		"\2\u008c\u008e\5\36\20\2\u008d\u0088\3\2\2\2\u008d\u008c\3\2\2\2\u008e"+
		"\35\3\2\2\2\u008f\u0090\b\20\1\2\u0090\u0091\5 \21\2\u0091\u0097\3\2\2"+
		"\2\u0092\u0093\f\4\2\2\u0093\u0094\t\3\2\2\u0094\u0096\5 \21\2\u0095\u0092"+
		"\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098"+
		"\37\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009b\b\21\1\2\u009b\u009c\5\"\22"+
		"\2\u009c\u00a2\3\2\2\2\u009d\u009e\f\4\2\2\u009e\u009f\t\4\2\2\u009f\u00a1"+
		"\5\"\22\2\u00a0\u009d\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2"+
		"\u00a2\u00a3\3\2\2\2\u00a3!\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a6\7"+
		"\"\2\2\u00a6\u00a9\5\"\22\2\u00a7\u00a9\5$\23\2\u00a8\u00a5\3\2\2\2\u00a8"+
		"\u00a7\3\2\2\2\u00a9#\3\2\2\2\u00aa\u00ab\7$\2\2\u00ab\u00b4\7\22\2\2"+
		"\u00ac\u00b1\5\32\16\2\u00ad\u00ae\7\25\2\2\u00ae\u00b0\5\32\16\2\u00af"+
		"\u00ad\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2"+
		"\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00ac\3\2\2\2\u00b4"+
		"\u00b5\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b9\7\37\2\2\u00b7\u00b9\5"+
		"&\24\2\u00b8\u00aa\3\2\2\2\u00b8\u00b7\3\2\2\2\u00b9%\3\2\2\2\u00ba\u00bb"+
		"\t\5\2\2\u00bb\'\3\2\2\2\u00bc\u00bd\7\16\2\2\u00bd\u00be\7\22\2\2\u00be"+
		"\u00bf\5*\26\2\u00bf\u00c0\7\37\2\2\u00c0\u00c1\7\n\2\2\u00c1\u00c2\5"+
		"\n\6\2\u00c2\u00c3\7\f\2\2\u00c3\u00cd\3\2\2\2\u00c4\u00c5\7\b\2\2\u00c5"+
		"\u00c6\7\22\2\2\u00c6\u00c7\5.\30\2\u00c7\u00c8\7\37\2\2\u00c8\u00c9\7"+
		"\n\2\2\u00c9\u00ca\5\n\6\2\u00ca\u00cb\7\f\2\2\u00cb\u00cd\3\2\2\2\u00cc"+
		"\u00bc\3\2\2\2\u00cc\u00c4\3\2\2\2\u00cd)\3\2\2\2\u00ce\u00d1\3\2\2\2"+
		"\u00cf\u00d1\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00cf\3\2\2\2\u00d1+\3"+
		"\2\2\2\u00d2\u00d3\7\r\2\2\u00d3\u00d4\7\22\2\2\u00d4\u00d5\5.\30\2\u00d5"+
		"\u00d6\7\37\2\2\u00d6\u00d7\7\n\2\2\u00d7\u00d8\5\n\6\2\u00d8\u00d9\7"+
		"\f\2\2\u00d9-\3\2\2\2\u00da\u00db\3\2\2\2\u00db/\3\2\2\2\u00dc\u00dd\t"+
		"\6\2\2\u00dd\61\3\2\2\2\u00de\u00df\t\7\2\2\u00df\63\3\2\2\2\25\67CJS"+
		"^chow\u0084\u008d\u0097\u00a2\u00a8\u00b1\u00b4\u00b8\u00cc\u00d0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}