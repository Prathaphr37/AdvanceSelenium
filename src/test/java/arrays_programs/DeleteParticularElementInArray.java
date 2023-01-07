package arrays_programs;

import java.util.Arrays;

public class DeleteParticularElementInArray {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 40, 5, 10, 20, 30 };

		int[] b = new int[a.length - 1];
		int value = 5;
		int j = 0;
		for (int i = 0; i < b.length; i++, j++) {
			
			if (a[i]==value) {
				b[i] = a[j+1];
				j++;
			} else {
				b[i] = a[j];
			}
		}
		System.out.println("a array is-->" + Arrays.toString(a));
		System.out.println("a array is-->" + Arrays.toString(b));
	}
}
