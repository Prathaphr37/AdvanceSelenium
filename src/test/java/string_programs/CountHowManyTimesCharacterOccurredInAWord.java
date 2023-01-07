package string_programs;

import java.util.LinkedHashSet;

public class CountHowManyTimesCharacterOccurredInAWord {

	public static void main(String[] args) {
		String s="indiabangaloremysore";
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		System.out.println(set);
		for (Character lv : set) {
			int count=0;
			for (int i = 0; i < s.length(); i++) {
				if (lv==s.charAt(i)) {
					count++;
				}
			}
			System.out.println(lv+" occurred "+count+" times");
		}
	}
}
