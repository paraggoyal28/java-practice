package com.example.spring;

import java.util.Scanner;

/* Write a program to replace all occurrences of 'a' to 'e' in a string.
 */
public class Question126 {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter a string");
        String input = SCANNER.nextLine();
        String replaced = input.replaceFirst("[a-zA-Z]", "e");
        String replacedAll = input.replaceAll("[a-zA-Z]", "e");

        System.out.printf("Replaced string: %s and replaced all string %s\n", replaced, replacedAll);
    }
}
