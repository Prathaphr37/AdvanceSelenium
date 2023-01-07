package string_programs;

import java.util.LinkedHashSet;

public class CountDuplicateWordInSentence {

	public static void main(String[] args) {
		String s = "prathap pramod naveen shivamma ramaiah madaiah madamma prathap pramod shivamma ramaiah madaiah madamma prathap pramod prathap";
		String[] ch = s.split(" ");
		LinkedHashSet<Object> set = new LinkedHashSet<>();
		for (int i = 0; i < ch.length; i++) {
			set.add(ch[i]);
		}
		System.out.println(set);
		
		for (Object lv : set) {
			int count=0;
			for (int i = 0; i < ch.length; i++) {
				if (lv.equals(ch[i])){
					count++;
				}
			}
			if (count>1) {
				System.out.println(lv+" occurred "+count+" times");
			}
			
		}
	}
}
