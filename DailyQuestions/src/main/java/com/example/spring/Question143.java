package com.example.spring;

import java.util.Scanner;

/* Check whether a given character is alphabet, special character, or number */
public class Question143 {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter a character: ");
        char ch;
        while ((ch = SCANNER.nextLine().charAt(0)) != '0') {
            char loweredCh = Character.toLowerCase(ch);

            if (loweredCh >= 'a' && loweredCh <= 'z') {
                System.out.printf("Given character %c is a alphabet\n", ch);
            } else if (loweredCh >= '0' && loweredCh <= '9') {
                System.out.printf("Given character %c is a numeric\n", ch);
            } else {
                System.out.printf("Given character %c is a special character\n", ch);
            }

            System.out.print("Enter a character: ");
        }
    }
}
