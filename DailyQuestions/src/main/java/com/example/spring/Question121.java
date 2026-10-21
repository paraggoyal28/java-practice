package com.example.spring;

import java.util.Scanner;

/*
Write a program to determine whether the given character is an alphanumeric character or not.
 */
public class Question121 {

    private static boolean isAlpha(char ch) {
        return (ch >= 'a' && ch <= 'z');
    }

    private static boolean isNumeric(char ch) {
        return (ch >= '0' && ch <= '9');
    }

    private static boolean isAlphaNumeric(char ch) {
        return isAlpha(Character.toLowerCase(ch)) || isNumeric(ch);
    }

    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the character: ");
        char ch = SCANNER.next().charAt(0);
        if (isAlphaNumeric(ch)) {
            System.out.printf("Given %c is alphanumeric\n", ch);
        } else {
            System.out.printf("Given %c is not alphanumeric\n", ch);
        }
    }
}
