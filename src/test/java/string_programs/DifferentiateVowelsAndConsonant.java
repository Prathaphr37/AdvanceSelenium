package string_programs;

public class DifferentiateVowelsAndConsonant {

	public static void main(String[] args) {
		String s = "PRAthapHrHebyaMysore";
		String vowel = "";
		String consonant = "";

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i'
					|| ch == 'o' || ch == 'u') {
				vowel += ch;
			} else {
				consonant += ch;
			}

		}
		System.out.println("vowel in a word = " + vowel);
		System.out.println("consonant in a word  = " + consonant);
	}
}
