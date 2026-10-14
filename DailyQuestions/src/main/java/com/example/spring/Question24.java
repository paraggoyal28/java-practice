package com.example.spring;

import java.util.Scanner;

/*
WAP to check whether a given character is lower case or not
 */
public class Question24 {
    public static void main(String[] args) throws Exception {
         char ch;
         System.out.println("Enter the character for which you want to find the case");
         ch = (char)System.in.read();
         if (Character.isLowerCase(ch)) {
             System.out.println("Entered character is in lower case");
         } else {
             System.out.println("Entered character is in upper case");
         }
    }
}
