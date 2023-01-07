package numbersystem_programs;

import java.util.Scanner;

public class NeonNumCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		int square = n * n;
		int sum = 0;
		while (square != 0) {
			int rem = square % 10;
			sum += rem;
			square /= 10;
		}

		if (n == sum) {
			System.out.println(n + "-----> is neon number");
		} else {
			System.out.println(n + "-----> is not neon number");
		}
	}
}
