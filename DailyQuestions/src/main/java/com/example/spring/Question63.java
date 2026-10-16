package com.example.spring;

import java.util.Scanner;

/*
Write a program that will find the second-largest number among the user's input of three numbers.

 */
public class Question63 {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter first number: ");
        double a = SCANNER.nextDouble();
        System.out.print("Enter second number: ");
        double b = SCANNER.nextDouble();
        System.out.print("Enter third number: ");
        double c = SCANNER.nextDouble();

        if (a > b && a > c) {
            if (b > c) {
                System.out.printf("%.2f is second largest\n", b);
            } else {
                System.out.printf("%.2f is second largest\n", c);
            }
        }
        else if (b > a && b > c) {
            if (a > c) {
                System.out.printf("%.2f is second largest\n", a);
            } else {
                System.out.printf("%.2f is second largest\n", c);
            }
        }
        else {
            if (a > b) {
                System.out.printf("%.2f is second largest\n", a);
            } else {
                System.out.printf("%.2f is second largest\n", b);
            }
        }
    }
}
