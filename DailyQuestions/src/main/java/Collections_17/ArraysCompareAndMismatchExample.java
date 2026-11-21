package Collections_17;

import java.util.Arrays;

public class ArraysCompareAndMismatchExample {
	public static void main(String[] args){
		// 1. Arrays.compare: lexicographical comparison & prefix rule
		int[] a = {1, 2, 3};
		int[] b = {1, 2, 5};
		int[] prefixOfA = {1, 2};

		System.out.println("compare(a, b): " + Arrays.compare(a, b));
		System.out.println("compare(prefixOfA, a): " + Arrays.compare(prefixOfA, a));
		System.out.println("compare(a, prefixOfA): " + Arrays.compare(a, prefixOfA));

		// Range overload: compare a[1..3) vs b[1..3) -> both a{2,3} and b{2,5}
		System.out.println("Compare ranges [1, 3) :" + Arrays.compare(a, 1, 3, b, 1, 3));

		// 2. Arrays.compareUnsigned: signed vs unsigned byte/int ordering
		byte[] signedBytes = {-1, 10}; // -1 in two's complement is 255
		byte[] otherBytes = {127, 10}; // 127 in two's complement is 127

		System.out.println("signed compare: " + Arrays.compare(signedBytes, otherBytes));
		System.out.println("unsigned compare: " + Arrays.compareUnsigned(signedBytes, otherBytes));

		// 3 Array mismatch: first differing index or -1 if equal
		int[] x = {10, 20, 30, 40};
		int[] y = {10, 20, 99, 40};
		int[] z = {10, 20, 30, 40};

		System.out.println("mismatch (x, y): " + Arrays.mismatch(x, y));
		System.out.println("mismatch (x, y): " + Arrays.mismatch(x, z));
		System.out.println("mismatch (x, y): " + Arrays.mismatch(prefixOfA, a));

	}
}
