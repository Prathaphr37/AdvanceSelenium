package arrays_programs;

import java.util.Arrays;

public class ReplcaeNewElementInArrayInParticularIndex {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 40, 6 ,10,20,30};
		int value=5;
		int index=4;
		for (int i = 0; i < a.length; i++) {
 
			if (i==index) {
				a[i]=value;
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
