package com.example.spring;

/*
WAP that reads an integer between 1 and 7 and print the day of the week in English.
 */

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Enter the index of the day of week:");

            int dayOfWeek = scanner.nextInt();

            System.out.println("Day of week entered: " + findDayOfWeek(dayOfWeek));
        }
    }

    private static String findDayOfWeek(int day) {
        switch (day) {
            case 1: return "Monday";
            case 2: return "Tuesday";
            case 3: return "Wednesday";
            case 4: return "Thursday";
            case 5: return "Friday";
            case 6: return "Saturday";
            case 7: return "Sunday";
        }
        return "Invalid Day";
    }
}
