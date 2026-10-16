package com.example.spring;

/*
Write a program to calculate the discounted price and the total price after discount

Given:
If purchase value is greater than 1000, 10% discount
If purchase value is greater than 5000, 20% discount
If purchase value is greater than 10000, 30% discount.
 */

import java.util.Scanner;

public class Question47 {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the purchase price: ");
        double price = SCANNER.nextDouble();

        double discountedPrice = calculateDiscountedPrice(price);
        double finalPrice = price - discountedPrice;
        System.out.printf("Discounted Price: %.2f\n", discountedPrice);
        System.out.printf("Final price after discount: %.2f\n", finalPrice);

    }

    private static double calculateDiscountedPrice(double price) {
        if (price > 10000) {
            return price * 0.3;
        } else if (price > 5000) {
            return price * 0.2;
        } else if (price > 1000){
            return price * 0.1;
        } else {
            return price * 0.05;
        }
    }
}
