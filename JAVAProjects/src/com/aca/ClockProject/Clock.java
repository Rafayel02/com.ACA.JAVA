package com.aca.ClockProject;

public class Clock {

    public static void main(String[] args) {
        long startMillis = System.currentTimeMillis();
        long globalStartMillis = startMillis;

        while (true) {
            long currentMillis = System.currentTimeMillis();
            if (currentMillis - startMillis >= 1000) {
                long seconds = (currentMillis - globalStartMillis) / 1000;
                clock(seconds);
                startMillis = currentMillis;
            }

        }

    }

    private static void clock(long seconds) {
        System.out.println((seconds / 3600) % 24 + ":" + (seconds / 60) % 60 + ":" + seconds % 60);
    }

}
