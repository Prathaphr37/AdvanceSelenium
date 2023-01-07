package string_programs;

import java.util.LinkedHashSet;

public class PositionAndIndexOfAnyCharacter {

	public static void main(String[] args) {
		String s="indiabangaloremysore";
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		System.out.println(set);
		for (Character lv : set) {
			for (int i = 0; i < s.length(); i++) {
				if (lv==s.charAt(i)) {
					System.out.println("index of "+"'"+lv+"'"+" is "+i);
					System.out.println("position of "+"'"+lv+"'"+" is "+(i+1));
					break;
				}
			}
			System.out.println("--------");
		}
	}
}
