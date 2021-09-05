package com.aca.week5;

import com.aca.week5.task1.CustomArrayList;
import com.aca.week5.task2.CustomLinkedList;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        CustomArrayList<String> strings = new CustomArrayList<String>();
//        System.out.println(strings);
//        strings.add("a");
//        System.out.println(strings);
//        strings.add("b");
//        System.out.println(strings);
//        strings.add("c");
//        System.out.println(strings);
//        strings.add(3, "1");
//        System.out.println(strings);
//        strings.add(2, "d");
//        System.out.println(strings);
//        strings.deleteByElement("a");
//        System.out.println(strings);
//        strings.add("e");
//        System.out.println(strings);
//        strings.deleteByIndex(2);
//        System.out.println(strings);
//        strings.deleteByIndex(3);
//        System.out.println(strings);
//        System.out.println(strings.getIdOfElement("1"));
//
//        for(int i = 0; i < 30; i++) {
//            strings.add("f");
//        }
//        System.out.println(strings);
//        System.out.println(strings.testSize());
//
//        for(int i = 0; i < 30; i++) {
//            strings.deleteByIndex(0);
//        }
//        System.out.println(strings);
//        System.out.println(strings.testSize());
//
//        CustomArrayList<Integer> a = new CustomArrayList<>();
//        a.add(12);
//        a.add(11);
//        a.add(13);
//        a.add(1);
//        System.out.println(a);
//        a.sortByBubble();
//        System.out.println(a);
//
//        CustomLinkedList<Integer> customLinkedList = new CustomLinkedList<>();
//
//        customLinkedList.add(1);
//        customLinkedList.add(2);
//        customLinkedList.add(3);
//
//        System.out.println(customLinkedList.getIdFromElement(1));
//        System.out.println(customLinkedList.getIdFromElement(2));
//        System.out.println(customLinkedList.getIdFromElement(3));
//
//
//
////        System.out.println(customLinkedList.getIdFromElement(4));
//
//        CustomLinkedList<Integer> customLinkedList1 = new CustomLinkedList<>();
//
//        customLinkedList1.add(1);
//        customLinkedList1.add(2);
//        customLinkedList1.add(3);
//        customLinkedList1.add(4);
//        customLinkedList1.add(5);
//        customLinkedList1.add(6);
//
//        System.out.println(customLinkedList1);
//
//        customLinkedList1.deleteElement(4);
//        System.out.println(customLinkedList1);
//        customLinkedList1.deleteElement(6);
//        System.out.println(customLinkedList1);
//
//        customLinkedList1.addFromBeginning(12);
//
//        System.out.println(customLinkedList1);
//
//        customLinkedList1.add(12, 1);
//
//        System.out.println(customLinkedList1);
//
//        customLinkedList1.add(12, 5);
//
//        System.out.println(customLinkedList1);

//        strings.sortByBubble();

        CustomLinkedList<Integer> customLinkedList = new CustomLinkedList<>();
        customLinkedList.add(1, 0);
        System.out.println(customLinkedList);
        customLinkedList.add(2);
        System.out.println(customLinkedList);
        customLinkedList.add(3);
        System.out.println(customLinkedList);
        customLinkedList.add(4, 0);
        System.out.println(customLinkedList);
        customLinkedList.add(5, 3);
        System.out.println(customLinkedList);
        customLinkedList.add(6, 5);
        System.out.println(customLinkedList);
        customLinkedList.add(9);
        System.out.println(customLinkedList);
//        customLinkedList.add(9);
//        System.out.println(customLinkedList);
        customLinkedList.addFromBeginning(12);
        System.out.println(customLinkedList);
        customLinkedList.deleteElement(12);
        System.out.println(customLinkedList);
        customLinkedList.deleteElement(9);
        System.out.println(customLinkedList);
        customLinkedList.deleteElement(5);
        System.out.println(customLinkedList);


    }

}
