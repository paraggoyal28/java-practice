package com.example.spring;

import java.util.Scanner;

/*
WAP to check whether a number is even or odd

 */
public class Question32 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }
}
