package com.example.spring;

/*Write a program to subtract 2 numbers without using subtraction operator.*/

import java.util.Scanner;

public class Question130 {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static int addUsingBits(int num1, int num2) {
        while (num2 != 0) {
            int carry = (num1&num2) << 1;

            num1 = num1 ^ num2;

            num2 = carry;
        }

        return num1;
    }
    public static void main(String[] args) {
        System.out.print("Enter first number: ");
        int number1 = SCANNER.nextInt();
        System.out.print("Enter second number: ");
        int number2 = SCANNER.nextInt();
        int ans = addUsingBits(number1, -number2);
        int ans2 = number1 + ~number2 + 1;
        System.out.printf("Result %d\n", ans);
        System.out.printf("Result %d\n", ans2);
    }
}
