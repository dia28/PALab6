package bonus.application;

import bonus.antlr4.ShapeLexer;
import bonus.antlr4.ShapeParser;
import bonus.grammar.MyListener;
import bonus.grammar.ThrowingErrorListener;
import lombok.Getter;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@Getter
public class ConfigPanel extends JPanel {
    final MainFrame frame;
//    JSpinner sidesField; // number of sides
    JComboBox colorCombo; // the color of the shape
    JComboBox shapeCombo; // actual shape
    JTextField sizeField; // size field
    JTextField commandField; // command field

    public ConfigPanel(MainFrame frame) {
        this.frame = frame;
        init();
    }

    private void init() {
        // text field

        var commandLabel = new JLabel("Command: ");
        commandField = new JTextField("",8);

        commandField.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                String source = commandField.getText();
                ShapeLexer lexer = new ShapeLexer(CharStreams.fromString(source));

                CommonTokenStream tokenStream = new CommonTokenStream(lexer);
                ShapeParser parser = new ShapeParser(tokenStream);

                parser.removeErrorListeners();
                parser.addErrorListener(ThrowingErrorListener.INSTANCE);

                ShapeParser.CommandsContext shapeContext = parser.commands();

                ParseTreeWalker walker = new ParseTreeWalker();
                MyListener myListener = new MyListener(frame);
                walker.walk(myListener, shapeContext);
            }
        });

        add(commandLabel);
        add(commandField);



        // label for size
        var sizeLabel = new JLabel("Size: ");
        sizeField = new JTextField("30", 8);

        add(sizeLabel);
        add(sizeField);

//        //create the label and the spinner
//        var sidesLabel = new JLabel("Number of sides: ");
//        sidesField = new JSpinner(new SpinnerNumberModel(0, 0, 100, 1));
//        sidesField.setValue(6); //default number of sides
//
//        add(sidesLabel); //JPanel uses FlowLayout by default
//        add(sidesField);

        // label for color box
        var colorLabel = new JLabel("Color of the shape");
        String[] colors = {"Red", "Green", "Blue", "Random"};
        colorCombo = new JComboBox(colors);

        add(colorLabel);
        add(colorCombo);

        // Available shapes
        var shapesLabel = new JLabel("Shape");
        String[] shapes = {"Triangle", "Square", "Circle"};
        shapeCombo = new JComboBox(shapes);

        add(shapesLabel);
        add(shapeCombo);
    }
}
