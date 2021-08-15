package com.aca.week4.Task1.part2;

import com.aca.week4.Task1.part1.User;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        UserGroup userGroup = new UserGroup();

        for (int i = 0; i < 14; i++) {
            userGroup.addUser(new User("a", "a", "a", "a"));
        }

        UserGroup cloned = (UserGroup) userGroup.clone();
        System.out.println(userGroup);
        System.out.println(cloned);

    }
}
