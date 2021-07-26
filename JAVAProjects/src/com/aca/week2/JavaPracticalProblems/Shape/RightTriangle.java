package com.aca.week2.JavaPracticalProblems.Shape;

public class RightTriangle implements Shape {
    private String name = "Right Triangle";
    private double oneSide;
    private double otherSide;
    private double hypotenuse;

    public RightTriangle(int oneSide, int otherSide) {
        if (oneSide < 0 || otherSide < 0) {
            throw new RuntimeException("sides can't be negative!");
        }
        this.oneSide = oneSide;
        this.otherSide = otherSide;
        this.hypotenuse = Math.sqrt(Math.pow(this.oneSide, 2) + Math.pow(this.otherSide, 2));
    }

    public RightTriangle(double oneSide, double hypotenuse, String withHypo) {
        if (hypotenuse < 0 || oneSide < 0) {
            throw new RuntimeException("sides can't be negative!");
        }
        this.oneSide = oneSide;
        this.hypotenuse = hypotenuse;
        this.otherSide = Math.sqrt(Math.pow(this.hypotenuse, 2) - Math.pow(this.oneSide, 2));
    }

    @Override
    public Double calculateArea() {
        return (oneSide * otherSide)/2;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
