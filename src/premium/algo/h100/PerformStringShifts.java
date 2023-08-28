package premium.algo.h100;


/*
 * Link : https://leetcode.com/problems/perform-string-shifts/?envType=study-plan-v2&envId=premium-algo-100
 */

public class PerformStringShifts {

	public static void main(String[] args) {
		String s = "abcdefg";
		int[][] shifts = { { 1, 1 }, { 1, 1 }, { 0, 2 }, { 1, 3 } };

		System.out.println(stringShift(s, shifts));
	}

	public static String stringShift(String s, int[][] shift) {
		int n = s.length();
		for (int i = 0; i < shift.length; i++) {
			int direction = shift[i][0];
			int shiftBy = shift[i][1];

			int effectiveShift = shiftBy % n;

			if (direction == 0) {
				String part1 = s.substring(0, effectiveShift);
				String part2 = s.substring(effectiveShift);
				s = part2.concat(part1);
			} else {
				String part1 = s.substring(n - effectiveShift);
				String part2 = s.substring(0, n - effectiveShift);
				s = part1 + part2;
			}

		}

		return s;
	}

}
