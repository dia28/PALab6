package bonus.application;

import lombok.Getter;

import javax.swing.*;

@Getter
public class ConfigPanel extends JPanel {
    final MainFrame frame;
//    JSpinner sidesField; // number of sides
    JComboBox colorCombo; // the color of the shape
    JComboBox shapeCombo; // actual shape
    JTextField sizeField; // size field

    public ConfigPanel(MainFrame frame) {
        this.frame = frame;
        init();
    }

    private void init() {
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
