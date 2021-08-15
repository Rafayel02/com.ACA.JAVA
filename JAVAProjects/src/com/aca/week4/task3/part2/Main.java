package com.aca.week4.task3.part2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Clock clock = null;

        Scanner sc = new Scanner(System.in);
        System.out.print("Fast or slow (1/2): ");
        int value = sc.nextInt();
        if(value == 1) {
            clock = new FastClock();
        } else if(value == 2) {
            clock = new SlowClock();
        } else {
            System.out.println("Invalid input");
        }
        if(clock != null) {
            clock.start();
        }

    }


}
