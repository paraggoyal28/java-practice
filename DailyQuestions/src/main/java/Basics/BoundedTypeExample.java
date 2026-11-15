package Basics;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;

class StatsDemo<T extends Number> {
	T[] nums; // arrays of number or subclass

	StatsDemo(T[] o) {
		nums = o;
	}

	double average() {
		double sum = 0.0;
		for (int i = 0; i < nums.length; ++i) {
			sum += nums[i].doubleValue();
		}
		return sum/nums.length;
	}
}

class BoundedTypeExample {
	public static void main(String[] args) throws IOException {
		Integer[] iNums = {1, 2, 3, 4, 5};
		StatsDemo<Integer> iOb = new StatsDemo<>(iNums);
		double v = iOb.average();
		System.out.println("iob average is: " + v);

		Double[] dNums = {1.1, 2.2, 3.3, 4.4, 5.5};
		StatsDemo<Double> dob = new StatsDemo<>(dNums);
		double w = dob.average();
		System.out.println("dob average is: " + w);

		// This won't compile because String is not a
		// subclass of Number
		 //String strs[] = {"1", "2", "3", "4"};
		// Stats<String> strOb = new Stats<String>(strs);

		// double d = strOb.average();
		// System.out.println("strOb average is" + d);

		List<String> names = List.of("Alice", "Bob", "Anna", "Charlie");
		List<String> aNames = names.stream()
				.filter(name -> name.startsWith("A"))
				.toList();

		Map<String, Integer> scores = Map.of("Alice", 90, "Bob", 87);
		scores.forEach((name, score) -> System.out.println(name + ":" + score));

		LocalDateTime now = LocalDateTime.now();
		String formatted = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
		System.out.println(formatted);

    String content =
        Files.readString(
            Path.of("D:\\java-practice\\DailyQuestions\\src\\main\\java\\Basics\\file.txt"));
		System.out.println(content);
		System.out.println("Working directory: " + System.getProperty("user.dir"));
	}
}
