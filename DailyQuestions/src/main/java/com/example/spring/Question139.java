package com.example.spring;

import java.util.Scanner;

/*
Write a program to read integer "n" and print first three powers (n1, n2, n3).
 */
public class Question139 {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        int num = SCANNER.nextInt();

        double powerRaisedToOne = num;
        double powerRaisedToTwo = num * num;
        double powerRaisedToThree = num * num * num;
        System.out.printf("%d raised to power 1 is %.2f\n", num, powerRaisedToOne);
        System.out.printf("%d raised to power 2 is %.2f\n", num, powerRaisedToTwo);
        System.out.printf("%d raised to power 3 is %.2f\n", num, powerRaisedToThree);

    }
}
