package com.example.spring;

import java.util.Scanner;

/* WAP to read three numbers and find average of them */
public class Question138 {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter first number: ");
        int number1 = SCANNER.nextInt();
        System.out.print("Enter second number: ");
        int number2 = SCANNER.nextInt();
        System.out.print("Enter third number: ");
        int number3 = SCANNER.nextInt();

        double avg = (number1 + number2 + number3) / 3.0;
        System.out.printf("Average of the numbers is %.2f\n", avg);
    }
}
