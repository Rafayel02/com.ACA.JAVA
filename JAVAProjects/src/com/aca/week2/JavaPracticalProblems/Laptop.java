package com.aca.week2.JavaPracticalProblems;

public class Laptop {

    private static int publicConstructorCounter;
    private static int protectedConstructorCounter;

    public Laptop() {
        publicConstructorCounter++;
    }

    protected Laptop(int a) {
        protectedConstructorCounter++;
    }

    public static int getPublicConstructorCounter() {
        return publicConstructorCounter;
    }

    public static int getProtectedConstructorCounter() {
        return protectedConstructorCounter;
    }

    public static int getObjectsCount(){
        return protectedConstructorCounter + publicConstructorCounter;
    }

}
