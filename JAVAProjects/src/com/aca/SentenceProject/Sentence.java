package com.aca.SentenceProject;

public class Sentence {

    private final String[] wordsArray = new String[5];
    private int count = 0;

    public void append(String word) {
        if (count == 5) {
            System.out.println("Array is full!");
            return;
        }
        wordsArray[count] = word;
        count++;
    }

    public String getValue() {
        StringBuilder result = new StringBuilder("");

        for (int i = 0; i < this.count; i++) {
            String symbol = getSentenceSymbol(i);

            result.append(wordsArray[i]);
            result.append(symbol);

        }

        return result.toString();
    }

    public int getWordsCount() {
        return this.count;
    }

    private String getSentenceSymbol(int index) {
        if (index != this.count - 1) {
            return " ";
        }
        return ".";

    }

}
