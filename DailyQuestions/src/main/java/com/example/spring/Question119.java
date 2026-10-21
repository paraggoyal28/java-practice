package com.example.spring;

import java.util.Scanner;

/*
Write a program to find power of a entered number using library function.
 */
public class Question119 {
    public static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        double num = SCANNER.nextDouble();
        System.out.println("Enter the exponent: ");
        double exponent = SCANNER.nextDouble();
        double power = Math.pow(num, exponent);
        System.out.printf("The number %.2f raise to %.2f is: %.2f\n", num, exponent, power);
    }
}
