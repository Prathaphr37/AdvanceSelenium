package arrays_programs;

public class OddElementReturn {

	public static void main(String[] args) {
		int[] a = {  2, 3, 5, 6, 8, 9, 7, 4, 10, 20, 30, 55, 53, 27, 16 };

		int res = oddElement(a);
		System.out.println("returned odd element is " + res);
	}

	public static int oddElement(int[] b) {
		for (int i = 0; i < b.length; i++) {
			if (b[i] % 2 == 0) {
				
			}else
			{
				return b[i];
			}
		}
		return -1;

	}
}
