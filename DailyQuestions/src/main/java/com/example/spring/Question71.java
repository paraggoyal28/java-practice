package com.example.spring;

/*
WAP to determine if a non-negative number is a multiple of 12 or 1 more than a multiple of 12
 */

import java.util.Scanner;

public class Question71 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter a non-negative number: ");
        int num = scanner.nextInt();

        if (Math.abs(num%12) <= 1) {
            System.out.printf("The given number %d is either a multiple of 12 or leaves remainder 1 when " +
                    "divided by 12\n", num);
        } else {
            System.out.printf("Given number %d leaves more than 1 as a remainder when divided by 12\n", num);
        }
    }
}
