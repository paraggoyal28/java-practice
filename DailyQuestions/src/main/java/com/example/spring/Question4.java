package com.example.spring;

import java.util.Scanner;

/*
problem: function takes two numbers from input and returns the output
author: parag kumar goyal
 */
public class Question4 {

    private static double calculateSum(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double firstNumber = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double secondNumber = scanner.nextDouble();
        System.out.printf("The sum of the numbers are: %-10.2f\n",
                calculateSum(firstNumber, secondNumber));
        scanner.close();
    }
}
