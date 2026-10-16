package com.example.spring;
/*
Output:
public class MyClass {
public static void main(String[] args) {
for(int i = 1; i <= 5; i++) {
	if(i == 3) {
		break;
	}
System.out.println(i);

public class MyClass {
public static void main(String[] args) {
System.out.println(-7 + 9 * 5);
System.out.println((68+7) % 8);
System.out.println(50 + -6*5 / 5);
System.out.println(6 + 25 / 3 * 6 - 8 % 2);
}
 */
public class Question59 {
    private final static int A = 15;
    static void myMethod() {
        System.out.println("Anyone who has never made a mistake has never tried anything new.");
    }
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println(i);
        }

        System.out.println(-7 + 9 * 5); // 38
        System.out.println((68+7) % 8); // 3
        System.out.println(50 + -6*5 / 5); // 44
        System.out.println(6 + 25 / 3 * 6 - 8 % 2); // 54

       // for(;;) {
       //     System.out.println("This loop will run forever.");
       // }

        System.out.println((35.5 * 3.7 - 3.6 * 7.5) / (60.8 - 8.9));
        System.out.println("linux");
        System.out.println("php");
        for(int i = 1; i <= 5; i++) {
            if(i == 3) {
                continue;
            }
            System.out.print(i + "\n ");
        }
        int x = 12, y = 3;
        System.out.println(Math.abs(-x - y));

        for(int i = 1; i <= 3; i++) {
            System.out.print((i & 1) != 0 ? "odd\n" : "even\n");
        }

        double a, b;
        a = -2.5;
        b = Math.abs(a);
        System.out.printf("|%.2f| = %.2f\n", a, b);

        x = 12;
        y = 3;
        System.out.println(Math.abs(-x - y));
        System.out.println(-(-x - y));
        System.out.println(x - -y);
        myMethod();
        myMethod();
        myMethod();
    }


}
