package com.aca.week4.task1.part1;

public class User {

    private String firstName;
    private String lastName;
    private String username;
    private String email;

    public User(String firstName, String lastName, String username, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.email = email;
    }

    public User(User user) {
        this.firstName = user.firstName;
        this.lastName = user.lastName;
        this.username = user.username;
        this.email = user.email;
    }

    public User copy() {
        return new User(this);
    }

    @Override
    public String toString() {
        return "User " +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'';
    }
}
