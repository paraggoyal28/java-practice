package com.example.spring;

/*
WAP to accept three numbers and return the largest of all three.
 */

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter first number");
            double firstNumber = scanner.nextDouble();
            System.out.println("Enter second number");
            double secondNumber = scanner.nextDouble();
            System.out.println("Enter third number");
            double thirdNumber = scanner.nextDouble();

            System.out.println("Highest number among these: ");
            System.out.println(getHighest(firstNumber, secondNumber, thirdNumber));
        }
    }

    private static double getHighest(double num1, double num2, double num3) {
        return Math.max(num1, Math.max(num2, num3));
    }
}
