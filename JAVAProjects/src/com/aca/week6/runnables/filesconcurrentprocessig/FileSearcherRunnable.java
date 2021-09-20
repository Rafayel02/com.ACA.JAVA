package com.aca.week6.runnables.filesconcurrentprocessig;

import com.aca.week6.runnables.fileWriter.FileWriterRunnable;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileSearcherRunnable implements Runnable {

    private final File file;
    private final String valueForSearch;

    public FileSearcherRunnable(File file, String valueForSearch) {
        this.file = file;
        this.valueForSearch = valueForSearch;
    }

    @Override
    public void run() {
        int counter = getCountOfValueInFile(this.file, this.valueForSearch);
        System.out.println("File " + file.getName() + " " + counter);
    }

    public static int getCountOfValueInFile(File file, String valueForSearch) {
        Runnable fileWriterRunnable = new FileWriterRunnable(file);
        fileWriterRunnable.run();

        int counter = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            for (int j = 0; j < FileWriterRunnable.ROW_COUNT; j++) {
                String text = reader.readLine().split(": ")[1];
                if (text.equals(valueForSearch)) {
                    counter++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return counter;
    }

}
