package com.lambdaschool;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();

        System.out.println("Min Integer is " + Integer.MIN_VALUE);
        System.out.println("Max Integer is " + Integer.MAX_VALUE);

        System.out.println("\n*** Random Numbers ***");
        for (int i = 0; i < 7; i++) {
            System.out.println("Random number no bound: " + rand.nextInt());
            System.out.println("Random number 5 bound: " + rand.nextInt(5));
        }

        System.out.println("\n*** Random doubles ***");
        int i = 0;
        while (i < 7) {
            System.out.println("Random number: " + rand.nextDouble());
            i++;
        }

        System.out.println("\n*** Random integers until 0 ***");
        int testDW;
        do {
            testDW = rand.nextInt(7);
            System.out.println("Number: " + testDW);
        } while (testDW != 0);

        System.out.println("\n*** Random even numbers ***");
        for (int j = 0; j < 10; j++) {
            int test = rand.nextInt(10);
            System.out.println("Testing " + test);
            if ((test % 2) == 0) {
                // continue;
                break;
            }
            System.out.println(test);
        }

        System.out.println("\n*** Random day type ***");
        int randDay = rand.nextInt(7);
        if (randDay == 0 || randDay == 6) {
            System.out.println("Weekend");
        } else {
            System.out.println("Weekday");
        }

        System.out.println("\n*** Random day ***");
        switch (randDay) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
}
