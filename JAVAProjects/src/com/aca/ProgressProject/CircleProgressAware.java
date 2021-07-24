package com.aca.ProgressProject;

public class CircleProgressAware extends ProgressAware {

    @Override
    public String showProgress(int seconds) {
        if (this.isVisible) {
            int percent = this.calculatePercentage(seconds);
            if (percent >= 100) {
                return "Done!";
            }
            return String.format("Angel: %d", (360 * percent) / 100);
        }
        return "Progress is hidden!";
    }

}
