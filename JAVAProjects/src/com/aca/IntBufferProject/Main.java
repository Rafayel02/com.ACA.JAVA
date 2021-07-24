package com.aca.IntBufferProject;

public class Main {

    public static void main(String[] args) {
        LinkedIntBuffer linkedIntBuffer1 = new LinkedIntBuffer();
        LinkedIntBuffer linkedIntBuffer2 = new LinkedIntBuffer();
        LinkedIntBuffer linkedIntBuffer3 = new LinkedIntBuffer();
        LinkedIntBuffer linkedIntBuffer4 = new LinkedIntBuffer();
        linkedIntBuffer1.setValue(1);
        linkedIntBuffer2.setValue(2);
        linkedIntBuffer3.setValue(3);
        linkedIntBuffer4.setValue(4);

        linkedIntBuffer1.setNext(linkedIntBuffer2);
        linkedIntBuffer2.setNext(linkedIntBuffer3);
        linkedIntBuffer3.setNext(linkedIntBuffer4);

        System.out.println(linkedIntBuffer1);

    }
}
