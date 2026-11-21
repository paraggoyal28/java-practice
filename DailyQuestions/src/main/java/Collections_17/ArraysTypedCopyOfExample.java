package Collections_17;

import java.util.Arrays;

public class ArraysTypedCopyOfExample {
	static class Animal {
		final String name;

		Animal(String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			return getClass().getName() +  "(" + name + ")";
		}
	}

	static class Dog extends Animal {
		Dog (String name) {
			super(name);
		}

		void bark() {
			System.out.println(name + " says woof!");
		}
	}

	public static void main(String[] args){
		// 1. Upcasting array runtime type Dog[] -> Animal[]
		Dog[] dogs = {new Dog("Rex"), new Dog("Buddy")};
		Animal[] animals = Arrays.copyOf(dogs, dogs.length, Animal[].class);
		System.out.println("Animal array: " + Arrays.toString(animals));

		// 2. Downcasting when all elements of subtype Dog[]
		Object[] mixed = { new Dog("Mixed"), new Dog("Luna")};
		Dog[] copiedDogs = Arrays.copyOf(mixed, 3, Dog[].class);
		System.out.println("Copied Dogs: " + Arrays.toString(copiedDogs));

		copiedDogs[0].bark();

		Object[] wrongMix = { new Dog("Max"), "Not a dog!"};
		try {
			Arrays.copyOf(wrongMix, wrongMix.length, Dog[].class);
		} catch (ArrayStoreException e) {
			System.out.println("Caught exception ArrayStoreException : " + e.getMessage());
		}
	}
}
