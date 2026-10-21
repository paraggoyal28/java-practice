package com.example.spring;

import java.util.Scanner;

/*
Write a program that display the pattern like a right angle triangle using a number.

 */
public class Question115 {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the base of the right angled triangle");
        int base = SCANNER.nextInt();
        for (int x = 1; x <= base; ++x) {
            for (int y = 1; y <= x; ++y) {
                System.out.print(y);
            }
            System.out.println();
        }
    }
}
