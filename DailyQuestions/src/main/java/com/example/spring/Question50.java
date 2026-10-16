package com.example.spring;

import java.util.Scanner;

/*
WAP to shift input data by two bits to the right
 */
public class Question50 {
    private static final Scanner STDIN_SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the input data: ");
        int number = STDIN_SCANNER.nextInt();
        System.out.println("The input data is: " + number);
        System.out.println("The input data shifted by two bits to the right: " + (number >>= 2));
    }
}
