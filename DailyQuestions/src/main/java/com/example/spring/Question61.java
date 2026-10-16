package com.example.spring;

import java.util.Scanner;

/*
WAP to print the sequence from 1 to a given number, insert + between the numbers in the sequence
when output the final number don't add +
 */
public class Question61 {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        int x, i;
        System.out.print("Enter the end of the sequence: ");
        x = SCANNER.nextInt();
        System.out.println("The sequence is: ");
        if (x > 0) {
            for (i = 1; i < x; ++i) {
                System.out.print(i + " + ");
            }
            System.out.println(x);
        }
    }
}
