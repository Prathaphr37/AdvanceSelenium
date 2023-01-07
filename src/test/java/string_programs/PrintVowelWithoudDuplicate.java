package string_programs;

import java.util.LinkedHashSet;

public class PrintVowelWithoudDuplicate {

	public static void main(String[] args) {
		String s = "PRAthapHrHebyaMysore";
		String s2 = s.toLowerCase();
	
		LinkedHashSet set = new LinkedHashSet<>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if ( ch == 'a' || ch == 'e' || ch == 'i'
					|| ch == 'o' || ch == 'u') {
			set.add(ch);
			}
		}
		System.out.println(set);
		
	}
}
