package com.aca.week4.Task3.part3;

public class X8664IntelProcessor implements Processor {
    @Override
    public String calculateBinary(long decimal) {
        long start = System.currentTimeMillis();
        String binary = DecimalBinaryConvertor.getBinaryFrom(decimal);
        while (true) {
            long current = System.currentTimeMillis();
            if (current - start >= 2000) {
                break;
            }
        }
        return binary;
    }
}
