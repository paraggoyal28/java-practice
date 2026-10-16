package com.example.spring;

import java.util.Scanner;

/*
WAP to convert celsius into fahrenheit
 */
public class Question54 {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the temperature in Celcius: ");
        double temperatureInCelcius = SCANNER.nextDouble();
        double temperatureInFahrenheit = (temperatureInCelcius * 9)/5 + 32;
        System.out.printf("Entered temperature in fahrenheit %.2f\n", temperatureInFahrenheit);
    }
}
