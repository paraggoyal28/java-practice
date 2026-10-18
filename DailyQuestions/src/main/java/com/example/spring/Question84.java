package com.example.spring;

import java.util.Scanner;

/*
Write a program that reads the candidate's age and determine a candidate's eligibility to cast his own vote.
 */
public class Question84 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the candidate's age: ");
        int age = scanner.nextInt();

        if (age < 18) {
            System.out.println("The candidate is currently not eligible to vote.");
            System.out.println("After " + (18 - age) + " the candidate will be eligible to vote.");
        } else {
            System.out.println("The candidate is eligible to vote");
        }
    }
}
