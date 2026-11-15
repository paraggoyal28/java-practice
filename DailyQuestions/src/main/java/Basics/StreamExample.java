package Basics;

import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
	public static void main(String[] args) {
		List<String> languages = List.of("Java", "Python", "Javascript", "C++", "Go");
		// Filter names starting with 'i' and convert them to uppercase
		List<String> jLangs = languages.stream()
				.filter(lang -> lang.startsWith("J"))
				.map(String::toUpperCase)
				.toList();

		jLangs.add("abc");

		System.out.println(jLangs); // Output: [Java, Javascript]
	}
}
