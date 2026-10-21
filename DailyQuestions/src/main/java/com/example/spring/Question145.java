package com.example.spring;

/* Print current system environment and system properties */
public class Question145 {
    public static void main(String[] args) {
        System.out.println("Current system environment: ");
        System.out.println(System.getenv());
        System.out.println("Current System properties: ");
        System.out.println(System.getProperties());
    }
}
