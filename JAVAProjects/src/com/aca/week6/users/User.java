package com.aca.week6.users;

public class User implements Comparable {
    private int age;
    private String Name;

    public User(int age, String name) {
        this.age = age;
        Name = name;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
