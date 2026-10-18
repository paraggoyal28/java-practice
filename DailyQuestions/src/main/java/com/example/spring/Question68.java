package com.example.spring;

/*
WAP to determine which of the two integers is closest to 100 and if both are equal return 0
 */


import java.util.Scanner;

public class Question68 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter one number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        if (num1 == num2) {
            System.out.println("Given numbers are equal: " + 0);
            return;
        }

        int diff1 = Math.abs(num1 - 100);
        int diff2 = Math.abs(num2 - 100);

        if (diff1 < diff2) {
            System.out.printf("%d is closer to 100 than %d\n", num1, num2);
        } else {
            System.out.printf("%d is closer to 100 than %d\n", num2, num1);
        }
    }
}
