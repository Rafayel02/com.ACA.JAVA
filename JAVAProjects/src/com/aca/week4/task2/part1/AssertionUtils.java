package com.aca.week4.task2.part1;

public class AssertionUtils {

    public static boolean assertEquals(int val1, int val2) {
        return check(val1 == val2);
    }

    public static boolean assertEquals(double val1, double val2) {
        return check(val1 == val2);
    }

    public static boolean assertEquals(String val1, String val2) {
        if (val1 == null && val2 == null) {
            return true;
        }
        if (val1 == null || val2 == null) {
            throw new RuntimeException("False");
        }
        return check(val1.equals(val2));
    }

    public static boolean assertEquals(boolean val1, boolean val2) {
        return check(val1 == val2);
    }

    public static boolean assertNotNull(Object obj) {
        if (obj != null) {
            return true;
        }
        throw new RuntimeException("False");
    }

    private static boolean check(boolean statement) {
        if (statement) {
            return true;
        }
        throw new RuntimeException("False!");
    }

}
