package com.aca.week6.binarynumbers;

import com.aca.week6.utils.Paths;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {

        File file = new File(Paths.DESKTOP_PATH + "sumTest.txt");

        int number1 = (int) (Math.random() * 100);
        int number2 = (int) (Math.random() * 100);
        writeBinaryNumbersTo(file, number1, number2);

        Thread.sleep(10000);
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            int binaryNumber1 = Integer.parseInt(reader.readLine());
            int binaryNumber2 = Integer.parseInt(reader.readLine());

            int decimalNumber1 = Integer.parseInt(String.valueOf(binaryNumber1), 2);
            int decimalNumber2 = Integer.parseInt(String.valueOf(binaryNumber2), 2);
            int sum = decimalNumber1 + decimalNumber2;

            writeBinaryNumbersTo(file, decimalNumber1, decimalNumber2, sum);
        }

    }

    private static void writeBinaryNumbersTo(File file, int... binaryNumbers) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (int binaryNumber : binaryNumbers) {
                writer.write(Integer.toBinaryString(binaryNumber));
                writer.newLine();
            }
        }
    }

}
