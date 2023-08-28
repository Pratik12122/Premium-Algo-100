package playground;

public class StringSplit {
	public static void main(String[] args) {
		String s = "abcdefg";
		int n = s.length();
		int i = 1;
		int effectiveShift = i % n;

		String part1 = s.substring(0, effectiveShift);
		String part2 = s.substring(effectiveShift);

		String result = part2 + part1;

		System.out.println(result);
	}
}
