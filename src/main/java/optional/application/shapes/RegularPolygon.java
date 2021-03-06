package optional.application.shapes;

import java.awt.*;

public class RegularPolygon extends Polygon {
    public Color color;
    public RegularPolygon(int x0, int y0, int radius, int sides,Color polygonColor) {
        color = polygonColor;
        double alpha = 2 * Math.PI / sides;
        for (int i = 0; i < sides; i++) {
            double x = x0 + radius * Math.cos(alpha * i);
            double y = y0 + radius * Math.sin(alpha * i);
            this.addPoint((int) x, (int) y);
        }
    }
}
