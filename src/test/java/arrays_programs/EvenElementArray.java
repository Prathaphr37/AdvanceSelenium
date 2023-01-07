package arrays_programs;

public class EvenElementArray {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 5, 6, 8, 9, 7, 4, 10, 20, 30, 55, 53, 27, 16 };
		int evenSum = 0;
		int evenPro = 1;
		int evenCount = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				System.out.println(a[i]);
				evenCount++;
				evenSum = evenSum + a[i];
				evenPro = evenPro * a[i];
			}
		}
		System.out.println("------------");
		System.out.println("Even Count=" + evenCount);
		System.out.println("Even Sum = " + evenSum);
		System.out.println("Even Product = " + evenPro);
	}
}
