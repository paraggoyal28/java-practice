package com.example.spring;

import java.util.Scanner;

/*
Add two numbers without addition operation
 */
public class Question131 {
    private static Scanner SCANNER = new Scanner(System.in);
    private static int add(int num1, int num2) {
        if (num2 == 0) return num1;
        return add(num1^num2, (num1&num2)<<1);
    }
    public static void main(String[] args) {
        System.out.print("Enter first number: ");
        int num1 = SCANNER.nextInt();
        System.out.print("Enter second number: ");
        int num2 = SCANNER.nextInt();
        int res = add(num1, num2);
        int res2 = num1 - ~num2 - 1;
        System.out.printf("Result is: %d\n", res);
        System.out.printf("Result of sum is: %d\n", res2);

    }
}
