package com.example.spring;

import java.util.Scanner;

/*
Write a program that reads in two numbers and determine whether the
first number is a multiple of the second number.
 */
public class Question52 {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the first number: ");
        int num1 = SCANNER.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = SCANNER.nextInt();
        // if first number is a multiple of second number
        if (num1%num2 == 0) {
            System.out.println("First number is the multiple of second number");
        } else {
            System.out.println("First number is not the multiple of second number");
        }
    }
}
