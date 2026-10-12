package com.example.spring;

import java.util.Scanner;
/*
Write a program to compute the perimeter and area of a rectangle.
author: parag kumar goyal
 */

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of rectangle: ");
        long length = scanner.nextLong();
        System.out.print("Enter the width of rectangle: ");
        long width = scanner.nextLong();

        System.out.print("The area of the rectangle: ");
        long area = length * width;
        System.out.println(area);
        System.out.print("The perimeter of the rectangle: ");
        long perimeter = 2 * (length + width);
        System.out.println(perimeter);
    }
}
