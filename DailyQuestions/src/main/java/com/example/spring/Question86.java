package com.example.spring;

/*
WAP to convert gigabytes to megabytes
1 GB = 1024 MB
 */

import java.util.Scanner;

public class Question86 {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        double gigabytes, megabytes;
        System.out.print("Enter the given gigabytes: ");
        gigabytes = SCANNER.nextDouble();
        megabytes = gigabytes * 1_024;
        System.out.printf("There are %.2f megabytes in %.2f gigabytes.\n", megabytes, gigabytes);
    }
}
