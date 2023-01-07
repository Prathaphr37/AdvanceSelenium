package arrays_programs;

import java.util.LinkedHashSet;

public class FrequencyOfElementInArray2 {

	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,5,6,2,1,3,4,5,6,1,2,4,6,3,9};
		LinkedHashSet<Integer> set = new LinkedHashSet<>();
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
		}
		
		System.out.println(set);
		for(int lv:set) {
			int freq=0;
		for (int i = 0; i < a.length; i++) {
			if (lv==a[i]) {
				freq++;
			}
			} 
			System.out.println(lv+"=occurred "+freq+"--->times");
		}
		
	}
	
}
