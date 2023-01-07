package arrays_programs;

public class First3MinNumbers {

	public static void main(String[] args) {
		int[] a = { 5,40, 30, 40, 30, 20, 5, 20, 10 ,10,5,6};

		int firstMin = a[0];
		int secondMin = a[1];
		int thirdMin = a[3];

		for (int i = 1; i < a.length; i++) {
			if (a[i] < firstMin) {
				thirdMin = secondMin;
				secondMin = firstMin;
				firstMin = a[i];
			} else if (a[i] < secondMin && a[i] > firstMin) {
				thirdMin = secondMin;
				secondMin = a[i];
			} else if (a[i] < thirdMin && a[i] > secondMin && a[i] > firstMin) {
				thirdMin = a[i];
			}
		}
		System.out.println("First Min Number = " + firstMin);
		System.out.println("second Min Number = " + secondMin);
		System.out.println("third min Number = " + thirdMin);

		// sum and product of 1st 3 small numbers
		int sum = firstMin + secondMin + thirdMin;
		int pro = firstMin * secondMin * thirdMin;
		;

		System.out.println("Sum = " + sum);
		System.out.println("Product = " + pro);
	}
}
