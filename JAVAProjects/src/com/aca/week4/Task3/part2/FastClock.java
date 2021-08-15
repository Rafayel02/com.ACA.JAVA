package com.aca.week4.Task3.part2;

public class FastClock implements Clock {
    private long seconds;

    @Override
    public void start() {
        long start = System.currentTimeMillis();
        while (true) {
            long current = System.currentTimeMillis();
            if (current - start >= 500) {
                System.out.println(seconds++);
                start = current;
            }
        }
    }
}
