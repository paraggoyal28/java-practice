package com.example.spring;

/*
problem: Write a program that accepts two numbers from the input and calculate the product of two numbers
author: parag kumar goyal
 */


import java.util.Scanner;

public class Question5 {


    public static void main(String[] args) {

        try (Scanner STDIN = new Scanner(System.in)) {
            System.out.println("Enter first number: ");
            double firstNum = STDIN.nextDouble();

            System.out.println("Enter second number: ");
            double secondNum = STDIN.nextDouble();

            double result = firstNum * secondNum;

            System.out.printf("Product: %-10.2f\n", result);
        }
    }
}
