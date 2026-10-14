package com.example.spring;

import java.util.Scanner;

/*
WAP that takes a distance in centimeters and returns the corresponding distance in inches

 */
public class Question27 {
    private final static Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the distance in centimeters: ");
        double distanceCentimeters = SCANNER.nextDouble();
        double distanceInches = distanceCentimeters/2.54;
        System.out.printf("Distance in inches %.2f\n", distanceInches);
    }
}
