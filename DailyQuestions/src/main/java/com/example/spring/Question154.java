package com.example.spring;

import java.util.Scanner;

/* WAP to invert the triangle */
public class Question154 {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the rows: ");
        int rows = SCANNER.nextInt();
        while (rows > 0) {
            for (int i = 1; i <= rows; ++i) {
                System.out.print(i + " ");
            }
            System.out.println();
            rows--;
        }
    }
}
