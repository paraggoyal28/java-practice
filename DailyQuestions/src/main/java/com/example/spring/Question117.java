package com.example.spring;

import java.util.Scanner;

/*
WAP to check whether a given number is even or odd
 */
public class Question117 {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        int num = SCANNER.nextInt();
        if ((num&1) != 0) {
            System.out.printf("%d is odd\n", num);
        } else {
            System.out.printf("%d is even\n", num);
        }
    }
}
