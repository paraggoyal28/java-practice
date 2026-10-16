package com.example.spring;

import java.util.Scanner;

/*
Write a program that accepts principal amount, rate of interest, time and compute the simple interest.
 */
public class Question43 {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the principal amount: ");
        double principle = SCANNER.nextDouble();
        System.out.print("Enter the annual rate of interest: ");
        double rateOfInterest = SCANNER.nextDouble();
        System.out.print("Enter the years: ");
        int years = SCANNER.nextInt();

        double simpleInterest = (principle * rateOfInterest * years)/100;
        System.out.printf("Calculated simple interest is: %.2f\n", simpleInterest);
    }
}
