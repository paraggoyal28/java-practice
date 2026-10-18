package com.example.spring;

/*
WAP to determine whether a positive number entered by the user is a
multiple of three or five, but not both.
 */

import java.util.Scanner;

public class Question69 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter a postive number: ");
        int num = scanner.nextInt();

        if (num%3 == 0 && num%5 == 0) {
            System.out.printf("%d is divisible by both 3 and 5\n", num);
        } else if (num%3 == 0 || num%5 == 0) {
            System.out.printf("%d is divisible by either 3 or 5 but not both\n", num);
        } else {
            System.out.printf("%d is divisible by neither 3 nor 5\n", num);
        }
    }
}
