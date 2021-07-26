package com.aca.week2.JavaPracticalProblems;

import com.aca.week2.JavaPracticalProblems.Aimal.Animal;
import com.aca.week2.JavaPracticalProblems.Aimal.Frog;
import com.aca.week2.JavaPracticalProblems.Book.Book;
import com.aca.week2.JavaPracticalProblems.Book.EBook;
import com.aca.week2.JavaPracticalProblems.Shape.*;
import com.aca.week2.JavaPracticalProblems.Staff.Designer;
import com.aca.week2.JavaPracticalProblems.Staff.Programmer;
import com.aca.week2.JavaPracticalProblems.Staff.Staff;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //Autoboxing/Unboxing 1
        Integer number = generateNegativeNumber();
        int absoluteNumber = getAbsoluteValue(number);
        System.out.println(absoluteNumber);

        //Autoboxing/Unboxing 2
        List<Double> doubleList = new ArrayList<>();
        double PI = 3.14;
        doubleList.add(PI);
        PI = doubleList.get(doubleList.size() - 1);
        System.out.println(PI);

        //Static Fields 1
        Laptop laptop1 = new Laptop();
        Laptop laptop2 = new Laptop();
        Laptop laptop3 = new Laptop();
        Laptop laptop4 = new Laptop(1);
        Laptop laptop5 = new Laptop(1);
        System.out.println(Laptop.getPublicConstructorCounter());
        System.out.println(Laptop.getProtectedConstructorCounter());

        //Static Fields 2
        System.out.println(Laptop.getObjectsCount());

        //Enums 1
        Direction.printValues();

        //Enums 2
        System.out.println(Month.getMonth(1));
        System.out.println(Month.getMonth(12));

        //Interfaces
        Animal frog = new Frog();
        Book ebook = new EBook();

        //Polymorphism
        Staff programmer = new Programmer();
        Staff designer = new Designer();
        programmer.work();
        designer.work();

        Shape circle = new Circle(12);
        System.out.println(circle.getName()+" area: "+circle.calculateArea());

        Shape rectangle = new Rectangle(1, 2);
        System.out.println(rectangle.getName()+" area: "+rectangle.calculateArea());

        Shape rightTriangle = new RightTriangle(3, 5, "hypo");
        System.out.println(rightTriangle.getName()+" area: "+rightTriangle.calculateArea());

        Shape square = new Square(5);
        System.out.println(square.getName()+" area: "+square.calculateArea());

        Shape square2 = new Square2(5);
        System.out.println(square2.getName()+" area: "+square.calculateArea());

    }

    public static Integer generateNegativeNumber() {
        Random random = new Random();
        int number = random.nextInt(-1 + 1000) - 1000;
        return Integer.valueOf(number);
    }

    public static int getAbsoluteValue(Integer number) {
        return Math.abs(number);
    }

}
