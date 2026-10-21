package com.example.spring;

/* Convert a hexadecimal string to decimal */
public class Question151 {
    public static void main(String[] args) {
        String hexString = "4f";
        int decimal = Integer.parseInt(hexString, 16);
        System.out.printf("%s hexadecimal converted to decimal is %d\n" , hexString, decimal);
    }
}
