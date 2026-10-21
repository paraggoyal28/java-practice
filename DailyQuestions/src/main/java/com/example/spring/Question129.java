package com.example.spring;

/*Write a program to calculate surface area of cube.*/

import java.util.Scanner;
public class Question129 {
     private static final Scanner SCANNER = new Scanner(System.in);
     public static void main(String[] args) {
         System.out.println("Enter the length of a cube side:");
         int side = SCANNER.nextInt();
         double totalSurfaceArea = 6 * side * side;
         double fourWallSurfaceArea = 4 * side * side;
         System.out.printf("Total Surface area: %.2f\n", totalSurfaceArea);
         System.out.printf("Wall Surface area: %.2f\n", fourWallSurfaceArea);
     }
}
