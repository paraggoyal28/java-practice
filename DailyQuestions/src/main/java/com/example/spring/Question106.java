package com.example.spring;

import java.util.Scanner;

/*
Write a program that uses bitwise operators to multiply an entered value by four.
 */
public class Question106 {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        int number;
        System.out.print("Enter a number: ");
        number = SCANNER.nextInt();
        int multipliedByFour = number << 2;

        System.out.printf("Given number %d multiplied by four is %d\n", number, multipliedByFour);
    }
}
