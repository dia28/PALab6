package bonus.antlr4;// Generated from Shape.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ShapeParser}.
 */
public interface ShapeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ShapeParser#commands}.
	 * @param ctx the parse tree
	 */
	void enterCommands(ShapeParser.CommandsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShapeParser#commands}.
	 * @param ctx the parse tree
	 */
	void exitCommands(ShapeParser.CommandsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShapeParser#listOfCommands}.
	 * @param ctx the parse tree
	 */
	void enterListOfCommands(ShapeParser.ListOfCommandsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShapeParser#listOfCommands}.
	 * @param ctx the parse tree
	 */
	void exitListOfCommands(ShapeParser.ListOfCommandsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShapeParser#createCommand}.
	 * @param ctx the parse tree
	 */
	void enterCreateCommand(ShapeParser.CreateCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShapeParser#createCommand}.
	 * @param ctx the parse tree
	 */
	void exitCreateCommand(ShapeParser.CreateCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShapeParser#commandShapeList}.
	 * @param ctx the parse tree
	 */
	void enterCommandShapeList(ShapeParser.CommandShapeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShapeParser#commandShapeList}.
	 * @param ctx the parse tree
	 */
	void exitCommandShapeList(ShapeParser.CommandShapeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShapeParser#deleteCommand}.
	 * @param ctx the parse tree
	 */
	void enterDeleteCommand(ShapeParser.DeleteCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShapeParser#deleteCommand}.
	 * @param ctx the parse tree
	 */
	void exitDeleteCommand(ShapeParser.DeleteCommandContext ctx);
}