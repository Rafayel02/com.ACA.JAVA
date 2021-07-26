package com.aca.week2.JavaPracticalProblems;

public enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    public static Month getMonth(int index) {
        return Month.values()[index - 1];
    }

}
