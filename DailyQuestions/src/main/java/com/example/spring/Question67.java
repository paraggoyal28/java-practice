package com.example.spring;

import java.util.Scanner;

/*
WAP to verify whether one of the two entered integers falls within the range of 100 to 200 included.
 */
public class Question67 {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter first number: ");
        int num1 = SCANNER.nextInt();
        System.out.print("Enter second number: ");
        int num2 = SCANNER.nextInt();
        if (num1 >= 100 && num1 <= 200) {
            System.out.printf("Given number %d falls between 100 and 200 inclusive", num1);
        }
        else if (num2 >= 100 && num2 <= 200) {
            System.out.printf("Given number %d falls between 100 and 200 inclusive", num2);
        }
        else {
            System.out.print("None of Given numbers falls between 100 and 200 inclusive");
        }
        System.out.println();
    }
}
