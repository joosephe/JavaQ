// Generated from gram.g4 by ANTLR 4.2.2
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
	 * Visit a parse tree produced by {@link gramParser#TriviaalneAvaldis3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriviaalneAvaldis3(@NotNull gramParser.TriviaalneAvaldis3Context ctx);

	/**
	 * Visit a parse tree produced by {@link gramParser#forConditions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForConditions(@NotNull gramParser.ForConditionsContext ctx);

	/**
	 * Visit a parse tree produced by {@link gramParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(@NotNull gramParser.StatementsContext ctx);

	/**
	 * Visit a parse tree produced by {@link gramParser#TriviaalneAvaldis2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriviaalneAvaldis2(@NotNull gramParser.TriviaalneAvaldis2Context ctx);

	/**
	 * Visit a parse tree produced by {@link gramParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull gramParser.ProgramContext ctx);

	/**
	 * Visit a parse tree produced by {@link gramParser#TriviaalneAvaldis1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriviaalneAvaldis1(@NotNull gramParser.TriviaalneAvaldis1Context ctx);

	/**
	 * Visit a parse tree produced by {@link gramParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(@NotNull gramParser.TypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link gramParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(@NotNull gramParser.FunctionContext ctx);

	/**
	 * Visit a parse tree produced by {@link gramParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(@NotNull gramParser.ParameterContext ctx);

	/**
	 * Visit a parse tree produced by {@link gramParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull gramParser.StatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link gramParser#paramInits}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamInits(@NotNull gramParser.ParamInitsContext ctx);

	/**
	 * Visit a parse tree produced by {@link gramParser#paramValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamValue(@NotNull gramParser.ParamValueContext ctx);

	/**
	 * Visit a parse tree produced by {@link gramParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull gramParser.ExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link gramParser#KorrutamineJagamine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKorrutamineJagamine(@NotNull gramParser.KorrutamineJagamineContext ctx);

	/**
	 * Visit a parse tree produced by {@link gramParser#loops}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoops(@NotNull gramParser.LoopsContext ctx);

	/**
	 * Visit a parse tree produced by {@link gramParser#expression5}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression5(@NotNull gramParser.Expression5Context ctx);

	/**
	 * Visit a parse tree produced by {@link gramParser#functionInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionInit(@NotNull gramParser.FunctionInitContext ctx);

	/**
	 * Visit a parse tree produced by {@link gramParser#expression0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression0(@NotNull gramParser.Expression0Context ctx);

	/**
	 * Visit a parse tree produced by {@link gramParser#expression1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression1(@NotNull gramParser.Expression1Context ctx);

	/**
	 * Visit a parse tree produced by {@link gramParser#UnaarneMiinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaarneMiinus(@NotNull gramParser.UnaarneMiinusContext ctx);

	/**
	 * Visit a parse tree produced by {@link gramParser#paramValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamValues(@NotNull gramParser.ParamValuesContext ctx);

	/**
	 * Visit a parse tree produced by {@link gramParser#initParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitParameters(@NotNull gramParser.InitParametersContext ctx);

	/**
	 * Visit a parse tree produced by {@link gramParser#functionCallParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallParameter(@NotNull gramParser.FunctionCallParameterContext ctx);

	/**
	 * Visit a parse tree produced by {@link gramParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(@NotNull gramParser.FunctionCallContext ctx);

	/**
	 * Visit a parse tree produced by {@link gramParser#conditionals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionals(@NotNull gramParser.ConditionalsContext ctx);

	/**
	 * Visit a parse tree produced by {@link gramParser#conditions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditions(@NotNull gramParser.ConditionsContext ctx);

	/**
	 * Visit a parse tree produced by {@link gramParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(@NotNull gramParser.ParametersContext ctx);

	/**
	 * Visit a parse tree produced by {@link gramParser#FunktsiooniValjakutse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunktsiooniValjakutse(@NotNull gramParser.FunktsiooniValjakutseContext ctx);
}