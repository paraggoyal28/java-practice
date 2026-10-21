package com.example.spring;

import java.util.Scanner;

/* Write a program for a simple calculator */
public class Question155 {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        char op;
        double num1, num2;
        double res;
        System.out.print("Enter the operator: ");
        op = SCANNER.next().charAt(0);

        System.out.print("Enter the first number: ");
        num1 = SCANNER.nextDouble();

        System.out.print("Enter the second number: ");
        num2 = SCANNER.nextDouble();

        switch(op) {
            case '+': res = num1 + num2;
            System.out.printf("Addition of %f and %f is %f\n", num1, num2, res);
            break;
            case '-': res = num1 - num2;
            System.out.printf("Subtraction of %f and %f is %f\n", num1, num2, res);
            break;
            case '*': res = num1 * num2;
            System.out.printf("Multiplication of %f and %f is %f\n", num1, num2, res);
            break;
            case '/': res = num1 / num2;
            System.out.printf("Division of %f and %f is %f\n", num1, num2, res);
            break;
            default: System.out.println("Invalid Operation");
        }
    }
}
