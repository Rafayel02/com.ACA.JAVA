package com.aca.ProgressProject;

public class LineProgressAware extends ProgressAware {

    private int lineLength;

    public LineProgressAware(int lineLength) {
        if (lineLength < 0 || lineLength > 500) {
            throw new RuntimeException();
        }
        this.lineLength = lineLength;
    }

    @Override
    public String showProgress(int seconds) {
        if (this.isVisible) {
            int percent = this.calculatePercentage(seconds);
            if (percent >= 100) {
                return "Done!";
            }
            return String.format("Line width is: %d, Progress length is %d", (lineLength * percent) / 100, lineLength);
        }
        return "Progress is hidden!";
    }


}
