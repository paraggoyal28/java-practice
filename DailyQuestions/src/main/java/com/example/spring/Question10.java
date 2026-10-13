package com.example.spring;

/*
WAP to find greater of two numbers
 */

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter first number: ");

            double firstNum = scanner.nextDouble();

            System.out.println("Enter second number: ");

            double secondNum = scanner.nextDouble();

            System.out.println("Greater of the two numbers: " + Math.max(firstNum, secondNum));
        }
    }
}
