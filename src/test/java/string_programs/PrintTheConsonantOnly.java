package string_programs;

public class PrintTheConsonantOnly {

	public static void main(String[] args) {
		String s = "PRAthapHrHebyaMysore";

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i'
					|| ch == 'o' || ch == 'u') {

			} else {
				System.out.println(ch);
			}

		}
	}
}
