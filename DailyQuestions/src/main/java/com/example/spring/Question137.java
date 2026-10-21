package com.example.spring;

/* Write a program that uses a for loop to determine power of a number entered by the user. */

import java.util.Scanner;

public class Question137 {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        double number = SCANNER.nextDouble();
        System.out.print("Enter the power: ");
        int power = SCANNER.nextInt();
        double ans = 1;
        for (int i = 0; i < power; ++i) {
            ans *= number;
        }
        System.out.printf("Power of number %f raised to %d: %f\n", number, power, ans);
    }
}
