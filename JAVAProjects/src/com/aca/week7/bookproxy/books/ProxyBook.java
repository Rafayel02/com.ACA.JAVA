package com.aca.week7.bookproxy.books;

import com.aca.week7.bookproxy.exception.FileLoaderException;

public class ProxyBook extends Book {
    private boolean flag;

    public void load() {
        if(!isLoaded()) {
            this.flag = true;
            return;
        }
        throw new FileLoaderException("File already loaded!");
    }

    @Override
    public String getTitle() {
        if(isLoaded()) {
            return super.getTitle();
        }
        throw new FileLoaderException("File hasn't been loaded!");
    }

    @Override
    public String getAuthor() {
        if(isLoaded()) {
            return super.getAuthor();
        }
        throw new FileLoaderException("File hasn't been loaded!");
    }

    public boolean isLoaded() {
        return flag;
    }

}
