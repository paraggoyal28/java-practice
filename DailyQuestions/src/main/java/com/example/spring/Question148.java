package com.example.spring;

import java.util.Scanner;

/* Write a program to count the total number of punctuations in a given string.
 */
public class Question148 {
    public static final Scanner SCANNER = new Scanner(System.in);

    private static boolean isPunctuation(char ch) {
        return (ch == '!' || ch == ',' || ch == '.' || ch == ';' || ch == '-' || ch == ':' ||
        ch == '\"' || ch == '\'' || ch == '?' || ch == '|');
    }

    public static void main(String[] args) {
        String input;
        System.out.print("Enter the input string: ");
        input = SCANNER.nextLine();
        int cnt = 0;
        for (char ch: input.toCharArray()) {
            if (isPunctuation(Character.toLowerCase(ch))) {
                cnt++;
            }
        }
        System.out.printf("The number of punctuations in given string %s is %d", input, cnt);
    }
}
