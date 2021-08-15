package com.aca.week4.task2.part3;

import com.aca.week4.task2.part1.AssertionUtils;
import com.aca.week4.task2.part2.ImmutablePoint;
import com.aca.week4.task2.part2.Point;


public final class Triangle {
    private final Point firstPoint;
    private final Point secondPoint;
    private final Point thirdPoint;

    public Triangle(final Triangle triangle) {
        this.firstPoint = new ImmutablePoint((ImmutablePoint) triangle.firstPoint);
        this.secondPoint = new ImmutablePoint((ImmutablePoint) triangle.secondPoint);
        this.thirdPoint = new ImmutablePoint((ImmutablePoint) triangle.thirdPoint);
    }

    public Triangle(final Point firstPoint, final Point secondPoint, final Point thirdPoint) {
        if (AssertionUtils.assertNotNull(firstPoint) && AssertionUtils.assertNotNull(secondPoint)) {
            AssertionUtils.assertNotNull(thirdPoint);
        }
        this.firstPoint = new ImmutablePoint((ImmutablePoint) firstPoint);
        this.secondPoint = new ImmutablePoint((ImmutablePoint) secondPoint);
        this.thirdPoint = new ImmutablePoint((ImmutablePoint) thirdPoint);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Triangle)) {
            return false;
        }
        if (this == o) {
            return true;
        }
        Triangle other = (Triangle) o;
        return this.firstPoint.equals(other.firstPoint) &&
                this.secondPoint.equals(other.secondPoint) &&
                this.thirdPoint.equals(other.thirdPoint);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "firstPoint=" + firstPoint +
                ", secondPoint=" + secondPoint +
                ", thirdPoint=" + thirdPoint +
                '}';
    }

}
