package com.example.spring;

import java.util.Scanner;

/*
Write a program to find square root of a entered number.
 */
public class Question118 {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        double num = SCANNER.nextDouble();
        double sqrt = Math.sqrt(num);
        System.out.printf("The square root of %.2f is %.2f\n", num, sqrt);
    }
}
