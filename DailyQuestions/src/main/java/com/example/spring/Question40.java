package com.example.spring;

import java.util.Scanner;

/*
WAP that reads a number and finds all its divisors
 */
public class Question40 {
    private final static Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the given number: ");
        int num = SCANNER.nextInt();
        for (int i = 1; i * i <= num; ++i) {
            if (num%i == 0) {
                System.out.print(i + " ");
                if (i * i != num) {
                    System.out.print(num / i + " ");
                }
            }
        }
        System.out.println();
    }
}
