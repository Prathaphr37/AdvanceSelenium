package arrays_programs;

import java.util.Arrays;

public class ReplaceNewElementInArrayInParticularElementPlace {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 40, 5, 10, 20, 30 };
		int ele=5;
		int value = 6;
		for (int i = 0; i < a.length; i++) {

			if (a[i] == ele) {
				a[i] = value;
			}
		}
		System.out.println("a array is-->"+Arrays.toString(a));
	}
}
