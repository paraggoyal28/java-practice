package com.example.spring;

import java.util.Scanner;

/*
WAP to check whether the entered character is a vowel or a consonant
 */
public class Question92 {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static boolean isVowel(char ch) {
        return ((ch == 'a') || (ch == 'e') || (ch == 'i') ||
                (ch == 'o') || (ch == 'u'));
    }

    public static void main(String[] args) {
        char ch;
        System.out.print("Enter the character: ");
        ch = SCANNER.next().charAt(0);
        char loweredCh = Character.toLowerCase(ch);

        if (isVowel(loweredCh)) {
            System.out.printf("Given character %c is a vowel\n", ch);
        } else {
            System.out.printf("Given character %c is a consonant\n", ch);
        }
    }
}
