package com.aca.week6.runnables.filesconcurrentprocessig;

import com.aca.week6.runnables.fileWriter.FileWriterRunnable;
import com.aca.week6.utils.FilePath;

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
        Runnable fileWriterRunnable = new FileWriterRunnable(this.file);
        fileWriterRunnable.run();

        int counter = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(this.file))) {
            for (int j = 0; j < FileWriterRunnable.ROW_COUNT; j++) {
                String text = reader.readLine().split(": ")[1];
                if(text.equals(this.valueForSearch)) {
                    counter++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("File "+file.getName()+" "+counter);
    }

}
