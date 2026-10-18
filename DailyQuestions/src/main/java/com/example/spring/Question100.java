package com.example.spring;

/*
WAP to determine the Size of int, float, double and char.
 */

import java.util.Scanner;

public class Question100 {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println ("Size of int is " + (Integer.SIZE/8) + " bytes.");
        System.out.println ("Size of char is " + (Character.SIZE/8) + " bytes.");
        System.out.println ("Size of float is " + (Float.SIZE/8) + " bytes.");
        System.out.println ("Size of double is " + (Double.SIZE/8) + " bytes.");
    }
}
