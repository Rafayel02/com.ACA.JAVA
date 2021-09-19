package com.aca.week6.runnables;

import com.aca.week6.runnables.fileWriter.FileWriterRunnable;
import com.aca.week6.runnables.filegenerator.FileGeneratorRunnable;
import com.aca.week6.utils.FilePath;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String fileName = "test.txt";
        Runnable runnable2 = new FileWriterRunnable(new File(FilePath.DESKTOP_PATH + fileName));
        runnable2.run();

        Runnable runnable1 = new FileGeneratorRunnable();
        runnable1.run();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input strings and type % to start searching: ");

        List<String> inputStrings = new ArrayList<>();
        int index = 1;
        while (true) {
            System.out.print(index + ": ");
            String line = scanner.nextLine();
            if (line.equals("%")) {
                break;
            }
            inputStrings.add(line);
            index++;
        }
        Runnable anonymousRunnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < FileGeneratorRunnable.FILES_COUNT; i++) {
                    String fileName = "testFiles\\file" + i + ".txt";
                    try (BufferedReader reader = new BufferedReader(new FileReader(new File(FilePath.DESKTOP_PATH + fileName)))) {
                        for (int j = 0; j < FileWriterRunnable.ROW_COUNT; j++) {
                            String text = reader.readLine().split(": ")[1];
                            if(areEqual(i, text, inputStrings)) {
                                System.out.println("file"+ i +" contains " + text);
                            }
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

            }
        };
        anonymousRunnable.run();

    }

    private static boolean areEqual(int i, String text, List<String> inputStrings) {
        for(String inputtedText: inputStrings) {
            if(inputtedText.equals(text)) {
                return true;
            }
        }
        return false;
    }

}
