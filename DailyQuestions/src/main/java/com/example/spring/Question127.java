package com.example.spring;

import java.util.Scanner;

/* Write a program to check if the given string is empty or not.
 */
public class Question127 {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter a given string");
        String s = SCANNER.nextLine();
        System.out.println("Given string  is empty: "+ s.isEmpty());
    }
}
