package com.example.spring;

/*
WAP to concatenate multiple strings
 */

import java.util.Scanner;

public class Question95 {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        String str;
        StringBuilder res = new StringBuilder();
        System.out.println("Enter the strings. Enter exit to stop");
        while (!((str = SCANNER.nextLine()).equalsIgnoreCase("exit"))) {
            res.append(str);
        }

        System.out.printf("Concatenated string: %s\n", res);
    }
}
