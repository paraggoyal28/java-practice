package com.example.spring;

import java.util.Scanner;

/* WAP to convert binary to decimal */
public class Question150 {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        String a = "1000100";
        int decimal = Integer.parseInt(a, 2);
        System.out.printf("%s converted to decimal: %d\n", a, decimal);
    }
}
