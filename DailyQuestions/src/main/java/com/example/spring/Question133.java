package com.example.spring;

import java.util.Scanner;

/* WAP to divide a number by 2 without using division operation */
public class Question133 {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        int num = SCANNER.nextInt();
        int divided = num >> 1;
        System.out.printf("%d divided by 2 is %d\n", num, divided);
    }
}
