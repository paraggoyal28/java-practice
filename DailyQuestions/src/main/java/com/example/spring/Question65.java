package com.example.spring;

import java.util.Scanner;

/*
WAP that accepts minutes as input, and display the total number of hours and minutes.
*/
public class Question65 {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the time in minutes: ");
        int minutes = SCANNER.nextInt();
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        System.out.printf("Given minutes %d is %d hours and %d minutes.", minutes, hours, remainingMinutes);
    }
}
