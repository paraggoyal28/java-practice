package com.example.spring;

/* Write a program to illustrate isNAN method */
public class Question153 {
    public static void main(String[] args) {
        /* this method returns true if the value is NaN */
        Float a = Float.NaN;
        Float b = 6.0f;
        System.out.println(a + " - " + a.isNaN());
        System.out.println(a + " - " + Float.isNaN(a));
        System.out.println(b + " - " + Float.isNaN(b));
    }
}
