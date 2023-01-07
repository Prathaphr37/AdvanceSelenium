package arrays_programs;

public class EvenElementReturn {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 5, 6, 8, 9, 7, 4, 10, 20, 30, 55, 53, 27, 16 };

		int res = evenElement(a);
		System.out.println("returned even element is " + res);
	}

	public static int evenElement(int[] b) {
		for (int i = 0; i < b.length; i++) {
			if (b[i] % 2 == 0) {
				return b[i];
			}
		}
		return -1;

	}
}
