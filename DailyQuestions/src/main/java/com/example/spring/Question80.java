package com.example.spring;

import java.util.Scanner;

/*
WAP to count the number of odd elements in an integer array
 */
public class Question80 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the length of the input array: ");
        int len = scanner.nextInt();

        int oddNums = 0;
        System.out.println("Enter each element: ");
        for (int i = 0; i < len; ++i) {
            int num = scanner.nextInt();
            if (num%2 == 1) {
                oddNums += 1;
            }
        }

        System.out.printf("The number of odd elements in the given input are: %d\n", oddNums);
    }
}
