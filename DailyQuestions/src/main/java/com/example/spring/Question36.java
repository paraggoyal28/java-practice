package com.example.spring;

import java.util.Scanner;

/*
WAP that divides one number by other. If not possible, specify Division not possible
 */
public class Question36 {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter first number: ");
        int firstNumber = SCANNER.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = SCANNER.nextInt();

        try {
            int ans = firstNumber / secondNumber;
            System.out.println("Result of division: " + ans);
        } catch (ArithmeticException e) {
            System.out.println("Division not possible");
        }
    }
}
