package com.example.spring;

import java.util.Scanner;

/*
Write a program to calculate the exact difference between x and 21.
Return three times the absolute difference if x is greater than 21.
 */
public class Question51 {
    private static final Scanner STDIN_SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        int x = STDIN_SCANNER.nextInt();
        if (x <= 21) {
            System.out.printf("Absolute difference between the number and 21: %d\n", Math.abs(x - 21));
        } else {
            System.out.printf("Absolute difference between the number and 21: %d\n", Math.abs(x - 21) * 3);
        }
    }
}
