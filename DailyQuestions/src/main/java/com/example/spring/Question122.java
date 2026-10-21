package com.example.spring;

/* Write a program to illustrate try-catch statement.
*/
public class Question122 {
    public static void main(String[] args) {
        try {
            int[] nums = new int[3];
            nums[5] = 4;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
