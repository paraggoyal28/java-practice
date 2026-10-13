package com.example.spring;

import java.util.Scanner;

/*
WAP to find the average of the elements in an array
 */
public class Question11 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the number of elements we want to find the average of: ");
            int len = scanner.nextInt();

            double sum = 0;

            for (int i = 0; i < len; ++i) {
                System.out.println("Enter number: ");
                sum += scanner.nextDouble();
            }

            System.out.printf("The average of the values is: %-10.2f\n", (sum/len));
        }
    }
}
