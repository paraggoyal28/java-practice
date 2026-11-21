package Collections_17;

import java.util.Properties;
import java.util.Set;

public class PropDemo {
	public static void main(String[] args){
		Properties capitals = new Properties();

		capitals.setProperty("Illinois", "SpringField");
		capitals.setProperty("Missouri", "Jefferson City");
		capitals.setProperty("Washington", "Olympia");
		capitals.setProperty("California", "Sacramentic");
		capitals.setProperty("Indiana", "Indianapolis");

		// Get a set view of the keys
		Set<?> states = capitals.keySet();

		// Show all states and capitals
		for (Object name: states) {
			System.out.println("The capital of: " + name + " is " + capitals.getProperty((String) name) + ".");
		}

		System.out.println();

		// Look for state not in list - specify default
		String str = capitals.getProperty("Florida", "Not Found");
		System.out.println("The capital of Florida is: " + str + ".");
	}
}
