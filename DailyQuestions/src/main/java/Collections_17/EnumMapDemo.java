package Collections_17;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapDemo {
	enum OrderStatus {
		PENDING,
		PROCESSING,
		SHIPPED,
		DELIVERED
	}
	public static void main(String[] args){
		Map<OrderStatus, String>  statusMessages = new EnumMap<>(OrderStatus.class);

		statusMessages.put(OrderStatus.DELIVERED, "Delivered to customer");
		statusMessages.put(OrderStatus.PROCESSING, "Packing items in warehouse");
		statusMessages.put(OrderStatus.SHIPPED, "Handed over to courier");
		statusMessages.put(OrderStatus.PENDING, "Order received and waiting for payment");

		// Lookup
		System.out.println(statusMessages.get(OrderStatus.PROCESSING));

		// Iterate and print
		for (Map.Entry<OrderStatus, String> entry: statusMessages.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
	}
}
