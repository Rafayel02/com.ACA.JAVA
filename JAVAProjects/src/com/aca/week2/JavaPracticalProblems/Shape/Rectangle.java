package com.aca.week2.JavaPracticalProblems.Shape;

public class Rectangle implements Shape {
    private final String name = "Rectangle";
    private double sideLength;
    private double sideWidth;

    public Rectangle(double sideLength, double sideWidth) {
        this.sideLength = sideLength;
        this.sideWidth = sideWidth;
    }

    @Override
    public Double calculateArea() {
        return sideLength*sideWidth;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
