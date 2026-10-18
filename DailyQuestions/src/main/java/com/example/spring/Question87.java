package com.example.spring;

/*
Write a program to Convert Kilogram to Pounds.
1 Kg = 2.20462 lbs
 */

import java.util.Scanner;

public class Question87 {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final double LBS_IN_KG = 2.20462;
    public static void main(String[] args) {
        double kgs, lbs;
        System.out.print("Enter weight in kilograms: ");
        kgs = SCANNER.nextDouble();
        lbs = kgs * LBS_IN_KG;
        System.out.printf("There are %.2f pounds in %.2f kilograms.\n", lbs, kgs);
    }
}
