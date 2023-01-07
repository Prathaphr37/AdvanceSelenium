package arrays_programs;

public class RemoveDuplicateElementInArray {

	public static void main(String[] args) {
		int[] a = { 1, 2, 1, 3, 2, 40, 5, 10, 20, 30, 5, 2, 3, 1, 10, 20, 10, 30, 20 };

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					a[j] = 100;
				}
			}

			if (a[i] != 100) {
				System.out.print(a[i] + " ");
			}
		}
	}
}
