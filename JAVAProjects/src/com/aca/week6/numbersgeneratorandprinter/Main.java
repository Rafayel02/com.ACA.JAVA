package com.aca.week6.numbersgeneratorandprinter;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> integers = getSequentialIntegers(5);
        printList(integers);

        List<Double> doubles = getRandomDoubles(2);
        printList(doubles);
    }

    public static List<Integer> getSequentialIntegers(int count) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= count; i++) {
            list.add(i);
        }
        return list;
    }

    public static List<Double> getRandomDoubles(int count) {
        List<Double> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            list.add(Math.random() * 100);
        }
        return list;
    }

    public static void printList(List<? extends Number> list) {
        for(Number number: list) {
            System.out.println(number.doubleValue() * 2);
        }
    }

}
