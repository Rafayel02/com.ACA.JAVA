package com.aca.week6.users;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        User user1 = new User(1, "User1");
        User user2 = new User(2, "User2");
        User user3 = new User(3, "User3");
        User user4 = new User(4, "User4");
        User user5 = new User(5, "User5");

        List<User> arrayList = new ArrayList<>();
        arrayList.add(user1);
        arrayList.add(user2);
        arrayList.add(user3);
        arrayList.add(user4);
        arrayList.add(user5);

        List<User> linkedList = new LinkedList<>();
        linkedList.add(user1);
        linkedList.add(user2);
        linkedList.add(user3);
        linkedList.add(user4);
        linkedList.add(user5);

        Set<User> hashSet = new HashSet<>();
        hashSet.add(user1);
        hashSet.add(user2);
        hashSet.add(user3);
        hashSet.add(user4);
        hashSet.add(user5);

        Set<User> treeSet = new TreeSet<>();
        treeSet.add(user1);
        treeSet.add(user2);
        treeSet.add(user3);
        treeSet.add(user4);
        treeSet.add(user5);

        assertion(arrayList);
        assertion(linkedList);
        assertion(treeSet);
        assertion(hashSet);

    }

    public static void assertion(Collection<User> list) {
        if (list instanceof ArrayList || list instanceof LinkedList) {
            assert list.size() == 5;
        }
        assert list.size() == 3;
    }

}
