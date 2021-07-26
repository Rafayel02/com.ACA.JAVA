package com.aca.week2.JavaPracticalProblems;

public enum Direction {
    NORTH(10),
    SOUTH(-10),
    EAST(0),
    WEST(0);

    private int value;

    Direction(int value) {
        this.value = value;
    }

    public static void printValues() {
        for (Direction direction : Direction.values()) {
            System.out.println(direction.value);
        }
    }

}
