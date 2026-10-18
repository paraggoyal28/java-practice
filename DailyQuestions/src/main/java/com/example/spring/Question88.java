package com.example.spring;

import java.util.Scanner;

/*
WAP to convert kgs to ounces
1 Kg = 35.274 ounces
 */
public class Question88 {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final double OUNCES_IN_KG = 35.274;
    public static void main(String[] args) {
        double kgs, ounces;
        System.out.print("Enter the weight in kgs: ");
        kgs = SCANNER.nextDouble();

        ounces = kgs * OUNCES_IN_KG;

        System.out.printf("There are %.2f ounces in %.2f kgs", ounces, kgs);
    }
}
