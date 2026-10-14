package com.example.spring;

import java.util.Scanner;

/*
WAP to print the ascii value of a given character

 */
public class Question33 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter a character: ");
        char ch = scanner.nextLine().charAt(0);
        System.out.println("ASCII value of given character " + ch + " is: " + (int)ch);
    }
}
