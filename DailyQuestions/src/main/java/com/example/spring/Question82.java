package com.example.spring;

/*
WAP to find the third angle of a triangle if two are given
 */

import java.util.Scanner;

public class Question82 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the first angle of the triangle: ");
        int firstAngle = scanner.nextInt();
        System.out.print("Enter the second angle of the triangle: ");
        int secondAngle = scanner.nextInt();
        int thirdAngle = 180 - firstAngle - secondAngle;
        System.out.printf("The third angle of the triangle is: %d\n", thirdAngle);
    }
}
