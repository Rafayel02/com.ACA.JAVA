package com.aca.week5;

import com.aca.week5.task1.CustomArrayList;

public class Main {

    public static void main(String[] args) {
        CustomArrayList<String> strings = new CustomArrayList<String>(2);
        System.out.println(strings);
        strings.add("a");
        System.out.println(strings);
        strings.add("b");
        System.out.println(strings);
        strings.add("c");
        System.out.println(strings);
        strings.add(0, "1");
        System.out.println(strings);
        strings.addFromBeginning("3");
        System.out.println(strings);
    }

}
