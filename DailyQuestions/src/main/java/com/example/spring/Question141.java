package com.example.spring;

import java.util.Scanner;

/* WAP to check if given  string ends with a certain string */
public class Question141 {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the base string: ");
        String baseString = SCANNER.nextLine();
        System.out.print("To be checked string: ");
        String toCheckString = SCANNER.nextLine();
        System.out.printf("%s ends with %s: %b\n", baseString, toCheckString, baseString.endsWith(toCheckString));
    }
}
