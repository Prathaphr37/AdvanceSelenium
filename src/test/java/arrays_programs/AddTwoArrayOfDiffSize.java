package arrays_programs;

import java.util.Arrays;

public class AddTwoArrayOfDiffSize {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 5, 6 };
		int b[] = { 10, 2, 5 };
		int length=a.length;
		if (b.length>a.length) {
			length=b.length;
		}

		int[] c=new int[length];
		for (int i = 0; i < length; i++) {
			try {
				c[i] = a[i] + b[i];
			} catch (Exception e) {
				if (a.length>b.length) {
					c[i]=a[i];
				} else {
					c[i]=b[i];
				}
			}
			 
		}

		System.out.println(Arrays.toString(c));
	}
}
