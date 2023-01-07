package string_programs;

public class MinimumLengthInStringArray {

	public static void main(String[] args) {
		String[] s = { "12", "1234", "12345", "5678" ,"q"};
		int MinLength = s[0].length();
		for (int i = 1; i < s.length; i++) {
			if (s[i].length() < MinLength) {
				MinLength = s[i].length();
			}
		}
		System.out.println("Maximum length = " + MinLength);
		for (int i = 0; i < s.length; i++) {
			if (s[i].length() == MinLength) {
				System.out.println(s[i]);
			}
		}
	}
}
