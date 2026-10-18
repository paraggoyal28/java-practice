package com.example.spring;

import java.util.Scanner;

/*
WAP to compare two strings
 */
public class Question97 {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        String str1, str2;
        System.out.print("Enter first string: ");
        str1 = SCANNER.nextLine();
        System.out.print("Enter second string: ");
        str2 = SCANNER.nextLine();
        if (str1.compareToIgnoreCase(str2) > 0) {
            System.out.printf("%s is greater than %s\n", str1, str2);
        } else if (str1.compareToIgnoreCase(str2) < 0){
            System.out.printf("%s is greater than %s\n", str2, str1);
        } else {
            System.out.printf("%s is equal to %s\n", str1, str2);
        }
    }
}
