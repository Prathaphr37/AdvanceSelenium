package numbersystem_programs;

import java.util.Scanner;

public class FirstDigitOfNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		int temp = n;

		while (n != 0) {
			int rem = n % 10;
			if (n < 10) {
				System.out.println(rem + "----> is the first digit in " + temp);
			}
			n /= 10;
		}
	}

}
