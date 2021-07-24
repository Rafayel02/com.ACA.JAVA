package com.aca.SentenceProject;

public class Main {

    public static void main(String[] args) {
        Sentence sentence1 = new Sentence();

        sentence1.append("Hello");
        sentence1.append("darkness");
        sentence1.append("my");
        sentence1.append("old");
        sentence1.append("friend");

        sentence1.append("additionalTextForTest");

        System.out.println("Value: " + sentence1.getValue());
        System.out.println("Word count: " + sentence1.getWordsCount());

        System.out.println("----------------");

        Sentence sentence2 = new Sentence();
        sentence2.append("One");
        sentence2.append("two");

        System.out.println("Value: " + sentence2.getValue());
        System.out.println("Word count: " + sentence2.getWordsCount());

        System.out.println("----------------");

        ModifiedSentence modifiedSentence = new ModifiedSentence();
        modifiedSentence.append("Version")
                .append("with")
                .append("method")
                .append("of")
                .append("chaining")
                .append("additional");

        System.out.println("Value: " + modifiedSentence.getValue());
        System.out.println("Word count: " + modifiedSentence.getWordsCount());


    }
}
