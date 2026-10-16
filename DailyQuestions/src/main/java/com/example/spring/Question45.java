package com.example.spring;

import java.util.Scanner;

/* Find the area of a regular hexagon with a given side */
public class Question45 {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the side of a regular hexagon: ");
        int side = SCANNER.nextInt();
        double area = (6*(side * side) * Math.sqrt(3))/4;
        System.out.printf("Area of the hexagon is: %.2f\n", area);
    }
}
