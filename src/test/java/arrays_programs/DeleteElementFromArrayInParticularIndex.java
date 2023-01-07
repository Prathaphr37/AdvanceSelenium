package arrays_programs;

import java.util.Arrays;

public class DeleteElementFromArrayInParticularIndex {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 40, 5, 10, 20, 30 };

		int[] b = new int[a.length - 1];
		int index = 5;
		int j = 0;
		for (int i = 0; i < b.length; i++, j++) {

			if (i < index) {
				b[i] = a[j];
			} else if (i >= index) {
				b[i] = a[j + 1];
			}
		}
		System.out.println("a array is-->" + Arrays.toString(a));
		System.out.println("a array is-->" + Arrays.toString(b));
	}
}
