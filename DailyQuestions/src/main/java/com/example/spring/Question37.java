package com.example.spring;

import java.util.Scanner;

/*
WAP to print all numbers from 1 to 50 which when divided by 1 to 50 leaves a remainder 2 or 3
 */
public class Question37 {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the number by which to divide: ");
        int inputNum = SCANNER.nextInt();
        for (int i = 1; i <= 50; ++i) {
            if (i%inputNum == 2 || i%inputNum == 3) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
