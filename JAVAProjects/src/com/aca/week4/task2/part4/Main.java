package com.aca.week4.task2.part4;

import com.aca.week4.task2.part1.AssertionUtils;
import com.aca.week4.task2.part2.ImmutablePoint;

public class Main {
    public static void main(String[] args) {
        ColoredTriangle coloredTriangle1 =
                new ColoredTriangle
                        (
                                new ImmutablePoint(1, 2),
                                new ImmutablePoint(3, 4),
                                new ImmutablePoint(5, 6),
                                Color.BLACK
                        );

        ColoredTriangle coloredTriangle2 =
                new ColoredTriangle
                        (
                                new ImmutablePoint(1, 2),
                                new ImmutablePoint(3, 4),
                                new ImmutablePoint(5, 6),
                                Color.RED
                        );

        Triangle triangle =
                new Triangle
                        (
                                new ImmutablePoint(1, 2),
                                new ImmutablePoint(3, 4),
                                new ImmutablePoint(5, 6)
                        );

        System.out.println(coloredTriangle1.equals(coloredTriangle2));
        System.out.println(coloredTriangle1.equals(triangle));

        System.out.println(AssertionUtils.assertEquals(1, 1));
        System.out.println(AssertionUtils.assertEquals(1d, 1d));
        System.out.println(AssertionUtils.assertEquals("a", "a"));
        System.out.println(AssertionUtils.assertEquals(false, false));
        System.out.println(AssertionUtils.assertNotNull(triangle));
    }
}
