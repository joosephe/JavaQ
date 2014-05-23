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
		RULE_conditions = 12, RULE_paramValue = 13, RULE_type = 14, RULE_name = 15, 
		RULE_string = 16, RULE_charSeq = 17, RULE_number = 18, RULE_tahed = 19;
	public static final String[] ruleNames = {
		"program", "function", "functionCall", "statements", "statement", "paramInits", 
		"paramValues", "parameters", "parameter", "loops", "forConditions", "conditionals", 
		"conditions", "paramValue", "type", "name", "string", "charSeq", "number", 
		"tahed"
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
			setState(44);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(40); function();
				setState(41); program();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(43); function();
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
			setState(46); match(22);
			setState(47); type();
			setState(48); functionCall();
			setState(49); match(10);
			setState(50); statements();
			setState(51); match(12);
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
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
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
			setState(61);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(53); name();
				setState(54); match(4);
				setState(55); parameters();
				setState(56); match(18);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(58); name();
				setState(59); match(1);
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
			setState(70);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(63); statement();
				setState(64); match(23);
				setState(65); statements();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(67); statement();
				setState(68); match(23);
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
			setState(80);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(72); functionCall();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(73); parameter();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(74); paramInits();
				setState(75); match(21);
				setState(76); paramValues();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(78); loops();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(79); conditionals();
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
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
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
			setState(85);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(82); parameter();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(83); functionCall();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(84); name();
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
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ParamValueContext paramValue() {
			return getRuleContext(ParamValueContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
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
			setState(90);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(87); functionCall();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(88); paramValue();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(89); name();
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
			setState(97);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(92); parameter();
				setState(93); match(2);
				setState(94); parameters();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(96); parameter();
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
			setState(99); type();
			setState(100); name();
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
			setState(118);
			switch (_input.LA(1)) {
			case 20:
				enterOuterAlt(_localctx, 1);
				{
				setState(102); match(20);
				setState(103); match(4);
				setState(104); forConditions();
				setState(105); match(18);
				setState(106); match(10);
				setState(107); statements();
				setState(108); match(12);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 2);
				{
				setState(110); match(3);
				setState(111); match(4);
				setState(112); conditions();
				setState(113); match(18);
				setState(114); match(10);
				setState(115); statements();
				setState(116); match(12);
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
			setState(122);
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
			setState(124); match(6);
			setState(125); match(4);
			setState(126); conditions();
			setState(127); match(18);
			setState(128); match(10);
			setState(129); statements();
			setState(130); match(12);
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
			setState(136);
			switch (_input.LA(1)) {
			case 14:
				enterOuterAlt(_localctx, 1);
				{
				setState(134); string();
				}
				break;
			case Num:
				enterOuterAlt(_localctx, 2);
				{
				setState(135); number();
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
			setState(138);
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

	public static class NameContext extends ParserRuleContext {
		public TerminalNode Sym2() { return getToken(gramParser.Sym2, 0); }
		public CharSeqContext charSeq() {
			return getRuleContext(CharSeqContext.class,0);
		}
		public TerminalNode Sym() { return getToken(gramParser.Sym, 0); }
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
		enterRule(_localctx, 30, RULE_name);
		try {
			setState(146);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(140); match(Sym);
				setState(141); charSeq();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(142); match(Sym);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(143); match(Sym2);
				setState(144); charSeq();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(145); match(Sym2);
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
		enterRule(_localctx, 32, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148); match(14);
			setState(149); match(9);
			setState(150); match(14);
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
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
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
		enterRule(_localctx, 34, RULE_charSeq);
		try {
			setState(162);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(152); match(Sym2);
				setState(153); charSeq();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(154); match(Sym);
				setState(155); charSeq();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(156); match(Sym2);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(157); match(Sym);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(158); number();
				setState(159); charSeq();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(161); number();
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
		enterRule(_localctx, 36, RULE_number);
		try {
			setState(167);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(164); match(Num);
				setState(165); number();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(166); match(Num);
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
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_tahed, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(170); match(Sym);
			}
			_ctx.stop = _input.LT(-1);
			setState(176);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TahedContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_tahed);
					setState(172);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(173); match(Sym);
					}
					} 
				}
				setState(178);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
		case 19: return tahed_sempred((TahedContext)_localctx, predIndex);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3 \u00b6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\5\2/\n\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4@\n\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\5\5I\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6S\n\6\3\7\3"+
		"\7\3\7\5\7X\n\7\3\b\3\b\3\b\5\b]\n\b\3\t\3\t\3\t\3\t\3\t\5\td\n\t\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\5\13y\n\13\3\f\3\f\5\f}\n\f\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\16\3\16\3\17\3\17\5\17\u008b\n\17\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\5\21\u0095\n\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00a5\n\23\3\24\3\24\3\24\5\24\u00aa"+
		"\n\24\3\25\3\25\3\25\3\25\3\25\7\25\u00b1\n\25\f\25\16\25\u00b4\13\25"+
		"\3\25\2\3(\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\3\t\2\7\7"+
		"\t\n\r\r\17\17\21\23\25\25\32\34\u00ba\2.\3\2\2\2\4\60\3\2\2\2\6?\3\2"+
		"\2\2\bH\3\2\2\2\nR\3\2\2\2\fW\3\2\2\2\16\\\3\2\2\2\20c\3\2\2\2\22e\3\2"+
		"\2\2\24x\3\2\2\2\26|\3\2\2\2\30~\3\2\2\2\32\u0086\3\2\2\2\34\u008a\3\2"+
		"\2\2\36\u008c\3\2\2\2 \u0094\3\2\2\2\"\u0096\3\2\2\2$\u00a4\3\2\2\2&\u00a9"+
		"\3\2\2\2(\u00ab\3\2\2\2*+\5\4\3\2+,\5\2\2\2,/\3\2\2\2-/\5\4\3\2.*\3\2"+
		"\2\2.-\3\2\2\2/\3\3\2\2\2\60\61\7\30\2\2\61\62\5\36\20\2\62\63\5\6\4\2"+
		"\63\64\7\f\2\2\64\65\5\b\5\2\65\66\7\16\2\2\66\5\3\2\2\2\678\5 \21\28"+
		"9\7\6\2\29:\5\20\t\2:;\7\24\2\2;@\3\2\2\2<=\5 \21\2=>\7\3\2\2>@\3\2\2"+
		"\2?\67\3\2\2\2?<\3\2\2\2@\7\3\2\2\2AB\5\n\6\2BC\7\31\2\2CD\5\b\5\2DI\3"+
		"\2\2\2EF\5\n\6\2FG\7\31\2\2GI\3\2\2\2HA\3\2\2\2HE\3\2\2\2I\t\3\2\2\2J"+
		"S\5\6\4\2KS\5\22\n\2LM\5\f\7\2MN\7\27\2\2NO\5\16\b\2OS\3\2\2\2PS\5\24"+
		"\13\2QS\5\30\r\2RJ\3\2\2\2RK\3\2\2\2RL\3\2\2\2RP\3\2\2\2RQ\3\2\2\2S\13"+
		"\3\2\2\2TX\5\22\n\2UX\5\6\4\2VX\5 \21\2WT\3\2\2\2WU\3\2\2\2WV\3\2\2\2"+
		"X\r\3\2\2\2Y]\5\6\4\2Z]\5\34\17\2[]\5 \21\2\\Y\3\2\2\2\\Z\3\2\2\2\\[\3"+
		"\2\2\2]\17\3\2\2\2^_\5\22\n\2_`\7\4\2\2`a\5\20\t\2ad\3\2\2\2bd\5\22\n"+
		"\2c^\3\2\2\2cb\3\2\2\2d\21\3\2\2\2ef\5\36\20\2fg\5 \21\2g\23\3\2\2\2h"+
		"i\7\26\2\2ij\7\6\2\2jk\5\26\f\2kl\7\24\2\2lm\7\f\2\2mn\5\b\5\2no\7\16"+
		"\2\2oy\3\2\2\2pq\7\5\2\2qr\7\6\2\2rs\5\32\16\2st\7\24\2\2tu\7\f\2\2uv"+
		"\5\b\5\2vw\7\16\2\2wy\3\2\2\2xh\3\2\2\2xp\3\2\2\2y\25\3\2\2\2z}\3\2\2"+
		"\2{}\3\2\2\2|z\3\2\2\2|{\3\2\2\2}\27\3\2\2\2~\177\7\b\2\2\177\u0080\7"+
		"\6\2\2\u0080\u0081\5\32\16\2\u0081\u0082\7\24\2\2\u0082\u0083\7\f\2\2"+
		"\u0083\u0084\5\b\5\2\u0084\u0085\7\16\2\2\u0085\31\3\2\2\2\u0086\u0087"+
		"\3\2\2\2\u0087\33\3\2\2\2\u0088\u008b\5\"\22\2\u0089\u008b\5&\24\2\u008a"+
		"\u0088\3\2\2\2\u008a\u0089\3\2\2\2\u008b\35\3\2\2\2\u008c\u008d\t\2\2"+
		"\2\u008d\37\3\2\2\2\u008e\u008f\7\37\2\2\u008f\u0095\5$\23\2\u0090\u0095"+
		"\7\37\2\2\u0091\u0092\7\36\2\2\u0092\u0095\5$\23\2\u0093\u0095\7\36\2"+
		"\2\u0094\u008e\3\2\2\2\u0094\u0090\3\2\2\2\u0094\u0091\3\2\2\2\u0094\u0093"+
		"\3\2\2\2\u0095!\3\2\2\2\u0096\u0097\7\20\2\2\u0097\u0098\7\13\2\2\u0098"+
		"\u0099\7\20\2\2\u0099#\3\2\2\2\u009a\u009b\7\36\2\2\u009b\u00a5\5$\23"+
		"\2\u009c\u009d\7\37\2\2\u009d\u00a5\5$\23\2\u009e\u00a5\7\36\2\2\u009f"+
		"\u00a5\7\37\2\2\u00a0\u00a1\5&\24\2\u00a1\u00a2\5$\23\2\u00a2\u00a5\3"+
		"\2\2\2\u00a3\u00a5\5&\24\2\u00a4\u009a\3\2\2\2\u00a4\u009c\3\2\2\2\u00a4"+
		"\u009e\3\2\2\2\u00a4\u009f\3\2\2\2\u00a4\u00a0\3\2\2\2\u00a4\u00a3\3\2"+
		"\2\2\u00a5%\3\2\2\2\u00a6\u00a7\7\35\2\2\u00a7\u00aa\5&\24\2\u00a8\u00aa"+
		"\7\35\2\2\u00a9\u00a6\3\2\2\2\u00a9\u00a8\3\2\2\2\u00aa\'\3\2\2\2\u00ab"+
		"\u00ac\b\25\1\2\u00ac\u00ad\7\37\2\2\u00ad\u00b2\3\2\2\2\u00ae\u00af\f"+
		"\4\2\2\u00af\u00b1\7\37\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2"+
		"\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3)\3\2\2\2\u00b4\u00b2\3\2\2\2"+
		"\20.?HRW\\cx|\u008a\u0094\u00a4\u00a9\u00b2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}