package com.example.spring;

/*
WAP to sum all numbers from 1 to 100 not divisible by 12

 */
public class Question38 {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 1; i <= 100; ++i) {
            if (i%12 != 0) {
                sum += i;
            }
        }
        System.out.println("Sum of all numbers from 1 to 100 not divisible by 12: " + sum);
    }
}
