package com.example.spring;

/*
Write a program to print all even numbers from 1 to 25
 */
public class Question13 {
    public static void main(String[] args) {
        for (int i = 1; i < 25; ++i) {
            if (i%2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
