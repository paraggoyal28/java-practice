package com.example.spring;

import java.util.Scanner;

/*
WAP to verify whether a triangle's three sides form a right angled triangle or not.
 */
public class Question62 {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static boolean isGivenTriangleRightAngled(int side1, int side2, int side3) {
        return (side1 * side1 + side2 * side2 == side3 * side3) ||
                (side1 * side1 + side3 * side3 == side2 * side2) ||
                (side2 * side2 + side3 * side3 == side1 * side1);
    }
    public static void main(String[] args) {
        System.out.print("Enter the triangle first side: ");
        int side1 = SCANNER.nextInt();
        System.out.println();
        System.out.print("Enter the triangle second side: ");
        int side2 = SCANNER.nextInt();
        System.out.println();
        System.out.print("Enter the triangle third side: ");
        int side3 = SCANNER.nextInt();
        System.out.println();

        // in a right angled triangle c*c =a*a + b*b
        System.out.println("The given triangle is right angled: " + isGivenTriangleRightAngled(side1, side2, side3));
    }
}
