package com.aca.week4.task1.part2;

import com.aca.week4.task1.part1.User;

public class UserGroup implements Cloneable {

    private static final int ARRAY_MAXIMUM_CAPACITY = 10;

    private User[] users = new User[ARRAY_MAXIMUM_CAPACITY];

    private static int counter = 0;

    public void addUser(User user) {
        if (isSpaceAvailable()) {
            users[counter] = user;
            counter++;
            return;
        }
        System.out.println("No space available!");
    }

    private boolean isSpaceAvailable() {
        return (users.length - counter) != 0;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        final UserGroup cloned = (UserGroup) super.clone();
        if (cloned != null) {
            cloned.users = copyUsers();
        }
        return cloned;
    }

    private User[] copyUsers() {
        User[] newUsers = new User[this.users.length];
        for (int i = 0; i < this.users.length; i++) {
            newUsers[i] = this.users[i].copy();
        }
        return newUsers;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UserGroup users[");
        for (int i = 0; i < counter; i++) {
            sb.append(users[i].toString());
            if (i != counter - 1) {
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }

}
