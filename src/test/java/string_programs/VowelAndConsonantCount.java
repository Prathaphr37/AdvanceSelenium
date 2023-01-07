package string_programs;

public class VowelAndConsonantCount {

	public static void main(String[] args) {
		String s = "PRAthapHrHebyaMysore";
		int vowel = 0;
		int consonant = 0;

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i'
					|| ch == 'o' || ch == 'u') {
				vowel++;
			} else {
				consonant++;
			}

		}
		System.out.println("vowel count = " + vowel);
		System.out.println("consonant count = " + consonant);
	}
}
