// Generated from gram.g4 by ANTLR 4.2
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
		T__25=1, T__24=2, T__23=3, T__22=4, T__21=5, T__20=6, T__19=7, T__18=8, 
		T__17=9, T__16=10, T__15=11, T__14=12, T__13=13, T__12=14, T__11=15, T__10=16, 
		T__9=17, T__8=18, T__7=19, T__6=20, T__5=21, T__4=22, T__3=23, T__2=24, 
		T__1=25, T__0=26, Num=27, Sym2=28, Sym=29, WS=30;
	public static final String[] tokenNames = {
		"<INVALID>", "'()'", "','", "'while'", "'('", "'ensemble'", "'if'", "'int'", 
		"'state'", "'anything'", "'{'", "'gate'", "'}'", "'float'", "'\"'", "'char'", 
		"'qubit'", "'bool'", "')'", "'transformation'", "'for'", "'='", "'circuit'", 
		"';'", "'complex'", "'measurement'", "'string'", "Num", "Sym2", "Sym", 
		"WS"
	};
	public static final int
		RULE_program = 0, RULE_function = 1, RULE_functionCall = 2, RULE_statements = 3, 
		RULE_statement = 4, RULE_paramInits = 5, RULE_paramValues = 6, RULE_parameters = 7, 
		RULE_parameter = 8, RULE_loops = 9, RULE_forConditions = 10, RULE_conditionals = 11, 
		RULE_conditions = 12, RULE_paramValue = 13, RULE_type = 14, RULE_nameBegin = 15, 
		RULE_name = 16, RULE_string = 17, RULE_charSeq = 18, RULE_number = 19, 
		RULE_tahed = 20;
	public static final String[] ruleNames = {
		"program", "function", "functionCall", "statements", "statement", "paramInits", 
		"paramValues", "parameters", "parameter", "loops", "forConditions", "conditionals", 
		"conditions", "paramValue", "type", "nameBegin", "name", "string", "charSeq", 
		"number", "tahed"
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
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
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
		try {
			setState(46);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(42); function();
				setState(43); program();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(45); function();
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

	public static class FunctionContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
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
			setState(48); match(22);
			setState(49); type();
			setState(50); functionCall();
			setState(51); match(10);
			setState(52); statements();
			setState(53); match(12);
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
		public NameBeginContext nameBegin() {
			return getRuleContext(NameBeginContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
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
		enterRule(_localctx, 4, RULE_functionCall);
		try {
			setState(63);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(55); nameBegin();
				setState(56); match(4);
				setState(57); parameters();
				setState(58); match(18);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(60); nameBegin();
				setState(61); match(1);
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

	public static class StatementsContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
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
		enterRule(_localctx, 6, RULE_statements);
		try {
			setState(72);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(65); statement();
				setState(66); match(23);
				setState(67); statements();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(69); statement();
				setState(70); match(23);
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

	public static class StatementContext extends ParserRuleContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ParamInitsContext paramInits() {
			return getRuleContext(ParamInitsContext.class,0);
		}
		public LoopsContext loops() {
			return getRuleContext(LoopsContext.class,0);
		}
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public ParamValuesContext paramValues() {
			return getRuleContext(ParamValuesContext.class,0);
		}
		public ConditionalsContext conditionals() {
			return getRuleContext(ConditionalsContext.class,0);
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
		enterRule(_localctx, 8, RULE_statement);
		try {
			setState(82);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(74); functionCall();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(75); parameter();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(76); paramInits();
				setState(77); match(21);
				setState(78); paramValues();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(80); loops();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(81); conditionals();
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
		public NameBeginContext nameBegin() {
			return getRuleContext(NameBeginContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
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
		enterRule(_localctx, 10, RULE_paramInits);
		try {
			setState(87);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(84); parameter();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(85); functionCall();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(86); nameBegin();
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
		public NameBeginContext nameBegin() {
			return getRuleContext(NameBeginContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ParamValueContext paramValue() {
			return getRuleContext(ParamValueContext.class,0);
		}
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
		enterRule(_localctx, 12, RULE_paramValues);
		try {
			setState(92);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(89); functionCall();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(90); paramValue();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(91); nameBegin();
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

	public static class ParametersContext extends ParserRuleContext {
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
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
		enterRule(_localctx, 14, RULE_parameters);
		try {
			setState(99);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(94); parameter();
				setState(95); match(2);
				setState(96); parameters();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(98); parameter();
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

	public static class ParameterContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
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
		enterRule(_localctx, 16, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101); type();
			setState(102); name();
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
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public ForConditionsContext forConditions() {
			return getRuleContext(ForConditionsContext.class,0);
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
		enterRule(_localctx, 18, RULE_loops);
		try {
			setState(120);
			switch (_input.LA(1)) {
			case 20:
				enterOuterAlt(_localctx, 1);
				{
				setState(104); match(20);
				setState(105); match(4);
				setState(106); forConditions();
				setState(107); match(18);
				setState(108); match(10);
				setState(109); statements();
				setState(110); match(12);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 2);
				{
				setState(112); match(3);
				setState(113); match(4);
				setState(114); conditions();
				setState(115); match(18);
				setState(116); match(10);
				setState(117); statements();
				setState(118); match(12);
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
		enterRule(_localctx, 20, RULE_forConditions);
		try {
			setState(124);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
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
		enterRule(_localctx, 22, RULE_conditionals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126); match(6);
			setState(127); match(4);
			setState(128); conditions();
			setState(129); match(18);
			setState(130); match(10);
			setState(131); statements();
			setState(132); match(12);
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
		enterRule(_localctx, 24, RULE_conditions);
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
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
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
		enterRule(_localctx, 26, RULE_paramValue);
		try {
			setState(138);
			switch (_input.LA(1)) {
			case 14:
				enterOuterAlt(_localctx, 1);
				{
				setState(136); string();
				}
				break;
			case Num:
				enterOuterAlt(_localctx, 2);
				{
				setState(137); number();
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
		enterRule(_localctx, 28, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 5) | (1L << 7) | (1L << 8) | (1L << 11) | (1L << 13) | (1L << 15) | (1L << 16) | (1L << 17) | (1L << 19) | (1L << 24) | (1L << 25) | (1L << 26))) != 0)) ) {
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

	public static class NameBeginContext extends ParserRuleContext {
		public TerminalNode Sym2() { return getToken(gramParser.Sym2, 0); }
		public TerminalNode Sym() { return getToken(gramParser.Sym, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public NameBeginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameBegin; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitNameBegin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameBeginContext nameBegin() throws RecognitionException {
		NameBeginContext _localctx = new NameBeginContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_nameBegin);
		try {
			setState(148);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(142); match(Sym2);
				setState(143); name();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(144); match(Sym2);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(145); match(Sym);
				setState(146); name();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(147); match(Sym);
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

	public static class NameContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public CharSeqContext charSeq() {
			return getRuleContext(CharSeqContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_name);
		try {
			setState(158);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(150); charSeq();
				setState(151); name();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(153); number();
				setState(154); name();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(156); charSeq();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(157); number();
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

	public static class StringContext extends ParserRuleContext {
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160); match(14);
			setState(161); match(9);
			setState(162); match(14);
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

	public static class CharSeqContext extends ParserRuleContext {
		public TerminalNode Sym2() { return getToken(gramParser.Sym2, 0); }
		public CharSeqContext charSeq() {
			return getRuleContext(CharSeqContext.class,0);
		}
		public TerminalNode Sym() { return getToken(gramParser.Sym, 0); }
		public CharSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charSeq; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitCharSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharSeqContext charSeq() throws RecognitionException {
		CharSeqContext _localctx = new CharSeqContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_charSeq);
		try {
			setState(170);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(164); match(Sym2);
				setState(165); charSeq();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(166); match(Sym);
				setState(167); charSeq();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(168); match(Sym2);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(169); match(Sym);
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode Num() { return getToken(gramParser.Num, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_number);
		try {
			setState(175);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(172); match(Num);
				setState(173); number();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(174); match(Num);
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

	public static class TahedContext extends ParserRuleContext {
		public TahedContext tahed() {
			return getRuleContext(TahedContext.class,0);
		}
		public TerminalNode Sym() { return getToken(gramParser.Sym, 0); }
		public TahedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tahed; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitTahed(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TahedContext tahed() throws RecognitionException {
		return tahed(0);
	}

	private TahedContext tahed(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TahedContext _localctx = new TahedContext(_ctx, _parentState);
		TahedContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_tahed, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(178); match(Sym);
			}
			_ctx.stop = _input.LT(-1);
			setState(184);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TahedContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_tahed);
					setState(180);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(181); match(Sym);
					}
					} 
				}
				setState(186);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 20: return tahed_sempred((TahedContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean tahed_sempred(TahedContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3 \u00be\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\5\2\61\n\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4B\n\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5K\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5"+
		"\6U\n\6\3\7\3\7\3\7\5\7Z\n\7\3\b\3\b\3\b\5\b_\n\b\3\t\3\t\3\t\3\t\3\t"+
		"\5\tf\n\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\5\13{\n\13\3\f\3\f\5\f\177\n\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\5\17\u008d\n\17\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0097\n\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\5\22\u00a1\n\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\5\24\u00ad\n\24\3\25\3\25\3\25\5\25\u00b2\n\25\3\26\3\26\3"+
		"\26\3\26\3\26\7\26\u00b9\n\26\f\26\16\26\u00bc\13\26\3\26\2\3*\27\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*\2\3\t\2\7\7\t\n\r\r\17\17\21"+
		"\23\25\25\32\34\u00c2\2\60\3\2\2\2\4\62\3\2\2\2\6A\3\2\2\2\bJ\3\2\2\2"+
		"\nT\3\2\2\2\fY\3\2\2\2\16^\3\2\2\2\20e\3\2\2\2\22g\3\2\2\2\24z\3\2\2\2"+
		"\26~\3\2\2\2\30\u0080\3\2\2\2\32\u0088\3\2\2\2\34\u008c\3\2\2\2\36\u008e"+
		"\3\2\2\2 \u0096\3\2\2\2\"\u00a0\3\2\2\2$\u00a2\3\2\2\2&\u00ac\3\2\2\2"+
		"(\u00b1\3\2\2\2*\u00b3\3\2\2\2,-\5\4\3\2-.\5\2\2\2.\61\3\2\2\2/\61\5\4"+
		"\3\2\60,\3\2\2\2\60/\3\2\2\2\61\3\3\2\2\2\62\63\7\30\2\2\63\64\5\36\20"+
		"\2\64\65\5\6\4\2\65\66\7\f\2\2\66\67\5\b\5\2\678\7\16\2\28\5\3\2\2\29"+
		":\5 \21\2:;\7\6\2\2;<\5\20\t\2<=\7\24\2\2=B\3\2\2\2>?\5 \21\2?@\7\3\2"+
		"\2@B\3\2\2\2A9\3\2\2\2A>\3\2\2\2B\7\3\2\2\2CD\5\n\6\2DE\7\31\2\2EF\5\b"+
		"\5\2FK\3\2\2\2GH\5\n\6\2HI\7\31\2\2IK\3\2\2\2JC\3\2\2\2JG\3\2\2\2K\t\3"+
		"\2\2\2LU\5\6\4\2MU\5\22\n\2NO\5\f\7\2OP\7\27\2\2PQ\5\16\b\2QU\3\2\2\2"+
		"RU\5\24\13\2SU\5\30\r\2TL\3\2\2\2TM\3\2\2\2TN\3\2\2\2TR\3\2\2\2TS\3\2"+
		"\2\2U\13\3\2\2\2VZ\5\22\n\2WZ\5\6\4\2XZ\5 \21\2YV\3\2\2\2YW\3\2\2\2YX"+
		"\3\2\2\2Z\r\3\2\2\2[_\5\6\4\2\\_\5\34\17\2]_\5 \21\2^[\3\2\2\2^\\\3\2"+
		"\2\2^]\3\2\2\2_\17\3\2\2\2`a\5\22\n\2ab\7\4\2\2bc\5\20\t\2cf\3\2\2\2d"+
		"f\5\22\n\2e`\3\2\2\2ed\3\2\2\2f\21\3\2\2\2gh\5\36\20\2hi\5\"\22\2i\23"+
		"\3\2\2\2jk\7\26\2\2kl\7\6\2\2lm\5\26\f\2mn\7\24\2\2no\7\f\2\2op\5\b\5"+
		"\2pq\7\16\2\2q{\3\2\2\2rs\7\5\2\2st\7\6\2\2tu\5\32\16\2uv\7\24\2\2vw\7"+
		"\f\2\2wx\5\b\5\2xy\7\16\2\2y{\3\2\2\2zj\3\2\2\2zr\3\2\2\2{\25\3\2\2\2"+
		"|\177\3\2\2\2}\177\3\2\2\2~|\3\2\2\2~}\3\2\2\2\177\27\3\2\2\2\u0080\u0081"+
		"\7\b\2\2\u0081\u0082\7\6\2\2\u0082\u0083\5\32\16\2\u0083\u0084\7\24\2"+
		"\2\u0084\u0085\7\f\2\2\u0085\u0086\5\b\5\2\u0086\u0087\7\16\2\2\u0087"+
		"\31\3\2\2\2\u0088\u0089\3\2\2\2\u0089\33\3\2\2\2\u008a\u008d\5$\23\2\u008b"+
		"\u008d\5(\25\2\u008c\u008a\3\2\2\2\u008c\u008b\3\2\2\2\u008d\35\3\2\2"+
		"\2\u008e\u008f\t\2\2\2\u008f\37\3\2\2\2\u0090\u0091\7\36\2\2\u0091\u0097"+
		"\5\"\22\2\u0092\u0097\7\36\2\2\u0093\u0094\7\37\2\2\u0094\u0097\5\"\22"+
		"\2\u0095\u0097\7\37\2\2\u0096\u0090\3\2\2\2\u0096\u0092\3\2\2\2\u0096"+
		"\u0093\3\2\2\2\u0096\u0095\3\2\2\2\u0097!\3\2\2\2\u0098\u0099\5&\24\2"+
		"\u0099\u009a\5\"\22\2\u009a\u00a1\3\2\2\2\u009b\u009c\5(\25\2\u009c\u009d"+
		"\5\"\22\2\u009d\u00a1\3\2\2\2\u009e\u00a1\5&\24\2\u009f\u00a1\5(\25\2"+
		"\u00a0\u0098\3\2\2\2\u00a0\u009b\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u009f"+
		"\3\2\2\2\u00a1#\3\2\2\2\u00a2\u00a3\7\20\2\2\u00a3\u00a4\7\13\2\2\u00a4"+
		"\u00a5\7\20\2\2\u00a5%\3\2\2\2\u00a6\u00a7\7\36\2\2\u00a7\u00ad\5&\24"+
		"\2\u00a8\u00a9\7\37\2\2\u00a9\u00ad\5&\24\2\u00aa\u00ad\7\36\2\2\u00ab"+
		"\u00ad\7\37\2\2\u00ac\u00a6\3\2\2\2\u00ac\u00a8\3\2\2\2\u00ac\u00aa\3"+
		"\2\2\2\u00ac\u00ab\3\2\2\2\u00ad\'\3\2\2\2\u00ae\u00af\7\35\2\2\u00af"+
		"\u00b2\5(\25\2\u00b0\u00b2\7\35\2\2\u00b1\u00ae\3\2\2\2\u00b1\u00b0\3"+
		"\2\2\2\u00b2)\3\2\2\2\u00b3\u00b4\b\26\1\2\u00b4\u00b5\7\37\2\2\u00b5"+
		"\u00ba\3\2\2\2\u00b6\u00b7\f\4\2\2\u00b7\u00b9\7\37\2\2\u00b8\u00b6\3"+
		"\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb"+
		"+\3\2\2\2\u00bc\u00ba\3\2\2\2\21\60AJTY^ez~\u008c\u0096\u00a0\u00ac\u00b1"+
		"\u00ba";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}