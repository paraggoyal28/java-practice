import java.util.LinkedList;

class Address {
	private String name;
	private String street;
	private String city;
	private String state;
	private String code;

	Address(String name, String street, String city, String state, String code) {
		this.name = name;
		this.street = street;
		this.city = city;
		this.state = state;
		this.code = code;
	}

	public String toString() {
		return name + "\n" + street + "\n" + city + " " + state + " " + code;
	}
}

public class MailList {
	public static void main(String[] args) {
		LinkedList<Address> m1 = new LinkedList<>();
		m1.add(new Address("J.W West", "l1 Gek Ave", "Urban", "1L", "c1801"));
		m1.add(new Address("Raiph Rarer", "1142 Maple Lanc." , "Manomer", "IL", "61853"));
		m1.add(new Address("Tom Cariton", "857 Rim Str.", "Champainge", "IL", "c1820"));

		for (Address element: m1) {
			System.out.print(element + "\n");
		}

		System.out.println();
	}
}
