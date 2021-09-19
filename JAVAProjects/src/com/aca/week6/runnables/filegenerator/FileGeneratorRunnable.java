package com.aca.week6.runnables.filegenerator;

import com.aca.week6.runnables.fileWriter.FileWriterRunnable;
import com.aca.week6.utils.FilePath;

import java.io.File;

public class FileGeneratorRunnable implements Runnable {

    public static final int FILES_COUNT = 10;

    @Override
    public void run() {
        for (int i = 0; i < FILES_COUNT; i++) {
            String fileName = "testFiles\\file" + i + ".txt";
            Runnable fileWriterRunnable = new FileWriterRunnable(new File(FilePath.DESKTOP_PATH + fileName));
            fileWriterRunnable.run();
        }
    }

}
