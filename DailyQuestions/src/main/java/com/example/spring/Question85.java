package com.example.spring;

import java.util.Scanner;

/*
WAP to convert yard to foot
1 yard = 3 foot
 */
public class Question85 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double yards;
        System.out.print("Enter the length in yards: ");
        yards = scanner.nextDouble();
        double foot = yards * 3;
        System.out.printf("%f yards is %f foot.\n", yards, foot);
    }
}
