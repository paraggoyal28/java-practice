package com.example.spring;

/*
Write a program to print the first 10 numbers starting from one together with their squares and cubes.

 */
public class Question15 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; ++i) {
            System.out.println("Number is: " + i + " and its square is: " + (i * i) + " and its cube is: " + (i * i * i));
        }
    }
}
