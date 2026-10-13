package com.example.spring;

/*
Write a program to find the square of a number.

 */

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the number: ");

            double number = scanner.nextDouble();

            System.out.println("The square of the number: " + (number * number));
        }
    }
}
