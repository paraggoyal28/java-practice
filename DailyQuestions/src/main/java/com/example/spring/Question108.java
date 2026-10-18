package com.example.spring;

import java.util.Scanner;

/*
WAP to find whether the given triangle is isosceles, scalene or equilateral
 */
public class Question108 {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the sides of the triangle: ");
        System.out.print("Enter first side: ");
        int firstSide = SCANNER.nextInt();
        System.out.print("Enter the second side: ");
        int secondSide = SCANNER.nextInt();
        System.out.print("Enter the third side: ");
        int thirdSide = SCANNER.nextInt();
        if (firstSide == secondSide && firstSide == thirdSide) {
            System.out.println("Given triangle is an equilateral triangle");
        } else if (firstSide == secondSide || secondSide == thirdSide || firstSide == thirdSide) {
            System.out.println("Given triangle is an isosceles triangle");
        } else {
            System.out.println("Given triangle is a scalene triangle");
        }
    }
}
