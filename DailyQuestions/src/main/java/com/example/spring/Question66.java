package com.example.spring;

import java.util.Scanner;

/*
WAP to determine whether a
positive number entered by the user is a multiple of three or five.
 */
public class Question66 {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter a positive number: ");
        int num1 = SCANNER.nextInt();
        if (num1%3 == 0 || num1%5 == 0) {
            System.out.printf("Given number %d is divisible by 3 or 5", num1);
        } else {
            System.out.printf("Given number %d is not divisible by 3 or 5", num1);
        }
        System.out.println();
    }
}
