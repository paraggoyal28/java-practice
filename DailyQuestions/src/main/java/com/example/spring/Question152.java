package com.example.spring;

/* WAP to check if one string is a rotation of another */
public class Question152 {

    private static boolean isRotated(String a, String b) {
        if (a == null && b == null) return true;
        if (a == null || b == null) return false;
        if (a.length() != b.length()) return false;
        int n = b.length();
        char firstAChar = a.charAt(0);
        int point = -1;
        for (int i = 0; i < n; ++i) {
            if (b.charAt(i) == firstAChar) {
                point = i;
                break;
            }
        }

        if (point == -1) return false;
        int k = 0;
        while (k < n) {
            if (b.charAt(point) != a.charAt(k)) {
                return false;
            }
            point = (point + 1) % n;
            k++;
        }

        return true;
    }

    public static void main(String[] args) {
        String a = "abcd";
        String b = "cdeb";
        System.out.printf("%s is rotated of %s: %b\n", a, b, isRotated(a, b));
    }
}
