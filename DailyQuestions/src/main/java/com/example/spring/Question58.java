package com.example.spring;

import java.util.Scanner;

/*
WAP to take input three subject scores of a student and print the average of those scores
 */
public class Question58 {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the score in first subject: ");
        int score1 = SCANNER.nextInt();
        System.out.print("Enter the score in second subject: ");
        int score2 = SCANNER.nextInt();
        System.out.print("Enter the score in third subject: ");
        int score3 = SCANNER.nextInt();
        double averageScore = (score1 + score2 + score3)/3.0;
        System.out.printf("The average of the scores of the student: %.2f\n", averageScore);
    }
}
