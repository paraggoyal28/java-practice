package com.example.spring;

import java.util.Scanner;
/*
WAP to take the Selling Price and Cost Price of a Product
and calculate the profit or loss
*/
public class Question113 {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        double sellingPrice, costPrice, profit, loss;
        System.out.print("Enter the selling price of the product: ");
        sellingPrice = SCANNER.nextDouble();
        System.out.print("Enter the cost price of the product: ");
        costPrice = SCANNER.nextDouble();
        if (costPrice > sellingPrice) {
            loss = costPrice - sellingPrice;
            System.out.printf("We incurred a loss of %.2f\n", loss);
        } else if (sellingPrice > costPrice) {
            profit = sellingPrice - costPrice;
            System.out.printf("We gained a profit of %.2f\n", profit);
        } else {
            System.out.println("No profit no loss");
        }
    }
}
