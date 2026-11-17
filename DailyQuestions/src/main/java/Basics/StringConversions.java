package Basics;


public class StringConversions {
	public static void main(String[] args) {
		int num = 197682;
		System.out.println(num + " in binary " + Integer.toBinaryString(num));
		System.out.println(num + " in octal: " + Integer.toOctalString(num));
		System.out.println(num + " in hexadecimal " + Integer.toHexString(num));

		try {
      	// Start the process
			ProcessBuilder processBuilder =
          new ProcessBuilder("notepad.exe", "\"D:\\learning\\LLDPractice.txt\"");
			processBuilder.start();
		} catch (Exception e) {
			System.out.println("Error executing Notepad: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
