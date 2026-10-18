package com.example.spring;

import java.util.Scanner;

/*
WAP to count the number of even elements in an integer array
 */
public class Question79 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the length of the input array: ");
        int len = scanner.nextInt();
        int evenNums = 0;
        System.out.print("Enter each input integer value: ");
        for (int i = 0; i < len; ++i) {
            int num = scanner.nextInt();
            if (num%2 == 0) {
                evenNums += 1;
            }
        }

        System.out.printf("The number of even numbers in the input array is %d\n", evenNums);
    }
}
