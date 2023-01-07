package arrays_programs;

import java.util.Arrays;

public class SegregateElement8 {

	public static void main(String[] args) {
		int[] a = { 0, 4, 0, 1, 0, 2, 0, 5, 0, 6, 0, 7 };
		int c = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				c++;
			}
		}
		int j = 0;
		for (int i = 0; i<a.length ; i++) {
			if (a[i]!=0) {
				a[j]=a[i];
				j++;
			}
		}
		int n=a.length-c;
		for (int i = n; i < a.length; i++) {
			a[i] = 0;
		}

		System.out.println(Arrays.toString(a));
	}
}
