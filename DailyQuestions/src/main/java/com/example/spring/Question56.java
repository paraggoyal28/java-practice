package com.example.spring;

import java.util.Scanner;

/*
WAP to count even, odd, positive, negative values from given set of 18 values
*/
public class Question56 {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter 18 values: ");
        int[] num = new int[18];
        int even = 0, odd = 0, positive = 0, negative = 0;
        for (int i = 0; i < 18; ++i) {
            num[i] = SCANNER.nextInt();
            if (num[i] > 0) {
                positive++;
            } else {
                negative++;
            }
            if (num[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Total positive numbers: " + positive);
        System.out.println("Total negative numbers: " + negative);
        System.out.println("Total even numbers: " + even);
        System.out.println("Total odd numbers: " + odd);

    }
}
