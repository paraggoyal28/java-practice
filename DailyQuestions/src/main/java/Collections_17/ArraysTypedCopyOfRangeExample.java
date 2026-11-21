package Collections_17;

import java.util.Arrays;

public class ArraysTypedCopyOfRangeExample {
	static class Animal {
		final String name;
		Animal(String name) {
			this.name = name;
		}
		@Override
		public String toString() {
			return getClass().getSimpleName() + "(" + name + ")";
		}
	}

	static class Dog extends Animal {
		Dog(String name) {
			super(name);
		}
		void bark() {
			System.out.println(name + " says woof!");
		}
	}

	public static void main(String[] args){
		// 1. Slice a subtype array into a supertype array: Dog[] -> Animal[]
		Dog[] dogs = { new Dog("Rex"), new Dog("Buddy"), new Dog("Charlie") };
		Animal[] sliceAsAnimals = Arrays.copyOfRange(dogs, 3, 4, Animal[].class);
		System.out.println("Slice as Animal[]: " + Arrays.toString(sliceAsAnimals));
    	// Dog(Buddy), Dog(Charlie)

		// 2. Slice Object[] into Dog[] with padding ('to' > original.length)
		Object[] mixed = {"ignored", new Dog("Max"), new Dog("Luna")};
		Dog[] sliceAsDogs = Arrays.copyOfRange(mixed, 1, 4, Dog[].class);
		System.out.println("Slice as Dog[] : " + Arrays.toString(sliceAsDogs));
		// [Dog(Max), Dog(Luna), null]
		sliceAsDogs[0].bark();

		// 3. Incompatible elements
		Object[] badSlice = { new Dog("Max"), "Not a dog", new Dog("Luna")};
		try {
			Arrays.copyOfRange(badSlice, 0, 3, Dog[].class);
		} catch (ArrayStoreException e) {
			System.err.println("Caught exception ArrayStoreException " + e.getMessage());
		}
	}
}
