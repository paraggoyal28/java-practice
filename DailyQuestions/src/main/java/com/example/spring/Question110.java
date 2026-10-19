package com.example.spring;

import java.util.Scanner;
/*
WAP to find the sum of even numbers from 1 to n
*/

public class Question110 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the value of n: ");
        int n = scanner.nextInt();
        long sum = 0;
        for (int i = 2; i <= n; i += 2) {
            sum += i;
        }
        System.out.printf("Sum of even numbers from 1 to %d is %d\n", n, sum);
    }
}
