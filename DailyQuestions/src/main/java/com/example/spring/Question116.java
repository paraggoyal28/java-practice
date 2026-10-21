package com.example.spring;

/*
Write a program to determine the number and sum of all integers between 50 and 100 which are divisible by 2.
 */
public class Question116 {
    public static void main(String[] args) {
        int evenNo = 0, sumEvenNo = 0;
        for (int i = 50; i <= 100; ++i) {
            if (i%2 == 0) {
                evenNo += 1;
                sumEvenNo += i;
            }
        }
        System.out.println("Number of even numbers between 50 and 100 are: " + evenNo);
        System.out.println("Sum of even numbers between 50 and 100 is: " + sumEvenNo);
    }
}
