package com.example.spring;

import java.util.Scanner;

/* WAP to multiply a number by 2 without multiplication operator*/
public class Question132 {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        int num = SCANNER.nextInt();
        int res = num << 1;
        System.out.printf("%d multiplied by 2 is %d\n", num, res);
    }
}
