package com.example.spring;

import java.util.Scanner;

/*
Write a program to calculate the sum of the two given integer values.
Return three times the sum of the two values if they are equal.
 */
public class Question64 {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the first integer value: ");
        int num1 = SCANNER.nextInt();
        System.out.print("Enter the second integer value: ");
        int num2 = SCANNER.nextInt();
        if (num1 == num2) {
            System.out.println("Sum is: " + (num1 + num2) * 3);
        } else {
            System.out.println("Sum is: " + (num1 + num2));
        }
    }
}
