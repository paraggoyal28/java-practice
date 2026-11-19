package Collections_17;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo1 {
	public static void main(String[] args) {
		ArrayList<Integer> myArray = new ArrayList<>();
		myArray.add(1);
		myArray.add(3);
		myArray.add(5);
		myArray.add(8);
		myArray.add(1, 4);
		myArray.addAll(List.of(9, 8, 5));
	//	myArray.forEach(System.out::println);
		List<Integer> sub = myArray.subList(2, 4);
		sub.forEach(System.out::println);

		List<Integer> myArray2 = List.of(2, 3, 4, 5);
		System.out.println(myArray2);


	}
}
