package com.example.spring;

import java.util.Scanner;

/*
Write a program to calculate the area of different geometric shapes using switch statements.
 */
public class Question104 {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        double r, l, w, h, b, area;
        System.out.println("Enter 1 to find the area of a circle");
        System.out.println("Enter 2 to find the area of a rectangle");
        System.out.println("Enter 3 to find the area of a triangle");
        System.out.println("Enter 0 to exit or 1, 2, 3");
        int choice;
        while ((choice = SCANNER.nextInt()) != 0) {
            switch(choice) {
                case 1:
                    System.out.print("Enter the radius of the circle: ");
                    r = SCANNER.nextDouble();
                    area = Math.PI * r * r;
                    System.out.printf("Area of the circle: %.2f\n", area);
                    break;
                case 2:
                    System.out.print("Enter the length of the rectangle: ");
                    l = SCANNER.nextDouble();
                    System.out.print("Enter the width of the rectangle: ");
                    w = SCANNER.nextDouble();
                    area = l * w;
                    System.out.printf("Area of the rectangle: %.2f\n", area);
                    break;
                case 3:
                    System.out.print("Enter the base of the triangle: ");
                    b = SCANNER.nextDouble();
                    System.out.print("Enter the height of the triangle: ");
                    h = SCANNER.nextDouble();
                    area = ((h * b)/2.0);
                    System.out.printf("Area of the triangle: %.2f\n", area);
                    break;
            }
            System.out.println("Press 0 to exit or any number from 1, 2, 3");
        }
    }
}
