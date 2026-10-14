package com.example.spring;

/*
WAP to print the remainder of two numbers entered by the user
 */

import java.util.Scanner;

public class Question21 {
    private final static Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter first number: ");
        int a = SCANNER.nextInt();
        System.out.print("Enter second number: ");
        int b = SCANNER.nextInt();
        int c = a % b;
        System.out.print("The result of mod is: ");
        System.out.println(c);
    }
}
