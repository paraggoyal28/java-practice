package com.example.spring;

import java.util.Scanner;

/*
WAP to convert Megabytes to kilobytes
 */
public class Question78 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the given number of megabytes: ");
        double inputMgbytes = scanner.nextDouble();
        double convertedKiloBytes = inputMgbytes * 1_024;
        System.out.printf("Converted %.2f megabytes to %.2f kilobytes\n", inputMgbytes, convertedKiloBytes);
    }
}
