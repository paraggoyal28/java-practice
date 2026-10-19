package com.example.spring;

import java.util.Scanner;

/*
WAP to find sum of odd numbers from 1 to n
*/

public class Question111 {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the value of n:");
        int n = SCANNER.nextInt();
        long sum = 0;
        for (int i = 1; i <= n; i += 2) {
            sum += i;
        }
        System.out.printf("Sum of odd numbers from 1 to %d: %d\n", n, sum);
    }
}
