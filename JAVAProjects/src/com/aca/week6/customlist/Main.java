package com.aca.week6.customlist;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        SimpleList<String> unsafeStringList = new UnsafeList<>();

        for (int i = 0; i < 20; i++) {
            final int index = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    unsafeStringList.add("a" + index);
                }
            }).start();
        }

        SimpleList<String> safeStringList = new SafeList<>();

        for (int i = 0; i < 20; i++) {
            final int index = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    safeStringList.add("a" + index);
                }
            }).start();
        }

        Thread.sleep(5000);
        System.out.println(unsafeStringList.getSize());
        System.out.println(safeStringList.getSize());

    }

}
