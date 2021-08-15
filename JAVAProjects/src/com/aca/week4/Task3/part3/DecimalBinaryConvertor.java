package com.aca.week4.Task3.part3;

public class DecimalBinaryConvertor {

    public static String getBinaryFrom(long decimal) {
        StringBuilder sb = new StringBuilder();
        while (decimal != 0) {
            sb.append(decimal % 2);
            decimal /= 2;
        }
        return sb.reverse().toString();
    }

}
