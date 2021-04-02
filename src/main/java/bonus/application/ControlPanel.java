package bonus.application;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class ControlPanel extends JPanel {
    final MainFrame frame;
    JButton saveBtn = new JButton("Save");
    //create all buttons (Load, Reset, Exit)
// ...TODO

    public ControlPanel(MainFrame frame) {
        this.frame = frame;
        init();
    }

    private void init() {
        //change the default layout manager (just for fun)
        setLayout(new GridLayout(1, 4));
        //add all buttons ...TODO

        var saveButton = new JButton("SAVE");
        var loadButton = new JButton("LOAD");
        var resetButton = new JButton("RESET");
        var exitButton = new JButton("EXIT");

        saveButton.addActionListener(this::save);
        exitButton.addActionListener(this::exit);
        resetButton.addActionListener(this::reset);
        loadButton.addActionListener(this::load);

        add(saveButton);
        add(loadButton);
        add(resetButton);
        add(exitButton);

        //configure listeners for all buttons
//        saveBtn.addActionListener(this::save);
// ...TODO
    }

    private void load(ActionEvent actionEvent) {
        JFileChooser navigator = new JFileChooser();
        if (navigator.showOpenDialog(null) == 0) {
            try {
                BufferedImage bufferedImage = ImageIO.read(navigator.getSelectedFile());
                frame.canvas.graphics.drawImage(bufferedImage,0,0,null);
                frame.canvas.repaint(0, 0, frame.canvas.getWidth(), frame.canvas.getHeight());
            } catch (IOException ie) {
                JOptionPane.showMessageDialog(null, "Ocurriò un error al guardar la imàgen");
            }
        }
    }

    private void reset(ActionEvent actionEvent) {
        frame.canvas.graphics.setColor(Color.WHITE);
        frame.canvas.graphics.fillRect(0, 0, frame.canvas.getWidth(), frame.canvas.getHeight());
        frame.canvas.repaint(0, 0, frame.canvas.getWidth(), frame.canvas.getHeight());
    }

    private void exit(ActionEvent actionEvent) {
        System.exit(0);
    }

    private void save(ActionEvent e) {
        JFileChooser navigator = new JFileChooser();
        if(navigator.showOpenDialog(null) == 0){
            try {
                ImageIO.write(frame.canvas.image, "PNG", navigator.getSelectedFile());
            } catch (IOException ex) {
                System.err.println(ex);
            }
        }

    }
}

