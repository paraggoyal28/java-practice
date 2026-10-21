package com.example.spring;

import java.util.Scanner;

/* WAP to replace spaces of a string with a specific character */
public class Question147 {
    private final static Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the string: ");
        String str = SCANNER.nextLine();
        String replacedStr = str.replace(" ", "$");
        System.out.printf("Replaced String %s\n", replacedStr);
    }
}
