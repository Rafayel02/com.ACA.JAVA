package com.aca.week6.filessharedlist;

import com.aca.week6.utils.Paths;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final int THREADS_COUNT = 10;

    private static final List<String> sharedList = new ArrayList<>();

    private static final Thread[] THREADS = new Thread[THREADS_COUNT];

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < THREADS_COUNT; i++) {
            File file = new File(Paths.DESKTOP_PATH + "testFiles\\file" + i + ".txt");
            Thread currentThread = new Thread(new FilesSharedListAdderRunnable(file, "AB", sharedList));
            currentThread.start();
            THREADS[i] = currentThread;
        }

        for (Thread thread : THREADS) {
            thread.join();
        }

        for (String str : sharedList) {
            System.out.println(str);
        }

    }

}
