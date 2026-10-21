package com.example.spring;

/* WAP to search for a substring in a string */

import java.util.Scanner;

public class Question140 {
    private static final Scanner SCANNER = new Scanner(System.in);

    private static int[] findLPS(String pattern) {
        int n = pattern.length();

        int[] lps = new int[n];
        lps[0] = 0;

        int len = 0;
        int i = 1;
        while (i < n) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                lps[i++] = len;
            } else if (len > 0) {
                len = lps[len-1];
            } else {
                i++;
            }
        }
        return lps;
    }

    private static boolean isSubstring(String base, String pattern) {
        int[] lps = findLPS(pattern);

        int m = pattern.length();
        int n = base.length();
        int i = 0;
        int j = 0;

        while (i < n) {
            if (base.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
                if (j == m) {
                   return true;
                }
            } else if (j > 0) {
                j = lps[j-1];
            } else {
                i++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        String base = SCANNER.nextLine();
        System.out.print("Enter the substring: ");
        String pattern = SCANNER.nextLine();
        System.out.printf("%s contains %s: %b\n", base, pattern, base.contains(pattern));
        System.out.printf("%s is in %s: %b\n", pattern, base, isSubstring(base, pattern));
    }
}
