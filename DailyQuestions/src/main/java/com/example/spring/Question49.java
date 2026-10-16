package com.example.spring;

import java.util.Scanner;

/*
WAP to left shift input data by 2 bits
 */
public class Question49 {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the input data: ");
        int number = SCANNER.nextInt();
        System.out.println("Original data: " + number);
        System.out.println("Original data shifted by 2 bits left: " + (number <<= 2));
    }
}
