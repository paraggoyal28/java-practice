package com.example.spring;

/*
WAP to print ASCII values of all the letters of the English alphabet from A to Z.
*/

public class Question109 {
    public static void main(String[] args) {
        for (char ch = 'A'; ch <= 'Z'; ++ch) {
            System.out.printf("Ascii value of character %c is %d\n", ch, (int)ch);
        }
    }
}