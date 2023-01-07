package string_programs;

import java.util.Arrays;

public class CheckWordIsAnagram {

	public static void main(String[] args) {
		String a = "adarsh";
		String b = "aadarsh";

		char[] a1 = a.toCharArray();
		char[] b1 = b.toCharArray();

		if (a.length() != b.length()) {
			System.out.println("it is not anagram");
		} else {
			Arrays.sort(a1);
			Arrays.sort(b1);

			for (int i = 0; i < a1.length; i++) {
				if (a1[i] != b1[i]) {
					System.out.println("it is not anagram");
					return;
				}

			}
			System.out.println("it is anagram");
		}

	}
}
