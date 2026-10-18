package com.example.spring;

import java.util.Scanner;

/*
WAP to check whether the given input character is y or not
 */
public class Question105 {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        char ch;
        System.out.print("Enter the character: ");
        ch = SCANNER.next().charAt(0);
        if (ch == 'Y' || ch == 'y') {
            System.out.println("Given character is y");
        } else {
            System.out.println("Given character is other than y");
        }
    }
}
