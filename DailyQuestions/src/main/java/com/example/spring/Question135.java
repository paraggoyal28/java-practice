package com.example.spring;

import java.util.Scanner;

/* WAP to calculate volume of an ellipsoid */
public class Question135 {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the length of one axis: ");
        int x = SCANNER.nextInt();
        System.out.print("Enter the length of second axis: ");
        int y = SCANNER.nextInt();
        System.out.print("Enter the length of third axis: ");
        int z = SCANNER.nextInt();

        double volume = (4.0 * Math.PI * x * y * z)/(24);
        System.out.printf("Volume of ellipsoid is %.2f\n", volume);
    }
}
