package arrays_programs;

import java.util.Arrays;

public class AddTwoArrayOfSameSize {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 5, 6 };
		int b[] = { 10, 2, 5, 7, 9 };
		int[] c=new int[b.length];

		for (int i = 0; i < b.length; i++) {
			 c[i] = a[i] + b[i];
		}

		System.out.println(Arrays.toString(c));
	}
}