package string_programs;

public class SumOfNumbersInString {

	public static void main(String[] args) {
		String s = "a12c21dr423";

		int sum = 0;
		int tempSum = 0;

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (ch >= '0' && ch <= '9') {
				int n = ch - 48;
				System.out.println(n);
				tempSum = tempSum * 10 + n;
			} else {
				sum = sum + tempSum;
				tempSum = 0;
			}
		}
		sum = sum + tempSum;
		System.out.println("sum = " + sum);
	}
}
