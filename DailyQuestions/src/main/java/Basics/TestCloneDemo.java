package Basics;

class TestCloneNew implements Cloneable {
	int a;
	double b;

	TestCloneNew cloneTest() {
		try {
			// call clone in Object
			return (TestCloneNew) super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("Cloning not supported");
			return this;
		}
	}
}

public class TestCloneDemo {
	public static void main(String[] args) {
		TestCloneNew x1 = new TestCloneNew();
		TestCloneNew x2;

		x1.a = 10;
		x1.b = 20.98;

		x2 = x1.cloneTest(); // clone x1
		System.out.println("x1: " + x1.a + ", " + x1.b);
		System.out.println("x2: " + x2.a + ", " + x2.b);
	}
}
