package model;

import java.util.List;

public interface Figure {
    List<Point> getPoints();

    boolean hasPoint(int x, int y);

    double area();

    String getAreaInfo();
}
