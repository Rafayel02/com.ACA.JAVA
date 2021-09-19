package com.aca.week6.runnables.filesconcurrentprocessig;

import com.aca.week6.utils.FilePath;

import java.io.File;

public class Main {

    public static final int THREADS_COUNT = 10;
    public static final String VALUE_FOR_SEARCH = "AB";

    public static void main(String[] args) {
        for (int i = 0; i < THREADS_COUNT; i++) {
            new Thread(new FileSearcherRunnable(
                    new File(FilePath.DESKTOP_PATH + "testFiles\\file" + i + ".txt"),
                    VALUE_FOR_SEARCH
            )).start();
        }
    }

}
