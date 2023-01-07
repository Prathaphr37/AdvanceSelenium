package string_programs;

import java.util.LinkedHashSet;

public class MaximumOccurredCharacterInWord {

	public static void main(String[] args) {
		int max = 0;
		char ch = ' ';
		String s = "indiabangaloremysorei";
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		System.out.println(set);
		for (Character lv : set) {
			int count = 0;
			for (int i = 0; i < s.length(); i++) {
				if (lv == s.charAt(i)) {
					count++;
				}
			}
			if (count > max) {
				max=count;
				ch=lv;
			}else if (count==max) {
				System.out.println(lv+" is occured  "+count+ " times");
			} 
		}
		System.out.println(ch+" is occured  "+max+ " times");
	}
}
