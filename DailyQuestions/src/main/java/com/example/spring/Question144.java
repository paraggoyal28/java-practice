package com.example.spring;

/* Check whether java is installed in our system */
public class Question144 {
    public static void main(String[] args) {
        System.out.println("\n Java Version: " + System.getProperty("java.version"));
        System.out.println("Java Runtime System: " + System.getProperty("java.runtime.version"));
        System.out.println("Java Home: " + System.getProperty("java.home"));
        System.out.println("Java Vendor: " + System.getProperty("java.vendor"));
        System.out.println("Java Vendor URL: " + System.getProperty("java.vendor.url"));
        System.out.println("Java Class Path: " + System.getProperty("java.class.path"));

    }
}
