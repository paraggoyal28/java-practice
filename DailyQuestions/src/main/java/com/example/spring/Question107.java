package com.example.spring;

import java.util.Scanner;

/*
Write a program to check whether a number entered by the user is power of 2 or not.
 */
public class Question107 {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter the number: ");
        int num = SCANNER.nextInt();
        if (num!=0 && (num&(num-1)) == 0) {
            System.out.printf("%d is a power of 2", num);
        } else {
            System.out.printf("%d is not a power of 2", num);
        }
    }
}
