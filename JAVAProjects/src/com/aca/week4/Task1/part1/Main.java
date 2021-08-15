package com.aca.week4.Task1.part1;

public class Main {

    public static void main(String[] args) {
        User user1 = new User("a", "b", "c", "d@gmail.com");
        User user2 = new User(user1);
        User user3 = user1.copy();

        System.out.println(user1);
        System.out.println("-------------");
        System.out.println(user2);
        System.out.println("-------------");
        System.out.println(user3);

    }

}
