package com.example.spring;

/*
WAP to determine whether two entered non-negative numbers have the same last digit
 */

import java.util.Scanner;

public class Question70 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter a non-negative number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter another non-negative number: ");
        int num2 = scanner.nextInt();

        if (num1%10 == num2%10) {
            System.out.printf("Given two numbers %d and %d have the same unit digit\n", num1, num2);
        } else {
            System.out.printf("Given two numbers %d and %d have different unit digit\n", num1, num2);
        }
    }
}
