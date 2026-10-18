package com.example.spring;

/*
Write a program to convert bytes to kilobytes.
 */

import java.util.Scanner;

public class Question77 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the given number of bytes: ");
        double bytes = scanner.nextDouble();
        double kilobytes = bytes / 1024;
        System.out.printf("Given %f converted to kilobytes %f\n", bytes, kilobytes);
    }
}
