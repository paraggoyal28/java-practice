package com.example.spring;

import java.util.Scanner;

/*
WAP that checks whether the two given numbers are in ascending or descending order
 */
public class Question35 {
    public static void main(String[] args) {
        System.out.println("Enter the first number: ");
        int firstNumber = SCANNER.nextInt();
        System.out.println("Enter the second number: ");
        int secondNumber = SCANNER.nextInt();
        if (firstNumber < secondNumber) {
            System.out.println("The given numbers are in ascending order");
        } else {
            System.out.println("The given numbers are in descending order");
        }
    }
    private static final Scanner SCANNER = new Scanner(System.in);
}
