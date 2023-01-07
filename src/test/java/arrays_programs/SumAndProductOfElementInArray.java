package arrays_programs;

public class SumAndProductOfElementInArray {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 5, 6, 8, 9, 7, 4 };

		// used to get length of an array
		System.out.println("length = " + a.length);

		int sum = 0;
		int pro = 1;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
			pro = pro * a[i];
		}
		System.out.println("Sum = " + sum);
		System.out.println("Product = "+pro);
	}
}
