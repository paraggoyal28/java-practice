package com.example.spring;

import java.util.Scanner;

/*
Find square of a number using function
 */
public class Question42 {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the number for which we want to find the square of: ");
        double number = SCANNER.nextDouble();
        System.out.printf("Square of the number %.2f is %.2f", number, square(number));
    }

    private static double square(double number) {
        return  number * number;
    }
}
