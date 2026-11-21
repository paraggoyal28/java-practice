package Collections_17;

import java.util.Arrays;
import java.util.List;

public class ArraysStreamExample {
	record Order(String id, int amount, boolean paid) {}
	public static void main(String[] args){
		// 1. Object array stream: filter, transform and collect (non-mutating)
		Order[] orders = {
				new Order("ORD-1", 250, true),
				new Order("ORD-2", 80, false),
				new Order("ORD-3", 400, true),
				new Order("ORD-4", 150, true)
		};

		List<String> paidHighValueIds = Arrays.stream(orders)
				.filter(Order::paid)
				.filter(o -> o.amount() >= 200)
				.map(Order::id)
				.toList();
		System.out.println("Paid >= 200 IDs: " + paidHighValueIds);

		// 2. Slice stream [startInclusive, endExclusive): orders at index 1 and 2
		int sliceTotal = Arrays.stream(orders, 1, 3)
				.mapToInt(Order::amount)
				.sum();
		System.out.println("Slice [1, 3) sum: " + sliceTotal);

		// 3. Primitive array -> IntStream (avoids boxing int -> Integer)
		int[] latenciesMs = {12, 45, 8, 90, 23};
		double avgLatency = Arrays.stream(latenciesMs)
				.filter(ms -> ms > 10)
				.average()
				.orElse(0.0);
		System.out.println("Avg latency (>10ms): " + avgLatency);
	}
}
