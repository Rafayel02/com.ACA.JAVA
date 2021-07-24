package com.aca.ProgressProject;

public class ProgressAware {

    protected boolean isVisible = false;
    protected long startMillis;

    public ProgressAware() {
        this.startMillis = System.currentTimeMillis();
    }

    public void showProgress() {
        System.out.println("Progress became visible!");
        this.isVisible = true;
    }

    public void hideProgress() {
        System.out.println("Progress became invisible!");
        this.isVisible = false;
    }

    public boolean isProgressVisible() {
        return this.isVisible;
    }

    public String showProgress(int seconds) {
        if (this.isVisible) {
            int percent = this.calculatePercentage(seconds);
            if (percent >= 100) {
                return "Done!";
            }
            return String.format("%d%s", percent, "%");
        }
        return "Progress is hidden!";
    }

    protected int calculatePercentage(int seconds) {
        long currentMillis = System.currentTimeMillis();
        int differenceInSeconds = (int) ((currentMillis - this.startMillis) / 1000);
        return (differenceInSeconds * 100) / seconds;
    }

}
