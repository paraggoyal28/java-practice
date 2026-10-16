package com.example.spring;

import java.util.Scanner;

/*
WAP to swap two numbers without a third number
 */
public class Question44 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter first number: ");
        int number1 = SCANNER.nextInt();
        System.out.print("Enter second number: ");
        int number2 = SCANNER.nextInt();
        number1 = number1 ^ number2;
        number2 = number1 ^ number2;
        number1 = number1 ^ number2;

        System.out.printf("First number after swap: %d\n", number1);
        System.out.printf("Second number after swap: %d\n", number2);
    }

}
