package com.example.spring;

import java.util.Scanner;

/* WAP to calculate volume of a sphere */
public class Question134 {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the radius of a sphere");
        double radius = SCANNER.nextDouble();
        double volume = (4 * Math.PI * radius * radius * radius)/3.0;
        System.out.printf("The volume of sphere with radius %.2f is %.2f\n", radius, volume);
    }
}
