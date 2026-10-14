package com.example.spring;

/*
WAP to program to calculate the value of x where x = 1 + 1/2 + 1/3 + ...  + 1/50

 */
public class Question39 {
    public static void main(String[] args) {
        double ans = 0;

        for (int i = 1; i <= 50; ++i) {
            ans += 1.0/i;
        }
        System.out.println("Sum of reciprocals from 1 to 50 is: " + ans);
    }
}
