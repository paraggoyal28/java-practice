package com.example.spring;

/*
WAP to find whether a character is in upper case or not
 */
public class Question25 {
    public static void main(String[] args) throws Exception {
        System.out.println("Enter the character: ");
        char ch = (char) System.in.read();
        if (Character.isUpperCase(ch)) {
            System.out.println("Entered character is in upper case");
        } else {
            System.out.println("Entered character is in lower case");
        }
    }
}
