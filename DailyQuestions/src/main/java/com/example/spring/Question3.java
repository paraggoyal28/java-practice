package com.example.spring;

/*
problem: Write a program to compute the perimeter and area of a circle.
author: parag kumar goyal

 */

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        double areaOfCircle = Math.PI * radius * radius;
        double perimeterOfCircle = 2 * Math.PI * radius;

        System.out.printf("Area of the circle: %-10.2f\n", areaOfCircle);
        System.out.printf("Perimeter of the circle: %-10.2f\n", perimeterOfCircle);
        scanner.close();
    }
}
