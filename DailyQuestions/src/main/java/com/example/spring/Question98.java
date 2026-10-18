package com.example.spring;

/*
WAP to convert an UPPERCASE string to LOWERCASE string
 */

import java.util.Scanner;

public class Question98 {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        String input;
        System.out.print("Enter the given string in uppercase: ");
        input = SCANNER.nextLine();
        String lowercased = input.toLowerCase();
        System.out.printf("Given string %s in lowercase is %s\n", input, lowercased);
    }
}
