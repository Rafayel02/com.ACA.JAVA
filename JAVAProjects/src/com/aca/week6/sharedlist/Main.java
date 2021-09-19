package com.aca.week6.sharedlist;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final int THREADS_COUNT = 100;
    private static final List<Integer> integers = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < THREADS_COUNT; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    addNumbersToList();
                }
            }).start();
        }

        Thread.sleep(2000);
        System.out.println(integers.size());
    }

    private static synchronized void addNumbersToList() {
        for (int i = 1; i <= 500; i++) {
            integers.add(i);
        }
    }

}
