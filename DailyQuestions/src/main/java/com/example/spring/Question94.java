package com.example.spring;

import java.util.Scanner;

/*
WAP to find the number of days in a month
 */
public class Question94 {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {
        int monthNo;
        System.out.print("Enter the month number for which you want to find the days: ");
        monthNo = SCANNER.nextInt();

        if (monthNo > 12 || monthNo < 1) {
            System.out.println("Invalid month number entered by the user");
        } else if (monthNo == 2) {
            System.out.println("The number of days of month number 2 can be 28 or 29");
        } else {
            System.out.println("The number of days of month number " + monthNo + " are: " + months[monthNo - 1]);
        }
    }
}
