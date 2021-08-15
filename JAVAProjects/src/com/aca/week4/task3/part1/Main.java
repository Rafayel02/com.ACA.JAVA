package com.aca.week4.task3.part1;

import com.aca.week4.task1.part1.User;
import com.aca.week4.task1.part2.UserGroup;
import com.aca.week4.task2.part2.ImmutablePoint;
import com.aca.week4.task2.part4.Color;
import com.aca.week4.task2.part4.ColoredTriangle;
import com.aca.week4.task2.part4.Triangle;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("f", "l", "u", "e");
        User user2 = new User("f2", "l2", "u2", "e2");

        Printer.specialPrint(user1);

        UserGroup userGroup = new UserGroup();
        userGroup.addUser(user1);
        userGroup.addUser(user2);

        Printer.specialPrint(userGroup);

        ImmutablePoint point = new ImmutablePoint(2, 3);

        Printer.specialPrint(point);

        Triangle triangle =
                new Triangle
                        (
                                new ImmutablePoint(1, 2),
                                new ImmutablePoint(3, 4),
                                new ImmutablePoint(5, 6)
                        );

        Printer.specialPrint(triangle);

        ColoredTriangle coloredTriangle =
                new ColoredTriangle
                        (
                                new ImmutablePoint(1, 2),
                                new ImmutablePoint(3, 4),
                                new ImmutablePoint(5, 6),
                                Color.GREEN
                        );

        Printer.specialPrint(coloredTriangle);

    }
}
