package com.aca.week4.task3.part2;

public class SlowClock implements Clock {
    private long seconds;

    @Override
    public void start() {
        long start = System.currentTimeMillis();
        while (true) {
            long current = System.currentTimeMillis();
            if (current - start >= 2000) {
                System.out.println(seconds++);
                start = current;
            }
        }
    }
}
