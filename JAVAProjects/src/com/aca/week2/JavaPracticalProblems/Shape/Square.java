package com.aca.week2.JavaPracticalProblems.Shape;

public class Square implements Shape{
    private final String name = "Square";
    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public Double calculateArea() {
        return Math.pow(sideLength, 2);
    }

    @Override
    public String getName() {
        return this.name;
    }
}
