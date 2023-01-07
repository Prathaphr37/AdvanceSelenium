package arrays_programs;

import java.util.Arrays;

public class AddNewElementToArrayInparticularIndex {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 40, 5, 10, 20, 30 };
		
		int[] b = new int[a.length + 1];
		int index = 5;
		int value = 6;
		int j = 0;
		for (int i = 0; i < a.length; i++, j++) {

			if (i == index) {
				b[i] = value;
				j++;
			}
			b[j] = a[i];
		}
		System.out.println("a array is-->" + Arrays.toString(a));
		System.out.println("a array is-->" + Arrays.toString(b));
	}
}
