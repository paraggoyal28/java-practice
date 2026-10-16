package com.example.spring;

import java.util.Scanner;

/*
Write a program that will examine two inputted integers and return true if
either of them is 50 or if their sum is 50.
 */
public class Question55 {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter first number: ");
        int num1 = SCANNER.nextInt();
        System.out.print("Enter second number: ");
        int num2 = SCANNER.nextInt();

        if (num1 + num2 == 50 || num1 == 50 || num2 == 50) {
            System.out.println("Either num1 or num2 is 50 or their sum is 50");
        } else {
            System.out.println("Neither of num1 nor num2 is 50 nor their sum is 50");
        }
    }
}
