package com.aca.week6.cartesiansystem;

public class Main {

    public static void main(String[] args) {
        CartesianSystem system = new CartesianSystem();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    system.setX(1);
                    system.setY(1);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    system.setX(-1);
                    system.setY(-1);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.print("X: " + system.getX());
                    System.out.println(", Y: " + system.getY());
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();

    }

}
