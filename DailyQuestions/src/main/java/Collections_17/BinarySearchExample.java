package Collections_17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BinarySearchExample {
	record Product(String name, int price) {}
	public static void main(String[] args) {
		// 1. Natural ordering (List<Integer> / List<String>)
		List<String> cities = new ArrayList<>(List.of("Delhi", "Jaipur", "Mumbai", "Pune"));
		Collections.sort(cities);

		int idxFound = Collections.binarySearch(cities, "Mumbai");
		int idxMissing = Collections.binarySearch(cities, "Chennai");

		System.out.println("Mumbai Index: " + idxFound);
		System.out.println("Chennai Index: " + idxMissing);

		List<Product> products = new ArrayList<>(List.of(
				new Product("Mouse", 25),
				new Product("Keyboard", 75),
				new Product("Monitor", 300),
				new Product("Webcam", 60)
		));
		Comparator<Product> byPrice = Comparator.comparingInt(Product::price);
		products.sort(byPrice);
		int productIdx = Collections.binarySearch(products, new Product("New Any", 74), byPrice);
		System.out.println("Product with price 74 at index: " + productIdx);
	}
}
