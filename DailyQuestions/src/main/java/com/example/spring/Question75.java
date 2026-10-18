package com.example.spring;

import java.util.Scanner;

/* WAP to calculate the area of an ellipse */
/* Area of an ellipse = PI * semi-major axis length * semi-minor axis length
*/
public class Question75 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the length of semi major axis: ");
        int semiMajorAxisLength = scanner.nextInt();
        System.out.print("Enter the length of semi-minor axis: ");
        int semiMinorAxisLength = scanner.nextInt();

        double area = Math.PI * semiMajorAxisLength * semiMinorAxisLength;
        System.out.printf("The area of the given ellipse: %.4f\n", area);
    }
}
