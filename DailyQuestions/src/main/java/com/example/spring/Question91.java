package com.example.spring;

/*
WAP to find the sum of the digits of user entered two digit number
 */

import java.util.Scanner;

public class Question91 {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        int num;
        System.out.print("Enter a two digit number: ");
        num = SCANNER.nextInt();

        int temp = num;
        int sum = 0;
        while (temp > 0) {
            sum += temp%10;
            temp /= 10;
        }
        System.out.printf("The sum of digits of %d is %d\n", num, sum);
    }
}
