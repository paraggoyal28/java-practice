package com.example.spring;

import java.util.Scanner;

/*
WAP to check whether two given numbers are equal or not
 */
public class Question81 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the first input number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second input number: ");
        int num2 = scanner.nextInt();

        if (num1 == num2) {
            System.out.printf("The given two numbers %d and %d are equal\n", num1, num2);
        } else {
            System.out.printf("The given numbers %d and %d are not equal\n", num1, num2);
        }
    }

}
