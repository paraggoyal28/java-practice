package com.example.spring;

import java.util.Scanner;

/*
WAP to take 10 numbers from input and find their sum and average
 */
public class Question120 {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter number of doubles for which we want to find average: ");
        int len = SCANNER.nextInt();
        double sum = 0;
        for (int i = 0; i < len; ++i) {
            System.out.print("Enter the double number: ");
            double num = SCANNER.nextDouble();
            sum += num;
        }
        double average = (double) sum/len;
        System.out.printf("Average of %d double numbers is %f and sum is %f\n", len, average, sum);
    }
}
