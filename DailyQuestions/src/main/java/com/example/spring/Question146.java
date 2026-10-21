package com.example.spring;

/*
WAP to check how long it takes to execute a program in nanoseconds
 */
public class Question146 {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        int i;
        System.out.println("The first 5 natural numbers are: ");
        for (i = 1; i <= 5; ++i) {
            System.out.println(i);
        }
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println("Estimated Time (in nanoseconds) to get first 5 natural numbers: " + estimatedTime);
    }
}
