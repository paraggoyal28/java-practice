package Basics;

class Stats<T extends Number> {
	T[] nums;

	Stats(T[] o) {
		nums = o;
	}

	// Return type double in s[] cases
	double average() {
		double sum = 0.0;

		for (int i = 0; i < nums.length; ++i) {
			sum += nums[i].doubleValue();
		}

		return sum/nums.length;
	}

	boolean sameAvg(Stats<?> ob) {
		if (average() == ob.average()) {
			return true;
		}
		return false;
	}
}

public class WildCardDemo {
	public static void main(String[] args) {
		Integer inums[] = {1, 2, 3, 4, 5};
		Stats<Integer> iob = new Stats<>(inums);
		double v = iob.average();
		System.out.println("iob average is " + v);

		Double dnums[] = {1.1, 2.2, 3.3, 4.4, 5.5};
		Stats<Double> dob = new Stats<>(dnums);
		double w = dob.average();
		System.out.println("dob average is: " + w);

		Float fnums[] = {1.0F, 2.0F, 3.0F, 4.0F, 5.0F};
		Stats<Float> fOb = new Stats<>(fnums);
		double x = fOb.average();
		System.out.println("fob average is: " + x);

		// See which arrays have same average
		System.out.print("Averages of iOb and dOb are:");
		if (iob.sameAvg(dob)) {
			System.out.println("are the same.");
		} else {
			System.out.println("differ");
		}

		if (iob.sameAvg(fOb)) {
			System.out.println("are the same");
		} else {
			System.out.println("differ");
		}
	}
}
