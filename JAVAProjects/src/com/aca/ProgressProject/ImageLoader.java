package com.aca.ProgressProject;

public class ImageLoader extends CircleProgressAware {

    private String url;
    private boolean isLoaded = false;

    public String load(int seconds) {
        if (!this.isLoaded) {
            String res = super.showProgress(seconds);
            if ("Done!".equals(res)) {
                this.isLoaded = true;
                return "Done loading!";
            }
            return res;
        }
        return "Already loaded!";
    }

    public boolean isImageLoaded() {
        return isLoaded;
    }

}
