package com.example.spring;

import java.util.Scanner;

/* Write a program to illustrate .join() method.
 */
public class Question128 {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter a space separated string, which needs to be splitted");
        String str = SCANNER.nextLine();
        String[] words = str.split(" ");
        String combinedString = String.join(",", words);
        System.out.printf("Combined String %s\n", combinedString);
    }
}
