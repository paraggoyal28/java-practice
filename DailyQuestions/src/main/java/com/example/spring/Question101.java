package com.example.spring;

import java.util.Scanner;

/*
WAP to check for 4 times for user password
if incorrect even after the 4th time give an error stating Attempt exceeded
 */
public class Question101 {
    public static final Scanner SCANNER = new Scanner(System.in);
    public static final String ACTUAL_PASSWORD = "myPass";
    public static void main(String[] args) {
        String password;
        System.out.print("Enter your password: ");
        password = SCANNER.nextLine();
        int attempts = 1;
        while (attempts < 4 && !(ACTUAL_PASSWORD.equals(password))) {
            System.out.println("Entered password is incorrect. Try again!");
            attempts++;
            System.out.print("Enter your password: ");
            password = SCANNER.nextLine();
        }

        if (attempts == 4) {
            System.out.println("Access Denied. Account Locked.");
        } else {
            System.out.println("Welcome to Dashboard!");
        }
    }
}
