package com.aca.PersonBirthdayProject;

public class Person {

    private String name;
    private long birthdayInMillis = -1;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        if (this.birthdayInMillis != -1) {
            return String.valueOf(calculateAge());
        }
        return "Birthday does not exist!";
    }

    public void setBirthdayInMillis(long birthdayInMillis) {
        if(this.birthdayInMillis != -1) {
            System.out.println("Value already exists!");
            return;
        }
        if(birthdayInMillis < 0) {
            System.out.println("Invalid value to set!");
            return;
        }
        this.birthdayInMillis = birthdayInMillis;
    }

    private int calculateAge() {
        long currentTimeInMillis = System.currentTimeMillis();
        long diff = currentTimeInMillis - this.birthdayInMillis;
        return (int) (((diff / 1000) / 3600) / 24) / 365;
    }

}
