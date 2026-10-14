package com.example.spring;

import java.util.Scanner;

/*
WAP to convert a lowercase string to uppercase string
 */
public class Question26 {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the string in lowercase: ");
        String input = SCANNER.nextLine();
        String output = input.toUpperCase();
        System.out.println("Input String: " + input);
        System.out.println("Output String: " + output);
    }
}
