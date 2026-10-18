package com.example.spring;

/*
WAP to calculate the sum of given three values.
If all three are equal return 0
If any two are equal return the third
 */

import java.util.Scanner;

public class Question76 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter first number: ");
        float firstNum = scanner.nextFloat();
        System.out.print("Enter second number: ");
        float secondNum = scanner.nextFloat();
        System.out.print("Enter third number: ");
        float thirdNum = scanner.nextFloat();

        if (firstNum == secondNum && firstNum == thirdNum) {
            System.out.printf("Ans: %.2f\n", 0);
        } else if (firstNum == secondNum) {
            System.out.printf("Ans: %.2f\n", thirdNum);
        } else if (secondNum == thirdNum) {
            System.out.printf("Ans: %.2f\n", firstNum);
        } else if (firstNum == thirdNum) {
            System.out.printf("Ans: %.2f\n", secondNum);
        } else {
            System.out.printf("Ans: %.2f\n", firstNum + secondNum + thirdNum);
        }
    }
}
