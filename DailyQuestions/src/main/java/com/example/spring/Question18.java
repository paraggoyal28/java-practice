package com.example.spring;

/*
WAP to print the product of first 10 digits
 */
public class Question18 {
    public static void main(String[] args) {
        double ans = 1;

        for (int i = 1; i <= 10; ++i) {
            ans *= i;
        }

        System.out.printf("Product of first 10 digits: %.2f\n", ans);
    }
}
