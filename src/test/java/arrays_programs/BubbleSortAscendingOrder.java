package arrays_programs;

import java.util.Arrays;
//it is not applicable if there is duplicate values in array
public class BubbleSortAscendingOrder {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 40, 30, 5, 20, 10 };
		System.out.println("a array before sorting is-->" + Arrays.toString(a));

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {

				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			}
		}
		System.out.println("a array after sorting is-->" + Arrays.toString(a));

		// to get first 3 small numbers
		System.out.println("1st 3 small numbers below");
		for (int i = 0; i < 3; i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("-----------");

		// sum and product of 1st 3 small numbers
		int sum = 0;
		int pro = 1;
		for (int i = 0; i < 3; i++) {
			sum += a[i];
			pro *= a[i];
		}
		System.out.println("Sum = " + sum);
		System.out.println("Product = " + pro);
	}
}
