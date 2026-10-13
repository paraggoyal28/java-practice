package com.example.spring;

/*
WAP to print all even numbers from 1 to 25

 */

public class Question12 {
    public static void main(String[] args) {
        System.out.println("Even numbers between 1 and 25 are: ");
        for (int i = 1; i <= 25; ++i) {
            if (i%2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
