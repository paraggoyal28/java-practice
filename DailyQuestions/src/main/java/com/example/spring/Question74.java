package com.example.spring;

/*
WAP to convert kmph to miles per hour
1 km = 0.6213712 miles
 */


import java.util.Scanner;

public class Question74 {
    private static final double KM_MILES = 0.6213712;
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the speed in km per hour: ");
        double inputSpeed = scanner.nextDouble();
        double convertedSpeed = inputSpeed * KM_MILES;
        System.out.printf("Converted speed: %f\n", convertedSpeed);
    }
}
