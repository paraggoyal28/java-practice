package Basics;

public class ExceptionHandlingExample {
	public static void main(String[] args) {
		String input = "abc";

		try {
			// Throw a NumberFormatException
			int number = Integer.parseInt(input);
			int result = 100 / number;

			System.out.println("Result: " + result);
		} catch (NumberFormatException nfe) {
			System.out.println("Caught an error: " + input + " 'is not a valid integer!'");
		} catch (ArithmeticException ae) {
			System.out.println("Caught an error: Cannot divide by zero!");
		} finally {
			System.out.println("Execution finished (this block always run)");
		}

	}
}
