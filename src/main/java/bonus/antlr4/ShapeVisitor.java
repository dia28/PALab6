package bonus.antlr4;// Generated from Shape.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ShapeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ShapeVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ShapeParser#commands}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommands(ShapeParser.CommandsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShapeParser#listOfCommands}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListOfCommands(ShapeParser.ListOfCommandsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShapeParser#createCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateCommand(ShapeParser.CreateCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShapeParser#commandShapeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommandShapeList(ShapeParser.CommandShapeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShapeParser#deleteCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteCommand(ShapeParser.DeleteCommandContext ctx);
}