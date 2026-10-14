package com.example.spring;

/*
Write a program that prints all odd numbers between 1 and 50.
 */

public class Question14 {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if (i%2 == 1) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
