package com.example.spring;

import java.util.Scanner;

/*
WAP to convert pounds to grams
1 kg = 2.20462 lbs
1 kg = 1000 grams
1 lb = 1000/2.20462 grams
 */
public class Question89 {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final double POUNDS_IN_KG = 2.20462;
    private static final double GRAMS_IN_KG = 1_000;
    public static void main(String[] args) {
        double lbs, grams;
        System.out.print("Enter the weight in pounds: ");
        lbs = SCANNER.nextDouble();
        grams = lbs * GRAMS_IN_KG/POUNDS_IN_KG;
        System.out.printf("There are %.2f grams in %.2f pounds\n", grams, lbs);
    }
}
