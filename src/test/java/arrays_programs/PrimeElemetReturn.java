package arrays_programs;

public class PrimeElemetReturn {

	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 55,2, 3, 5, 6, 8, 9, 7, 4, 53, 27, 16 };

		int res = primeElement(a);
		System.out.println("returned prime element is " + res);
	}

	public static int primeElement(int[] b) {
		for (int i = 0; i < b.length; i++) {
			int count=0;
			for (int j = 1; j < b[i]; j++) {
				if (b[i] % j == 0) {
					count++;
				}
			}
			if (count==1) {
				return b[i];
			} 
		}
		return -1;

	}
}
