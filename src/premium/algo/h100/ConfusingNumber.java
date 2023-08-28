package premium.algo.h100;

import java.util.List;

/*
 * @link : https://leetcode.com/problems/confusing-number/description/?envType=study-plan-v2&envId=premium-algo-100
 * 
 */
public class ConfusingNumber {

	public static void main(String[] args) {
		System.out.println(confusingNumber(6));
		System.out.println(confusingNumber1(916));
	}

	public static boolean confusingNumber(int n) {
		int num = n;
		int[] lookup = { 0, 1, -1, -1, -1, -1, 9, -1, 8, 6 };

		List<Integer> invalidNumber = List.of(2, 3, 4, 5, 7);
		int numberAfterRotation = 0;

		int numDigits = (int) Math.log10(num) + 1;

		for (int i = 0; i < numDigits; i++) {
			int digit = num % 10;
			if (invalidNumber.contains(digit)) {
				return false;
			}
			numberAfterRotation = digit + (10 * i);
			num /= 10;
		}

		return numberAfterRotation != n;
	}

	public static boolean confusingNumber1(int n) {
		int num = n;
		int numberAfterRotation = 0;
		int[] lookup = { 0, 1, -1, -1, -1, -1, 9, -1, 8, 6 };

		int numDigits = (int) Math.log10(num) + 1;
		int position = (int) Math.log10(num) + 1;

		for (int i = 0; i < numDigits; i++) {
			int digit = num % 10;
			num /= 10;
		}
		return numberAfterRotation != n;
	}

}
