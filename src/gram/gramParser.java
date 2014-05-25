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
		T__35=1, T__34=2, T__33=3, T__32=4, T__31=5, T__30=6, T__29=7, T__28=8, 
		T__27=9, T__26=10, T__25=11, T__24=12, T__23=13, T__22=14, T__21=15, T__20=16, 
		T__19=17, T__18=18, T__17=19, T__16=20, T__15=21, T__14=22, T__13=23, 
		T__12=24, T__11=25, T__10=26, T__9=27, T__8=28, T__7=29, T__6=30, T__5=31, 
		T__4=32, T__3=33, T__2=34, T__1=35, T__0=36, Integer=37, Name=38, String=39, 
		Number=40, WS=41;
	public static final String[] tokenNames = {
		"<INVALID>", "','", "'while'", "'*'", "'-'", "'('", "'if'", "'ensemble'", 
		"'<'", "'int'", "'!='", "' &'", "'<='", "'state'", "'{'", "'gate'", "'else'", 
		"'}'", "'float'", "'elseif'", "'char'", "'qubit'", "')'", "'bool'", "'+'", 
		"'transformation'", "'='", "'circuit'", "';'", "'complex'", "'>'", "'measurement'", 
		"'string'", "'/'", "'=='", "'>='", "'|'", "Integer", "Name", "String", 
		"Number", "WS"
	};
	public static final int
		RULE_program = 0, RULE_function = 1, RULE_statements = 2, RULE_statement = 3, 
		RULE_value = 4, RULE_declaration = 5, RULE_initParameters = 6, RULE_parameter = 7, 
		RULE_expression = 8, RULE_expression0 = 9, RULE_expression1 = 10, RULE_expression2 = 11, 
		RULE_expression3 = 12, RULE_expression4 = 13, RULE_expression5 = 14, RULE_loop = 15, 
		RULE_conditionals = 16, RULE_type = 17;
	public static final String[] ruleNames = {
		"program", "function", "statements", "statement", "value", "declaration", 
		"initParameters", "parameter", "expression", "expression0", "expression1", 
		"expression2", "expression3", "expression4", "expression5", "loop", "conditionals", 
		"type"
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
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
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
			setState(37); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(36); function();
				}
				}
				setState(39); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==27 );
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
		public TerminalNode Name() { return getToken(gramParser.Name, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public InitParametersContext initParameters() {
			return getRuleContext(InitParametersContext.class,0);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41); match(27);
			setState(42); type();
			setState(43); match(Name);
			setState(44); match(5);
			setState(46);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 7) | (1L << 9) | (1L << 13) | (1L << 15) | (1L << 18) | (1L << 20) | (1L << 21) | (1L << 23) | (1L << 25) | (1L << 29) | (1L << 31) | (1L << 32))) != 0)) {
				{
				setState(45); initParameters();
				}
			}

			setState(48); match(22);
			setState(49); match(14);
			setState(50); statements();
			setState(51); match(17);
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
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
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
		enterRule(_localctx, 4, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(53); statement();
				setState(54); match(28);
				}
				}
				setState(58); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 4) | (1L << 5) | (1L << 6) | (1L << 7) | (1L << 9) | (1L << 13) | (1L << 15) | (1L << 18) | (1L << 20) | (1L << 21) | (1L << 23) | (1L << 25) | (1L << 29) | (1L << 31) | (1L << 32) | (1L << Name) | (1L << String) | (1L << Number))) != 0) );
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
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(65);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(60); declaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(61); value();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(62); loop();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(63); conditionals();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(64); expression(0);
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode Name() { return getToken(gramParser.Name, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67); match(Name);
			setState(68); match(26);
			setState(69); expression(0);
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

	public static class DeclarationContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71); parameter();
			setState(72); match(26);
			setState(73); expression(0);
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
		enterRule(_localctx, 12, RULE_initParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75); parameter();
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==1) {
				{
				{
				setState(76); match(1);
				setState(77); parameter();
				}
				}
				setState(82);
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
		public TerminalNode Name() { return getToken(gramParser.Name, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
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
		enterRule(_localctx, 14, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83); type();
			setState(84); match(Name);
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
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultipleComparisonsContext extends ExpressionContext {
		public Expression0Context expression0() {
			return getRuleContext(Expression0Context.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MultipleComparisonsContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitMultipleComparisons(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrivialExpressionContext extends ExpressionContext {
		public Expression0Context expression0() {
			return getRuleContext(Expression0Context.class,0);
		}
		public TrivialExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitTrivialExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new TrivialExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(87); expression0();
			}
			_ctx.stop = _input.LT(-1);
			setState(94);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultipleComparisonsContext(new ExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(89);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(90);
					_la = _input.LA(1);
					if ( !(_la==11 || _la==36) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(91); expression0();
					}
					} 
				}
				setState(96);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class Expression0Context extends ParserRuleContext {
		public Expression0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression0; }
	 
		public Expression0Context() { }
		public void copyFrom(Expression0Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TrivialExpression0Context extends Expression0Context {
		public Expression1Context expression1() {
			return getRuleContext(Expression1Context.class,0);
		}
		public TrivialExpression0Context(Expression0Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitTrivialExpression0(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparisonContext extends Expression0Context {
		public Expression1Context expression1(int i) {
			return getRuleContext(Expression1Context.class,i);
		}
		public List<Expression1Context> expression1() {
			return getRuleContexts(Expression1Context.class);
		}
		public ComparisonContext(Expression0Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression0Context expression0() throws RecognitionException {
		Expression0Context _localctx = new Expression0Context(_ctx, getState());
		enterRule(_localctx, 18, RULE_expression0);
		int _la;
		try {
			setState(102);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new ComparisonContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(97); expression1(0);
				setState(98);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 8) | (1L << 10) | (1L << 12) | (1L << 30) | (1L << 34) | (1L << 35))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(99); expression1(0);
				}
				break;

			case 2:
				_localctx = new TrivialExpression0Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(101); expression1(0);
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
		public Expression1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression1; }
	 
		public Expression1Context() { }
		public void copyFrom(Expression1Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TrivialExpression1Context extends Expression1Context {
		public Expression2Context expression2() {
			return getRuleContext(Expression2Context.class,0);
		}
		public TrivialExpression1Context(Expression1Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitTrivialExpression1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddingSubstractionContext extends Expression1Context {
		public Expression2Context expression2() {
			return getRuleContext(Expression2Context.class,0);
		}
		public Expression1Context expression1() {
			return getRuleContext(Expression1Context.class,0);
		}
		public AddingSubstractionContext(Expression1Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitAddingSubstraction(this);
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expression1, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new TrivialExpression1Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(105); expression2(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(112);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AddingSubstractionContext(new Expression1Context(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expression1);
					setState(107);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(108);
					_la = _input.LA(1);
					if ( !(_la==4 || _la==24) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(109); expression2(0);
					}
					} 
				}
				setState(114);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
	public static class TrivialExpression2Context extends Expression2Context {
		public Expression3Context expression3() {
			return getRuleContext(Expression3Context.class,0);
		}
		public TrivialExpression2Context(Expression2Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitTrivialExpression2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplicationDivisionContext extends Expression2Context {
		public Expression3Context expression3() {
			return getRuleContext(Expression3Context.class,0);
		}
		public Expression2Context expression2() {
			return getRuleContext(Expression2Context.class,0);
		}
		public MultiplicationDivisionContext(Expression2Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitMultiplicationDivision(this);
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expression2, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new TrivialExpression2Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(116); expression3();
			}
			_ctx.stop = _input.LT(-1);
			setState(123);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultiplicationDivisionContext(new Expression2Context(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expression2);
					setState(118);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(119);
					_la = _input.LA(1);
					if ( !(_la==3 || _la==33) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(120); expression3();
					}
					} 
				}
				setState(125);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
	public static class TrivialExpression3Context extends Expression3Context {
		public Expression4Context expression4() {
			return getRuleContext(Expression4Context.class,0);
		}
		public TrivialExpression3Context(Expression3Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitTrivialExpression3(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryNegationContext extends Expression3Context {
		public Expression3Context expression3() {
			return getRuleContext(Expression3Context.class,0);
		}
		public UnaryNegationContext(Expression3Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitUnaryNegation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression3Context expression3() throws RecognitionException {
		Expression3Context _localctx = new Expression3Context(_ctx, getState());
		enterRule(_localctx, 24, RULE_expression3);
		try {
			setState(129);
			switch (_input.LA(1)) {
			case 4:
				_localctx = new UnaryNegationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(126); match(4);
				setState(127); expression3();
				}
				break;
			case 5:
			case Name:
			case String:
			case Number:
				_localctx = new TrivialExpression3Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(128); expression4();
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
	public static class TrivialExpression4Context extends Expression4Context {
		public Expression5Context expression5() {
			return getRuleContext(Expression5Context.class,0);
		}
		public TrivialExpression4Context(Expression4Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitTrivialExpression4(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallContext extends Expression4Context {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Name() { return getToken(gramParser.Name, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public FunctionCallContext(Expression4Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression4Context expression4() throws RecognitionException {
		Expression4Context _localctx = new Expression4Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_expression4);
		int _la;
		try {
			setState(145);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new FunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(131); match(Name);
				setState(132); match(5);
				setState(141);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 4) | (1L << 5) | (1L << Name) | (1L << String) | (1L << Number))) != 0)) {
					{
					setState(133); expression(0);
					setState(138);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==1) {
						{
						{
						setState(134); match(1);
						setState(135); expression(0);
						}
						}
						setState(140);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(143); match(22);
				}
				break;

			case 2:
				_localctx = new TrivialExpression4Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(144); expression5();
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
		public Expression5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression5; }
	 
		public Expression5Context() { }
		public void copyFrom(Expression5Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StringRContext extends Expression5Context {
		public TerminalNode String() { return getToken(gramParser.String, 0); }
		public StringRContext(Expression5Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitStringR(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NameRContext extends Expression5Context {
		public TerminalNode Name() { return getToken(gramParser.Name, 0); }
		public NameRContext(Expression5Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitNameR(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BraketExpressionContext extends Expression5Context {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BraketExpressionContext(Expression5Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitBraketExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberRContext extends Expression5Context {
		public TerminalNode Number() { return getToken(gramParser.Number, 0); }
		public NumberRContext(Expression5Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitNumberR(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression5Context expression5() throws RecognitionException {
		Expression5Context _localctx = new Expression5Context(_ctx, getState());
		enterRule(_localctx, 28, RULE_expression5);
		try {
			setState(154);
			switch (_input.LA(1)) {
			case Name:
				_localctx = new NameRContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(147); match(Name);
				}
				break;
			case Number:
				_localctx = new NumberRContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(148); match(Number);
				}
				break;
			case String:
				_localctx = new StringRContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(149); match(String);
				}
				break;
			case 5:
				_localctx = new BraketExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(150); match(5);
				setState(151); expression(0);
				setState(152); match(22);
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

	public static class LoopContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156); match(2);
			setState(157); match(5);
			setState(158); expression(0);
			setState(159); match(22);
			setState(160); match(14);
			setState(161); statements();
			setState(162); match(17);
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
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
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
		enterRule(_localctx, 32, RULE_conditionals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164); match(6);
			setState(165); match(5);
			setState(166); expression(0);
			setState(167); match(22);
			setState(168); match(14);
			setState(169); statements();
			setState(170); match(17);
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==19) {
				{
				{
				setState(171); match(19);
				setState(172); match(5);
				setState(173); expression(0);
				setState(174); match(22);
				setState(175); match(14);
				setState(176); statements();
				setState(177); match(17);
				}
				}
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(189);
			_la = _input.LA(1);
			if (_la==16) {
				{
				setState(184); match(16);
				setState(185); match(14);
				setState(186); statements();
				setState(187); match(17);
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ComplexTypeContext extends TypeContext {
		public ComplexTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitComplexType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EnsembleTypeContext extends TypeContext {
		public EnsembleTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitEnsembleType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolTypeContext extends TypeContext {
		public BoolTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitBoolType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GateTypeContext extends TypeContext {
		public GateTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitGateType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TransformationTypeContext extends TypeContext {
		public TransformationTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitTransformationType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CharTypeContext extends TypeContext {
		public CharTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitCharType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MeasurementTypeContext extends TypeContext {
		public MeasurementTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitMeasurementType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerTypeContext extends TypeContext {
		public IntegerTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitIntegerType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StateTypeContext extends TypeContext {
		public StateTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitStateType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringTypeContext extends TypeContext {
		public StringTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitStringType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class QubitTypeContext extends TypeContext {
		public QubitTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitQubitType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FloatTypeContext extends TypeContext {
		public FloatTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitFloatType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_type);
		try {
			setState(203);
			switch (_input.LA(1)) {
			case 9:
				_localctx = new IntegerTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(191); match(9);
				}
				break;
			case 18:
				_localctx = new FloatTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(192); match(18);
				}
				break;
			case 23:
				_localctx = new BoolTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(193); match(23);
				}
				break;
			case 29:
				_localctx = new ComplexTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(194); match(29);
				}
				break;
			case 21:
				_localctx = new QubitTypeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(195); match(21);
				}
				break;
			case 25:
				_localctx = new TransformationTypeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(196); match(25);
				}
				break;
			case 15:
				_localctx = new GateTypeContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(197); match(15);
				}
				break;
			case 32:
				_localctx = new StringTypeContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(198); match(32);
				}
				break;
			case 20:
				_localctx = new CharTypeContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(199); match(20);
				}
				break;
			case 31:
				_localctx = new MeasurementTypeContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(200); match(31);
				}
				break;
			case 13:
				_localctx = new StateTypeContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(201); match(13);
				}
				break;
			case 7:
				_localctx = new EnsembleTypeContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(202); match(7);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8: return expression_sempred((ExpressionContext)_localctx, predIndex);

		case 10: return expression1_sempred((Expression1Context)_localctx, predIndex);

		case 11: return expression2_sempred((Expression2Context)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expression1_sempred(Expression1Context _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expression2_sempred(Expression2Context _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3+\u00d0\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\6\2(\n\2\r\2\16\2)\3\3\3\3\3\3\3\3\3\3\5\3\61\n\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\4\6\4;\n\4\r\4\16\4<\3\5\3\5\3\5\3\5\3\5\5\5"+
		"D\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\7\bQ\n\b\f\b\16\bT\13"+
		"\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\7\n_\n\n\f\n\16\nb\13\n\3\13\3"+
		"\13\3\13\3\13\3\13\5\13i\n\13\3\f\3\f\3\f\3\f\3\f\3\f\7\fq\n\f\f\f\16"+
		"\ft\13\f\3\r\3\r\3\r\3\r\3\r\3\r\7\r|\n\r\f\r\16\r\177\13\r\3\16\3\16"+
		"\3\16\5\16\u0084\n\16\3\17\3\17\3\17\3\17\3\17\7\17\u008b\n\17\f\17\16"+
		"\17\u008e\13\17\5\17\u0090\n\17\3\17\3\17\5\17\u0094\n\17\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\5\20\u009d\n\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\7\22\u00b6\n\22\f\22\16\22\u00b9\13\22\3\22\3\22\3\22"+
		"\3\22\3\22\5\22\u00c0\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\5\23\u00ce\n\23\3\23\2\5\22\26\30\24\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$\2\6\4\2\r\r&&\7\2\n\n\f\f\16\16  $%\4\2\6\6"+
		"\32\32\4\2\5\5##\u00dd\2\'\3\2\2\2\4+\3\2\2\2\6:\3\2\2\2\bC\3\2\2\2\n"+
		"E\3\2\2\2\fI\3\2\2\2\16M\3\2\2\2\20U\3\2\2\2\22X\3\2\2\2\24h\3\2\2\2\26"+
		"j\3\2\2\2\30u\3\2\2\2\32\u0083\3\2\2\2\34\u0093\3\2\2\2\36\u009c\3\2\2"+
		"\2 \u009e\3\2\2\2\"\u00a6\3\2\2\2$\u00cd\3\2\2\2&(\5\4\3\2\'&\3\2\2\2"+
		"()\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*\3\3\2\2\2+,\7\35\2\2,-\5$\23\2-.\7(\2"+
		"\2.\60\7\7\2\2/\61\5\16\b\2\60/\3\2\2\2\60\61\3\2\2\2\61\62\3\2\2\2\62"+
		"\63\7\30\2\2\63\64\7\20\2\2\64\65\5\6\4\2\65\66\7\23\2\2\66\5\3\2\2\2"+
		"\678\5\b\5\289\7\36\2\29;\3\2\2\2:\67\3\2\2\2;<\3\2\2\2<:\3\2\2\2<=\3"+
		"\2\2\2=\7\3\2\2\2>D\5\f\7\2?D\5\n\6\2@D\5 \21\2AD\5\"\22\2BD\5\22\n\2"+
		"C>\3\2\2\2C?\3\2\2\2C@\3\2\2\2CA\3\2\2\2CB\3\2\2\2D\t\3\2\2\2EF\7(\2\2"+
		"FG\7\34\2\2GH\5\22\n\2H\13\3\2\2\2IJ\5\20\t\2JK\7\34\2\2KL\5\22\n\2L\r"+
		"\3\2\2\2MR\5\20\t\2NO\7\3\2\2OQ\5\20\t\2PN\3\2\2\2QT\3\2\2\2RP\3\2\2\2"+
		"RS\3\2\2\2S\17\3\2\2\2TR\3\2\2\2UV\5$\23\2VW\7(\2\2W\21\3\2\2\2XY\b\n"+
		"\1\2YZ\5\24\13\2Z`\3\2\2\2[\\\f\4\2\2\\]\t\2\2\2]_\5\24\13\2^[\3\2\2\2"+
		"_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2a\23\3\2\2\2b`\3\2\2\2cd\5\26\f\2de\t\3"+
		"\2\2ef\5\26\f\2fi\3\2\2\2gi\5\26\f\2hc\3\2\2\2hg\3\2\2\2i\25\3\2\2\2j"+
		"k\b\f\1\2kl\5\30\r\2lr\3\2\2\2mn\f\4\2\2no\t\4\2\2oq\5\30\r\2pm\3\2\2"+
		"\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2s\27\3\2\2\2tr\3\2\2\2uv\b\r\1\2vw\5\32"+
		"\16\2w}\3\2\2\2xy\f\4\2\2yz\t\5\2\2z|\5\32\16\2{x\3\2\2\2|\177\3\2\2\2"+
		"}{\3\2\2\2}~\3\2\2\2~\31\3\2\2\2\177}\3\2\2\2\u0080\u0081\7\6\2\2\u0081"+
		"\u0084\5\32\16\2\u0082\u0084\5\34\17\2\u0083\u0080\3\2\2\2\u0083\u0082"+
		"\3\2\2\2\u0084\33\3\2\2\2\u0085\u0086\7(\2\2\u0086\u008f\7\7\2\2\u0087"+
		"\u008c\5\22\n\2\u0088\u0089\7\3\2\2\u0089\u008b\5\22\n\2\u008a\u0088\3"+
		"\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0087\3\2\2\2\u008f\u0090\3\2"+
		"\2\2\u0090\u0091\3\2\2\2\u0091\u0094\7\30\2\2\u0092\u0094\5\36\20\2\u0093"+
		"\u0085\3\2\2\2\u0093\u0092\3\2\2\2\u0094\35\3\2\2\2\u0095\u009d\7(\2\2"+
		"\u0096\u009d\7*\2\2\u0097\u009d\7)\2\2\u0098\u0099\7\7\2\2\u0099\u009a"+
		"\5\22\n\2\u009a\u009b\7\30\2\2\u009b\u009d\3\2\2\2\u009c\u0095\3\2\2\2"+
		"\u009c\u0096\3\2\2\2\u009c\u0097\3\2\2\2\u009c\u0098\3\2\2\2\u009d\37"+
		"\3\2\2\2\u009e\u009f\7\4\2\2\u009f\u00a0\7\7\2\2\u00a0\u00a1\5\22\n\2"+
		"\u00a1\u00a2\7\30\2\2\u00a2\u00a3\7\20\2\2\u00a3\u00a4\5\6\4\2\u00a4\u00a5"+
		"\7\23\2\2\u00a5!\3\2\2\2\u00a6\u00a7\7\b\2\2\u00a7\u00a8\7\7\2\2\u00a8"+
		"\u00a9\5\22\n\2\u00a9\u00aa\7\30\2\2\u00aa\u00ab\7\20\2\2\u00ab\u00ac"+
		"\5\6\4\2\u00ac\u00b7\7\23\2\2\u00ad\u00ae\7\25\2\2\u00ae\u00af\7\7\2\2"+
		"\u00af\u00b0\5\22\n\2\u00b0\u00b1\7\30\2\2\u00b1\u00b2\7\20\2\2\u00b2"+
		"\u00b3\5\6\4\2\u00b3\u00b4\7\23\2\2\u00b4\u00b6\3\2\2\2\u00b5\u00ad\3"+
		"\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8"+
		"\u00bf\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bb\7\22\2\2\u00bb\u00bc\7"+
		"\20\2\2\u00bc\u00bd\5\6\4\2\u00bd\u00be\7\23\2\2\u00be\u00c0\3\2\2\2\u00bf"+
		"\u00ba\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0#\3\2\2\2\u00c1\u00ce\7\13\2\2"+
		"\u00c2\u00ce\7\24\2\2\u00c3\u00ce\7\31\2\2\u00c4\u00ce\7\37\2\2\u00c5"+
		"\u00ce\7\27\2\2\u00c6\u00ce\7\33\2\2\u00c7\u00ce\7\21\2\2\u00c8\u00ce"+
		"\7\"\2\2\u00c9\u00ce\7\26\2\2\u00ca\u00ce\7!\2\2\u00cb\u00ce\7\17\2\2"+
		"\u00cc\u00ce\7\t\2\2\u00cd\u00c1\3\2\2\2\u00cd\u00c2\3\2\2\2\u00cd\u00c3"+
		"\3\2\2\2\u00cd\u00c4\3\2\2\2\u00cd\u00c5\3\2\2\2\u00cd\u00c6\3\2\2\2\u00cd"+
		"\u00c7\3\2\2\2\u00cd\u00c8\3\2\2\2\u00cd\u00c9\3\2\2\2\u00cd\u00ca\3\2"+
		"\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00cc\3\2\2\2\u00ce%\3\2\2\2\23)\60<CR"+
		"`hr}\u0083\u008c\u008f\u0093\u009c\u00b7\u00bf\u00cd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}