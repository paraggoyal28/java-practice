package com.example.spring;

/*
WAP to check if the two given numbers either of the number is 6 or their sum is 6 or their difference is 6
 */

import java.util.Scanner;

public class Question72 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        if (num1 + num2 == 6 || num1 == 6 || num2 == 6 || Math.abs(num1 - num2) == 6) {
            System.out.printf("Either %d and %d is 6 or their sum or difference is 6\n", num1, num2);
        } else {
            System.out.printf("Neither %d and %d is 6 nor their sum nor difference is 6\n", num1, num2);
        }
    }
}
