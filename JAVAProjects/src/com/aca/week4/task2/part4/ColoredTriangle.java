package com.aca.week4.task2.part4;

import com.aca.week4.task2.part2.Point;

public class ColoredTriangle extends Triangle {
    private final Color color;

    public ColoredTriangle(ColoredTriangle triangle) {
        super(triangle);
        this.color = triangle.color;
    }

    public ColoredTriangle(Point firstPoint, Point secondPoint, Point thirdPoint, Color color) {
        super(firstPoint, secondPoint, thirdPoint);
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (o instanceof ColoredTriangle) {
            ColoredTriangle otherColoredTriangle = (ColoredTriangle) o;
            return super.equals(otherColoredTriangle) &&
                    this.color.equals(otherColoredTriangle.color);
        }
        if (o instanceof Triangle) {
            Triangle otherTriangle = (Triangle) o;
            return otherTriangle.equals(this);
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + "ColoredTriangle " +
                "color=" + color;
    }

}
