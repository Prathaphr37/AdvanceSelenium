package arrays_programs;

public class OddElementArray {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 5, 6, 8, 9, 7, 4, 10, 20, 30, 17,13 };
		int oddSum = 0;
		int oddPro = 1;
		int oddCount = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				
			}
			else {
				System.out.println(a[i]);
				oddCount++;
				oddSum = oddSum + a[i];
				oddPro = oddPro * a[i];
			}
		}
		
		System.out.println("------------");
		System.out.println("Odd Count=" + oddCount);
		System.out.println("Odd Sum = " + oddSum);
		System.out.println("Odd Product = " + oddPro);
	}
}
