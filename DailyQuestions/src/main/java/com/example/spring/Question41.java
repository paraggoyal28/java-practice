package com.example.spring;

/*
Find all incremented and decremented values of two numbers
 */

import java.util.Scanner;

public class Question41 {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter first number: ");
        int numberOne = SCANNER.nextInt();
        System.out.print("Enter second number: ");
        int numberTwo = SCANNER.nextInt();

        int incrementedOne = numberOne + 1;
        int decrementedOne = numberOne - 1;
        int incrementedTwo = numberTwo + 1;
        int decrementedTwo = numberTwo - 1;

        System.out.println("Incremented number One: " + incrementedOne);
        System.out.println("Decremented number One: " + decrementedOne);
        System.out.println("Incremented number Two: " + incrementedTwo);
        System.out.println("Decremented number Two: " + decrementedTwo);
    }
}
