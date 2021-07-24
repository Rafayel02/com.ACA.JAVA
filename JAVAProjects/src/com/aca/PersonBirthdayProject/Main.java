package com.aca.PersonBirthdayProject;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("MyPerson");
        person1.setBirthdayInMillis(System.currentTimeMillis() - getMillisFromYear(11));
        System.out.println("Name: " + person1.getName() + ",\nAge: " + person1.getAge());

        System.out.println("-------------------");

        Person person2 = new Person();
        person2.setName("MySecondPerson");
        System.out.println("Name: " + person2.getName() + ",\nAge: " + person2.getAge());

        System.out.println("-------------------");

        Person person3 = new Person();
        person3.setName("MyThirdPerson");
        person3.setBirthdayInMillis(System.currentTimeMillis() - getMillisFromYear(12));
        person3.setBirthdayInMillis(System.currentTimeMillis() - getMillisFromYear(19));
        System.out.println("Name: " + person3.getName() + ",\nAge: " + person3.getAge());
    }

    private static long getMillisFromYear(int year) {
        return (long) year * 365 * 24 * 3600 * 1000;
    }

}
