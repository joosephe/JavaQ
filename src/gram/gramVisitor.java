// Generated from gram.g4 by ANTLR 4.2
package gram;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link gramParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface gramVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link gramParser#conditionals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionals(@NotNull gramParser.ConditionalsContext ctx);

	/**
	 * Visit a parse tree produced by {@link gramParser#NameR}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameR(@NotNull gramParser.NameRContext ctx);

	/**
	 * Visit a parse tree produced by {@link gramParser#AddingSubstraction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddingSubstraction(@NotNull gramParser.AddingSubstractionContext ctx);

	/**
	 * Visit a parse tree produced by {@link gramParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(@NotNull gramParser.TypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link gramParser#TrivialExpression0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrivialExpression0(@NotNull gramParser.TrivialExpression0Context ctx);

	/**
	 * Visit a parse tree produced by {@link gramParser#Comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(@NotNull gramParser.ComparisonContext ctx);

	/**
	 * Visit a parse tree produced by {@link gramParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(@NotNull gramParser.FunctionContext ctx);

	/**
	 * Visit a parse tree produced by {@link gramParser#TrivialExpression4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrivialExpression4(@NotNull gramParser.TrivialExpression4Context ctx);

	/**
	 * Visit a parse tree produced by {@link gramParser#TrivialExpression3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrivialExpression3(@NotNull gramParser.TrivialExpression3Context ctx);

	/**
	 * Visit a parse tree produced by {@link gramParser#StringR}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringR(@NotNull gramParser.StringRContext ctx);

	/**
	 * Visit a parse tree produced by {@link gramParser#TrivialExpression2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrivialExpression2(@NotNull gramParser.TrivialExpression2Context ctx);

	/**
	 * Visit a parse tree produced by {@link gramParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(@NotNull gramParser.ParameterContext ctx);

	/**
	 * Visit a parse tree produced by {@link gramParser#TrivialExpression1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrivialExpression1(@NotNull gramParser.TrivialExpression1Context ctx);

	/**
	 * Visit a parse tree produced by {@link gramParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(@NotNull gramParser.StatementsContext ctx);

	/**
	 * Visit a parse tree produced by {@link gramParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(@NotNull gramParser.LoopContext ctx);

	/**
	 * Visit a parse tree produced by {@link gramParser#initParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitParameters(@NotNull gramParser.InitParametersContext ctx);

	/**
	 * Visit a parse tree produced by {@link gramParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(@NotNull gramParser.ValueContext ctx);

	/**
	 * Visit a parse tree produced by {@link gramParser#NumberR}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberR(@NotNull gramParser.NumberRContext ctx);

	/**
	 * Visit a parse tree produced by {@link gramParser#UnaryNegation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryNegation(@NotNull gramParser.UnaryNegationContext ctx);

	/**
	 * Visit a parse tree produced by {@link gramParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(@NotNull gramParser.DeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link gramParser#FunctionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(@NotNull gramParser.FunctionCallContext ctx);

	/**
	 * Visit a parse tree produced by {@link gramParser#MultiplicationDivision}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicationDivision(@NotNull gramParser.MultiplicationDivisionContext ctx);

	/**
	 * Visit a parse tree produced by {@link gramParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull gramParser.StatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link gramParser#BraketExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBraketExpression(@NotNull gramParser.BraketExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link gramParser#MultipleComparisons}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleComparisons(@NotNull gramParser.MultipleComparisonsContext ctx);

	/**
	 * Visit a parse tree produced by {@link gramParser#BoolR}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolR(@NotNull gramParser.BoolRContext ctx);

	/**
	 * Visit a parse tree produced by {@link gramParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull gramParser.ProgramContext ctx);

	/**
	 * Visit a parse tree produced by {@link gramParser#TrivialExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrivialExpression(@NotNull gramParser.TrivialExpressionContext ctx);
}