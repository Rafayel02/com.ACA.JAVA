package com.aca.week4.Task3.part3;

public class Main {
    public static void main(String[] args) {
        X86IntelProcessor x86IntelProcessor = new X86IntelProcessor();
        X8664IntelProcessor x8664IntelProcessor = new X8664IntelProcessor();
        ArmProcessor armProcessor = new ArmProcessor();

        long start = System.currentTimeMillis();
        System.out.println(x86IntelProcessor.calculateBinary(25));
        System.out.println(x86IntelProcessor.calculateBinary(884));
        System.out.println(x86IntelProcessor.calculateBinary(721));

        long end1 = System.currentTimeMillis();
        System.out.println(end1 - start);

        System.out.println(x8664IntelProcessor.calculateBinary(25));
        System.out.println(x8664IntelProcessor.calculateBinary(884));
        System.out.println(x8664IntelProcessor.calculateBinary(721));

        long end2 = System.currentTimeMillis();
        System.out.println(end2 - end1);

        System.out.println(armProcessor.calculateBinary(25));
        System.out.println(armProcessor.calculateBinary(884));
        System.out.println(armProcessor.calculateBinary(721));

        long end3 = System.currentTimeMillis();
        System.out.println(end3 - end2);

    }
}
