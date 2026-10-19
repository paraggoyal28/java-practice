package com.example.spring;

import java.util.Scanner;
/*
WAP that accepts 
an integer (x) and computes the value of x+xx+xxx.
 */

public class Question112 {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the value of x: ");
        int x = SCANNER.nextInt();
        int sum = x + x * 10 + x + x * 100 + x * 10 + x;
        System.out.printf("value of x + xx + xxx when x = %d is %d\n", x, sum);
    }
}
