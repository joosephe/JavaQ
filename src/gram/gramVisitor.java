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
	 * Visit a parse tree produced by {@link gramParser#conditionals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionals(@NotNull gramParser.ConditionalsContext ctx);

	/**
	 * Visit a parse tree produced by {@link gramParser#charSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharSeq(@NotNull gramParser.CharSeqContext ctx);

	/**
	 * Visit a parse tree produced by {@link gramParser#tahed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTahed(@NotNull gramParser.TahedContext ctx);

	/**
	 * Visit a parse tree produced by {@link gramParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(@NotNull gramParser.NumberContext ctx);

	/**
	 * Visit a parse tree produced by {@link gramParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(@NotNull gramParser.TypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link gramParser#paramValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamValue(@NotNull gramParser.ParamValueContext ctx);

	/**
	 * Visit a parse tree produced by {@link gramParser#paramValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamValues(@NotNull gramParser.ParamValuesContext ctx);

	/**
	 * Visit a parse tree produced by {@link gramParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(@NotNull gramParser.FunctionContext ctx);

	/**
	 * Visit a parse tree produced by {@link gramParser#paramInits}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamInits(@NotNull gramParser.ParamInitsContext ctx);

	/**
	 * Visit a parse tree produced by {@link gramParser#conditions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditions(@NotNull gramParser.ConditionsContext ctx);

	/**
	 * Visit a parse tree produced by {@link gramParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull gramParser.StatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link gramParser#loops}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoops(@NotNull gramParser.LoopsContext ctx);

	/**
	 * Visit a parse tree produced by {@link gramParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(@NotNull gramParser.FunctionCallContext ctx);

	/**
	 * Visit a parse tree produced by {@link gramParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(@NotNull gramParser.ParameterContext ctx);

	/**
	 * Visit a parse tree produced by {@link gramParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull gramParser.ProgramContext ctx);

	/**
	 * Visit a parse tree produced by {@link gramParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(@NotNull gramParser.StringContext ctx);

	/**
	 * Visit a parse tree produced by {@link gramParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(@NotNull gramParser.NameContext ctx);

	/**
	 * Visit a parse tree produced by {@link gramParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(@NotNull gramParser.StatementsContext ctx);

	/**
	 * Visit a parse tree produced by {@link gramParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(@NotNull gramParser.ParametersContext ctx);

	/**
	 * Visit a parse tree produced by {@link gramParser#forConditions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForConditions(@NotNull gramParser.ForConditionsContext ctx);
}