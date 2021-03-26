package compulsory.application;

import compulsory.application.shapes.RegularPolygon;
import lombok.Getter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

public class DrawingPanel extends JPanel {
    final MainFrame frame;
    final static int width = 800, height = 600;
    BufferedImage image; //the offscreen image
    Graphics2D graphics; //the "tools" needed to draw in the image

    public DrawingPanel(MainFrame frame) {
        this.frame = frame;
        createOffscreenImage();
        init();
    }

    private void createOffscreenImage() {
        image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        graphics = image.createGraphics();
        graphics.setColor(Color.WHITE); //fill the image with white
        graphics.fillRect(0, 0, width, height);
    }

    //...NEXT SLIDE
    private void init() {
        setPreferredSize(new Dimension(width, height)); //don’t use setSize. Why?
        setBorder(BorderFactory.createEtchedBorder()); //for fun
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                drawShape(e.getX(), e.getY());
                repaint(0, 0, width, height);
            } //Can’t use lambdas, JavaFX does a better job in these cases
        });
    }

    private void drawShape(int x, int y) {
        int radius = Integer.parseInt(frame.configPanel.getSizeField().getText()); //generate a random number
        int sides = (int) frame.configPanel.getSidesField().getValue(); //get the value from UI (in ConfigPanel)
        Color color;

        String getColor = (String) frame.configPanel.getColorCombo().getSelectedItem();

        if (getColor.equals("Red"))
            color = Color.RED;
        else if (getColor.equals("Green"))
            color = Color.GREEN;
        else if (getColor.equals("Blue"))
            color = Color.BLUE;
        else
            color = new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 30 + 60)); //create a transparent random Color.
        graphics.setColor(color);
        graphics.fill(new RegularPolygon(x, y, radius, sides));
    }

    @Override
    public void update(Graphics g) {
    } //Why did I do that?

    @Override
    protected void paintComponent(Graphics g) {
        g.drawImage(image, 0, 0, this);
    }
}
