package com.example.spring;

import java.util.Scanner;

/* WAP to check whether a person age is greater than or equal to 60 */
public class Question57 {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the age of the person: ");
        int age = SCANNER.nextInt();
        if (age >= 60) {
            System.out.println("The person is a senior citizen");
        } else {
            System.out.println("The person is not a senior citizen");
        }
    }
}
