package com.aca.week6.runnables.fileWriter;

import java.io.*;

public class FileWriterRunnable implements Runnable {

    private final File file;
    public final static int ROW_COUNT = 10000;
    private final static String[] LETTERS = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

    public FileWriterRunnable(File file) {
        this.file = file;
    }

    @Override
    public void run() {
        try (OutputStream outputStream = new FileOutputStream(file)) {
            for (int i = 0; i < ROW_COUNT; i++) {
                String randomStringLine = getRandomStringLine();
                outputStream.write(((i + 1) + ": " + randomStringLine).getBytes());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private String getRandomStringLine() {
        StringBuilder sb = new StringBuilder();
        int size = (int) ((Math.random() * 3) + 1);
        for (int i = 0; i < size; i++) {
            sb.append(LETTERS[(int) (Math.random() * 25)]);
        }
        sb.append("\n");
        return sb.toString();
    }

}
