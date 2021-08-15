package com.aca.week4.lookandsay;

public class Main {
    public static void main(String[] args) {
        lookAndSay(10);
    }

    private static void lookAndSay(final int n) {
        String result = "1";
        for (int i = 0; i < n; i++) {
            result = getCountFrom(result);
            System.out.println(result);
        }
    }

    private static String getCountFrom(String number) {
        if(number.equals("1")) {
            return "11";
        }

        final char[] digitsArray = getDigitsArrayFrom(number);
        StringBuilder result = new StringBuilder();

        int unitCounter = 1;
        for (int i = 1; i < digitsArray.length; i++) {
            if (digitsArray[i] == digitsArray[i - 1]) {
                unitCounter++;
            } else {
                result.append(unitCounter).append(digitsArray[i - 1]);
                unitCounter = 1;
            }

            if (i == digitsArray.length - 1) {
                result.append(unitCounter).append(digitsArray[i]);
            }
        }

        return result.toString();
    }

    private static char[] getDigitsArrayFrom(String strNumber) {
        char[] digitsArray = new char[strNumber.length()];

        for (int i = 0; i < strNumber.length(); i++) {
            digitsArray[i] = strNumber.charAt(i);
        }

        return digitsArray;
    }

}
