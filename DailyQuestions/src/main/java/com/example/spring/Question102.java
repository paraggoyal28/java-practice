package com.example.spring;

import java.util.Scanner;

/*
WAP to find the absolute value of a number
 */
public class Question102 {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int num;
        System.out.print("Enter the number: ");
        num = SCANNER.nextInt();

        System.out.printf("The absolute value of |%d| is %d\n", num, Math.abs(num));
    }
}
