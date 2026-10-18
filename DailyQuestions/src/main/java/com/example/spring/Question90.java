package com.example.spring;

import java.util.Scanner;

/*
WAP to find whether a triangle is valid or not using angles
 */
public class Question90 {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final int TOTAL_ANGLE_SUM = 180;

    public static void main(String[] args) {
        int firstAngle, secondAngle, thirdAngle;
        System.out.print("Enter first angle: ");
        firstAngle = SCANNER.nextInt();
        System.out.print("Enter second angle: ");
        secondAngle = SCANNER.nextInt();
        System.out.print("Enter third angle: ");
        thirdAngle = SCANNER.nextInt();

        if (firstAngle + secondAngle + thirdAngle != TOTAL_ANGLE_SUM) {
            System.out.println("Given triangle is not valid");
        } else {
            System.out.println("Given triangle is valid");
        }

    }
}
