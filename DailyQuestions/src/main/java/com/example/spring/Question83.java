package com.example.spring;

/*
WAP to find a particular year is a leap year or not
 */

import java.util.Scanner;

public class Question83 {
    private static final Scanner scanner = new Scanner(System.in);
    private static boolean isLeap(int year) {
        return ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0));
    }

    public static void main(String[] args) {
        System.out.print("Enter the given year to check for leap year: ");
        int year = scanner.nextInt();
        System.out.printf("The given year %d is leap: %b", year, isLeap(year));
    }
}
