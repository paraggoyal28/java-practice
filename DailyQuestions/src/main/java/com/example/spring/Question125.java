package com.example.spring;

import java.util.Scanner;

/*Write a program to split a sentence into words.
 */
public class Question125 {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter a sentence");
        String sentence = SCANNER.nextLine();
        String[] words = sentence.split(" ", 3);
        System.out.println(String.join(",", words));
    }
}
