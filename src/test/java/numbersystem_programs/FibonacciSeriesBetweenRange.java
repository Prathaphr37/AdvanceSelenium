package numbersystem_programs;

import java.util.Scanner;

public class FibonacciSeriesBetweenRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the maximum range");
		int max = sc.nextInt();
		System.out.println("enter the minimum range");
		int min = sc.nextInt();

		int a = 0;
		int b = 1;

		if (min > max) {
			System.out.print(a + " " + b);
		}

		for (int i = 2; i < 10; i++) {
			int sum = a + b;
			a = b;
			b = sum;
			if (sum > min && sum < max) {
				System.out.print(" " + sum);
			}

		}
	}
}
