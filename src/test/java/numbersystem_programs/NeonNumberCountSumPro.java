package numbersystem_programs;

import java.util.Scanner;

public class NeonNumberCountSumPro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the limit");
		int limit = sc.nextInt();
		int neonCount = 0;
		int neonSum = 0;
		int neonPro = 1;
		for (int i = 1; i <= limit; i++) {
			int sum = 0;
			int square = i * i;

			while (square != 0) {
				int rem = square % 10;
				sum += rem;
				square /= 10;
			}

			if (i == sum) {
				System.out.println(i);
				neonCount++;
				neonSum += i;
				neonPro *= i;
			}
		}

		System.out.println("----------");
		System.out.println("neon number count=" + neonCount);
		System.out.println("neon number sum=" + neonSum);
		System.out.println("neon number product=" + neonPro);

	}
}
