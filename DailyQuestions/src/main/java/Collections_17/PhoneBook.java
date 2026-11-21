package Collections_17;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

public class PhoneBook {
	public static void main(String[] args) throws IOException  {
		Properties pb = new Properties();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name, number;
		FileInputStream fin = null;
		boolean changed = false;

		// try to open phonebook.dat file
		try {
			fin = new FileInputStream("phonebook.dat");
		} catch (FileNotFoundException e) {
			// Ignore missing file
		}

		// If phonebook file already exists
		try {
			if (fin != null) {
				pb.load(fin);
				fin.close();
			}
		} catch (IOException e) {
			System.out.println("Error reading file");
		}

		// Let user enter new names and numbers
		do {
			System.out.println("Enter new name: (quit) to stop");
			name = br.readLine();
			if (name.equalsIgnoreCase("quit")) break;
			System.out.println("Enter number: ");
			number = br.readLine();
			pb.setProperty(name, number);
			changed = true;
		} while (!name.equalsIgnoreCase("quit"));

		// If phone book data has changed, save it
		if (changed) {
			FileOutputStream fout = new FileOutputStream("phonebook.dat");
			pb.store(fout, "Telephone Book");
			fout.close();
		}

		// Look up numbers given a name
		do {
			System.out.println("Enter name to find (quit) to quit.");
			name = br.readLine();
			if (name.equalsIgnoreCase("quit")) break;
			number = (String) pb.get(name);
			System.out.println(name + " number is: " + number);
		} while (!name.equalsIgnoreCase("quit"));

	}



}
