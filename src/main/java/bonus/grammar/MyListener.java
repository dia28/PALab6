package bonus.grammar;

import bonus.antlr4.ShapeBaseListener;
import bonus.antlr4.ShapeParser;
import bonus.application.MainFrame;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class MyListener extends ShapeBaseListener {

    final MainFrame frame;

    public MyListener(MainFrame frame1) {
        frame = frame1;
    }

    @Override
    public void enterCommands(ShapeParser.CommandsContext ctx) {
        super.enterCommands(ctx);
    }

    @Override
    public void exitCommands(ShapeParser.CommandsContext ctx) {

    }

    @Override
    public void enterListOfCommands(ShapeParser.ListOfCommandsContext ctx) {
        super.enterListOfCommands(ctx);
    }

    @Override
    public void exitListOfCommands(ShapeParser.ListOfCommandsContext ctx) {
        super.exitListOfCommands(ctx);
    }

    @Override
    public void enterCreateCommand(ShapeParser.CreateCommandContext ctx) {
        super.enterCreateCommand(ctx);
    }

    @Override
    public void exitCreateCommand(ShapeParser.CreateCommandContext ctx) {
        super.exitCreateCommand(ctx);
        frame.canvas.drawShapeListener(ctx.shape.getText(), ctx.color.getText(), Integer.parseInt(ctx.size.getText()), Integer.parseInt(ctx.pointX.getText()), Integer.parseInt(ctx.pointY.getText()));
        System.out.println("circle");
    }

    @Override
    public void enterCommandShapeList(ShapeParser.CommandShapeListContext ctx) {
        super.enterCommandShapeList(ctx);
    }

    @Override
    public void exitCommandShapeList(ShapeParser.CommandShapeListContext ctx) {
        super.exitCommandShapeList(ctx);
    }

    @Override
    public void enterDeleteCommand(ShapeParser.DeleteCommandContext ctx) {
        super.enterDeleteCommand(ctx);
    }

    @Override
    public void exitDeleteCommand(ShapeParser.DeleteCommandContext ctx) {
        super.exitDeleteCommand(ctx);

        frame.canvas.deletePolygons(Integer.parseInt(ctx.pointX.getText()), Integer.parseInt(ctx.pointY.getText()));

        System.out.println("exit delete command");
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        super.enterEveryRule(ctx);
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        super.exitEveryRule(ctx);
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        super.visitTerminal(node);
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
    }
}
