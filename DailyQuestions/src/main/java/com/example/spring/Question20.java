package com.example.spring;

/*
WAP to check the equivalence of two numbers entered by the user
 */

import java.util.Scanner;

public class Question20 {
    private final static Scanner SYS_IN = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter first number: ");
        double firstNumber = SYS_IN.nextDouble();
        System.out.print("Enter second number: ");
        double secondNumber = SYS_IN.nextDouble();
        if (firstNumber == secondNumber) {
            System.out.println("Entered numbers are equal");
        } else {
            System.out.println("Entered numbers are not equal");
        }
    }
}
