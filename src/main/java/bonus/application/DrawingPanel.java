package bonus.application;

import bonus.application.shapes.Circle;
import bonus.application.shapes.RegularPolygon;
import bonus.application.shapes.Square;
import bonus.application.shapes.Triangle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.image.BufferedImage;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class DrawingPanel extends JPanel {
    final MainFrame frame;
    final static int width = 800, height = 600;
    List<RegularPolygon> shapesList = new LinkedList<>();
    BufferedImage image; //the offscreen image
    Graphics2D graphics; //the "tools" needed to draw in the image

    private List<Point> points = new LinkedList<>(); // array of points

    public DrawingPanel(MainFrame frame) {
        this.frame = frame;
        createOffscreenImage();
        init();
    }

    void add(RegularPolygon regularPolygon) {
        shapesList.add(regularPolygon);
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
                System.out.println(e.getPoint());
                if (e.getModifiersEx() == MouseEvent.BUTTON2_DOWN_MASK) {
                    drawShape(e.getX(), e.getY());
                    repaint(0, 0, width, height);
                } else if (e.getModifiersEx() == MouseEvent.BUTTON3_DOWN_MASK) {
                    deletePolygons(e.getX(), e.getY());
                }
            } //Can’t use lambdas, JavaFX does a better job in these cases

            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);

                System.out.println("released");
                graphics.setColor(Color.BLACK);
                System.out.println(points);
                for (int i = 0; i < points.size() - 1; i++) {
                    Point p1 = points.get(i);
                    Point p2 = points.get(i + 1);
                    graphics.drawLine(p1.x, p1.y, p2.x, p2.y);
                    repaint(p1.x, p1.y, p2.x, p2.y);
                    System.out.println(p1);
                }
//                repaint(0, 0, width, height);
                points.clear();
            }
        });
        this.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                if (e.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK) {
                    points.add(e.getPoint());
                }
            }
        });
    }

    public void drawShapeListener(String shape, String getColor,int radius,int x, int y){
        int sides; //get the value from UI (in ConfigPanel)

        Color color;

        if (getColor != null && getColor.equals("red"))
            color = Color.RED;
        else if (getColor != null && getColor.equals("green"))
            color = Color.GREEN;
        else if (getColor != null && getColor.equals("blue"))
            color = Color.BLUE;
        else
            color = new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 30 + 60)); //create a transparent random Color.

        graphics.setColor(color);

        Triangle triangle = new Triangle(x, y, radius, color);
        Square square = new Square(x, y, radius, color);
        Circle circle = new Circle(x, y, radius, color);

        switch (Objects.requireNonNull(shape)) {
            case "triangle" -> {
                graphics.fill(triangle);
                add(triangle);
            }
            case "square" -> {
                graphics.fill(square);
                add(square);
            }
            case "circle" -> {
                graphics.fill(circle);
                add(circle);
            }
        }
        repaint(0, 0, width, height);
    }

    public void deletePolygons(int x, int y) {
        int i = 0;
        while (i < shapesList.size())
            if (shapesList.get(i).contains(x, y)) {
                shapesList.remove(i);
            } else i++;

        graphics.setColor(Color.WHITE); //fill the image with white
        graphics.fillRect(0, 0, width, height);

        for (RegularPolygon regularPolygon : shapesList) {
            graphics.setColor(regularPolygon.color);
            graphics.fill(regularPolygon);
        }

        repaint(0, 0, width, height);
    }

    private void drawShape(int x, int y) {
        int radius = Integer.parseInt(frame.configPanel.getSizeField().getText()); //generate a random number
        int sides; //get the value from UI (in ConfigPanel)
        Color color;

        String shape = (String) frame.configPanel.getShapeCombo().getSelectedItem();

        String getColor = (String) frame.configPanel.getColorCombo().getSelectedItem();

        if (getColor != null && getColor.equals("Red"))
            color = Color.RED;
        else if (getColor != null && getColor.equals("Green"))
            color = Color.GREEN;
        else if (getColor != null && getColor.equals("Blue"))
            color = Color.BLUE;
        else
            color = new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 30 + 60)); //create a transparent random Color.

        graphics.setColor(color);

//        RegularPolygon regularPolygon = new RegularPolygon(x, y, radius, sides, color);

//        graphics.fill(regularPolygon);

//        add(regularPolygon);

        Triangle triangle = new Triangle(x, y, radius, color);
        Square square = new Square(x, y, radius, color);
        Circle circle = new Circle(x, y, radius, color);

        switch (Objects.requireNonNull(shape)) {
            case "Triangle" -> {
                graphics.fill(triangle);
                add(triangle);
            }
            case "Square" -> {
                graphics.fill(square);
                add(square);
            }
            case "Circle" -> {
                graphics.fill(circle);
                add(circle);
            }
        }

    }

    @Override
    public void update(Graphics g) {
    } //Why did I do that?

    @Override
    protected void paintComponent(Graphics g) {
        g.drawImage(image, 0, 0, this);
    }
}
