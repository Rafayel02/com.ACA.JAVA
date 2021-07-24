package com.aca.ProgressProject;

public class Main {

    public static void main(String[] args) {
        ProgressAware progressAware = new ProgressAware();
        ProgressAware lineProgress = new LineProgressAware(500);
        ProgressAware circleProgress = new CircleProgressAware();
        ImageLoader imageLoader = new ImageLoader();

        progressAware.showProgress();
        imageLoader.showProgress();
        lineProgress.showProgress();


        long startMillis = System.currentTimeMillis();
        long globalStartMillis = startMillis;
        while (true) {
            int seconds = (int) ((System.currentTimeMillis() - startMillis) / 1000);
            if (seconds >= 1) {
                System.out.println("Second " + ((System.currentTimeMillis() - globalStartMillis) / 1000));
                System.out.println("Aware: " + progressAware.showProgress(5));
                System.out.println("Image: " + imageLoader.load(5));
                System.out.println("Line: " + lineProgress.showProgress(5));
                System.out.println("Circle: " + circleProgress.showProgress(5));

                startMillis = System.currentTimeMillis();
            }
        }

    }

}
