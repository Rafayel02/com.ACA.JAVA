package com.aca.week4.task3.part3;

public class ArmProcessor implements Processor {
    @Override
    public String calculateBinary(long decimal) {
        long start = System.currentTimeMillis();
        String binary = DecimalBinaryConvertor.getBinaryFrom(decimal);
        while (true) {
            long current = System.currentTimeMillis();
            if (current - start >= 1000) {
                break;
            }
        }
        return binary;
    }
}
