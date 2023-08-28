package playground;

public class Test {
	public static void main(String[] args) {
		int a5 = (int) Math.log10(5);
		int a15 = (int) Math.log10(15);
		System.out.println(a5);
		System.out.println(a15);
	}

	public static void printDigits(int num) {
		int originalNumber = num;

		// Count the number of digits in the number
		int numDigits = (int) Math.log10(num) + 1;

		// Extract and print each digit using modulus and division
		for (int i = 0; i < numDigits; i++) {
			int digit = num % 10;
			System.out.println(digit);
			num /= 10;
		}
	}
}
