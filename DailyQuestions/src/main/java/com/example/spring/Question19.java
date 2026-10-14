package com.example.spring;

import java.util.Scanner;

/*
WAP to print whether a number is positive or negative
 */
public class Question19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");

        int num = scanner.nextInt();

        if (num > 0) {
            System.out.println("Entered number " + num + " is positive");
        } else {
            System.out.println("Entered number " + num + " is negative");
        }
    }
}
