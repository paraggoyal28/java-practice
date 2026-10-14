package com.example.spring;

import java.io.IOException;
import java.util.Scanner;

/*
WAP to check whether a character is an alphabet or not
 */
public class Question31 {
    private final static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        System.out.print("Enter a character: ");
        char ch = SCANNER.nextLine().charAt(0);

        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println("Character is an alphabet");
        } else {
            System.out.println("Character is not an alphabet");
        }
    }
}
