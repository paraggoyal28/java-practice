package com.example.spring;

/*
Write a program to print the output:
body [b] = b
body [o] = o
body [d] = d
body [y] = y
 */
public class Question46 {
    public static void main(String[] args) {
        String input = "body";
        for (char ch: input.toCharArray()) {
            System.out.println(input + " [" + ch + "] = " + ch);
        }
    }
}
