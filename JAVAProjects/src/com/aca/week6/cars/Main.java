package com.aca.week6.cars;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Car unsafeCar = new UnsafeCar();
        for(int i = 0; i < 1000; i++) {
            final int index = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    unsafeCar.add("a"+index);
                }
            }).start();
        }

        Car safeCar = new SafeCar();
        for(int i = 0; i < 1000; i++) {
            final int index = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    safeCar.add("a"+index);
                }
            }).start();
        }

        Thread.sleep(1000);
        unsafeCar.printPassengerNames();
        safeCar.printPassengerNames();
    }

}
