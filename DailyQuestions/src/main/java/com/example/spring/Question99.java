package com.example.spring;

/*
WAP to find the quotient and remainder of a given dividend and divisor
 */

import java.util.Scanner;

public class Question99 {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        int dividend, divisor;
        System.out.print("Enter the dividend: ");
        dividend = SCANNER.nextInt();
        System.out.print("Enter the divisor: ");
        divisor = SCANNER.nextInt();
        int quotient = dividend/divisor;
        int remainder = dividend%divisor;
        System.out.printf("The quotient of %d when divided by %d is %d\n", dividend, divisor, quotient);
        System.out.printf("The remainder of %d when divided by %d is %d\n", dividend, divisor, remainder);
    }
}
