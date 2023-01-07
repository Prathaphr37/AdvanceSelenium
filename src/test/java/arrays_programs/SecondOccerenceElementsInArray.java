package arrays_programs;

import java.util.LinkedHashSet;

public class SecondOccerenceElementsInArray {

public static void main(String[] args) {
		
		int[] a= {1,2,3,4,5,6,2,1,9,8,10,3,11,2};
		LinkedHashSet<Integer> set = new LinkedHashSet<>();
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
		}
		
		System.out.println(set);
		for(int lv:set) {
			int count=0;
		for (int i = 0; i < a.length; i++) {
			if (lv==a[i]) {
				count++;
			}
			} 
		if (count>1) {
			System.out.println(lv+" = occurred "+count+"---->times");
		}
			
		}
		
	}
}
