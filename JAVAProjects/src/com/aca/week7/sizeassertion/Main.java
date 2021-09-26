package com.aca.week7.sizeassertion;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List list = new ArrayList();
        System.out.println(check(list, 0));

        Set set = new HashSet();
        System.out.println(check(set, 2));
    }

    public static boolean check(final Collection collection, int size) {
        if(collection.size() != size) {
            throw new RuntimeException("Size mismatch!");
        }
        return true;
    }

}
