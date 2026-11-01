package Basics;

class A {
    static {
        System.out.println("Inside class A");
    }
}

class B {
    static {
        System.out.println("Inside class B");
    }
}

public class Test {
    public static void main(String[] args) {
        B a = new B();
        A b = new A();
    }
}
