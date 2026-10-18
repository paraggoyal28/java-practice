package com.example.spring;

/*WAP to find the factorial of a number */

import java.util.Scanner;

public class Question93 {
    private static final Scanner SCANNER = new Scanner(System.in);

    private static long findFactorial(long num) {
        long factorial = 1;
        for (long i = 2; i <= num; ++i) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        long num;
        System.out.print("Enter the number: ");
        num = SCANNER.nextLong();
        long factorial = findFactorial(num);
        System.out.printf("The factorial of %d is %d\n", num, factorial);
    }
}
