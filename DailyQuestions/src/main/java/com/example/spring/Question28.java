package com.example.spring;

/*
WAP to print the output:
Einstein[0] = E
Einstein[1] = I
Einstein[2] = N
Einstein[3] = S
Einstein[4] = T
Einstein[5] = E
Einstein[6] = I
Einstein[7] = N
 */
public class Question28 {
    public static void main(String[] args) {
        String myStr = "Einstein";
        for(int i = 0, n = myStr.length(); i < n; ++i) {
            char ch = myStr.charAt(i);
            System.out.println(myStr + "[" + i + "] = " + Character.toUpperCase(ch));
        }
    }
}
