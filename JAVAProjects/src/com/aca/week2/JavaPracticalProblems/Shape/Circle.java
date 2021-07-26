package com.aca.week2.JavaPracticalProblems.Shape;

public class Circle implements Shape {
    private String name = "Circle";
    private double radius;
    private static final double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public Double calculateArea() {
        return PI*Math.pow(this.radius, 2);
    }

    @Override
    public String getName() {
        return this.name;
    }
}
