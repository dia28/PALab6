package optional.application.shapes;

import java.awt.*;

public class Square extends RegularPolygon{
    public Square(int x0, int y0, int radius, Color polygonColor) {
        super(x0, y0, radius, 4, polygonColor);
    }
}
