package com.example.spring;

import java.util.Scanner;

/*
Print multiplication table of a number entered by a user
 */
public class Question17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scanner.nextInt();
        for (int i = 1; i <= 10; ++i) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
        scanner.close();
    }
}
