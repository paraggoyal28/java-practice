package com.example.spring;

import java.util.Scanner;

/*
WAP to find maximum between two numbers
 */
public class Question96 {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        double num1, num2;
        System.out.print("Enter first number: ");
        num1 = SCANNER.nextDouble();
        System.out.print("Enter second number: ");
        num2 = SCANNER.nextDouble();
        if (num1 > num2) {
            System.out.printf("%.2f is greater than %.2f\n", num1, num2);
        } else {
            System.out.printf("%.2f is greater than %.2f\n", num2, num1);
        }
    }
}
