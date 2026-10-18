package com.example.spring;

/*
WAP to check whether sum of two numbers is equal to the third number from the given three numbers
 */


import java.util.Scanner;

public class Question73 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String args[]) {
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();
        if (num1 + num2 == num3 || num1 + num3 == num2 || num2 + num3 == num1) {
            System.out.println("The sum of two numbers is equal to the third number");
        } else {
            System.out.println("No sum of the given numbers is equal to the third number");
        }
    }
}
