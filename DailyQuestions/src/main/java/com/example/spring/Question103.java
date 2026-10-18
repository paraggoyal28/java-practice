package com.example.spring;

import java.util.Scanner;

/*
WAP that takes a height of a person and classify the person as taller, average, or shorter, or abnormal
 */
public class Question103 {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        double height;
        System.out.print("Enter the height of the user in cms: ");
        height = SCANNER.nextDouble();

        if (height < 130) {
            System.out.println("The person is exceptionally short.");
        } else if (height <= 150) {
            System.out.println("The person is short.");
        } else if (height <= 170) {
            System.out.println("The person is of average height.");
        } else if (height <= 200) {
            System.out.println("The person is tall.");
        } else {
            System.out.println("The person is exceptionally tall.");
        }
    }
}
