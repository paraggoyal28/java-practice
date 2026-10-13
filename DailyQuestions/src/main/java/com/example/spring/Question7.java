package com.example.spring;

/*
Write a program that reads three floating values and check if it is possible to make a
triangle with them. Also calculate the perimeter of the triangle if the entered values are valid.

 */

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.println("Enter second number: ");
            double num2 = scanner.nextDouble();

            System.out.println("Enter third number: ");
            double num3 = scanner.nextDouble();

            if (canFormTriangle(num1, num2, num3)) {
                System.out.println("The perimeter of the triangle formed: ");
                System.out.println(calculatePerimeter(num1, num2, num3));
            } else {
                System.out.println("Triangle cannot be formed");
            }

        }
    }

    private static double calculatePerimeter(double num1, double num2, double num3) {
        return num1 + num2 + num3;
    }

    private static boolean canFormTriangle(double num1, double num2, double num3) {
        return ((num1 < (num2 + num3)) && (num2 < (num1 + num3)) && (num3 < (num1 + num2)));
    }

}
