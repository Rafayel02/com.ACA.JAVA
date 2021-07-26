package com.aca.week2.JavaPracticalProblems.Shape;

public class Square2 extends Rectangle{
    private final String name = "Square";
    private double sideLength;

    public Square2(double sideLength) {
        super(sideLength, sideLength);
        this.sideLength = sideLength;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
