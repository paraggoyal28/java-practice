package com.example.spring;

/*Write a program to remove all whitespaces from a given string.*/


import java.util.Scanner;

public class Question123 {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the given string:");
        String s = SCANNER.nextLine();
        String replaced = s.replaceAll("\\s", "");
        System.out.printf("%s formed after replacing all whitespaces\n", replaced);
    }
}
