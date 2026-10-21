package com.example.spring;

import java.util.Scanner;

/* WAP to check if a string starts with a given prefix */
public class Question142 {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the given string: ");
        String base = SCANNER.nextLine();
        System.out.print("Enter the pattern string: ");
        String prefix = SCANNER.nextLine();
        System.out.printf("Given string %s starts with %s: %b\n", base, prefix, base.startsWith(prefix));
    }
}
