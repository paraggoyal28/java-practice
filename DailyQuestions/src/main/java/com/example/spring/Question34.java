package com.example.spring;

import java.util.Scanner;

/*
WAP that will print all numbers from 1 to 50 which when divided by specified number gives remainder 2

 */
public class Question34 {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the specified number: ");
        int num = SCANNER.nextInt();
        for (int i = 1; i <= 50; ++i) {
            if (i%num == 2) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
