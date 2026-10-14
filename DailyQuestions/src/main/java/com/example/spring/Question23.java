package com.example.spring;

import java.util.Scanner;

/*
WAP to print the length of the entered string
 */
public class Question23 {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the string: ");
        String input = SCANNER.next();
        System.out.println("The length of the string entered " + input + " is: " + input.length());
    }
}
