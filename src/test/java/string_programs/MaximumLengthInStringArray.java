package string_programs;

public class MaximumLengthInStringArray {

	public static void main(String[] args) {
		String[] s = { "12", "1234", "12345", "5678" };
		int biggestLength = s[0].length();
		for (int i = 1; i < s.length; i++) {
			if (s[i].length() > biggestLength) {
				biggestLength = s[i].length();
			}
		}
		System.out.println("Maximum length = " + biggestLength);
		for (int i = 0; i < s.length; i++) {
			if (s[i].length() == biggestLength) {
				System.out.println(s[i]);
			}
		}
	}
}
