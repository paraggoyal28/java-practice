package com.example.spring;

/*
WAP to print current working directory
 */
public class Question124 {
    public static void main(String[] args) {
        String path = System.getProperty("user.dir");
        System.out.println("Current working directory: " + path);
    }
}
