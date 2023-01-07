package numbersystem_programs;

import java.util.Scanner;

public class PerfectNumberCountSumPro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the limit");
		int limit = sc.nextInt();
		int perfectCount = 0;
		int perfectSum = 0;
		int perfectPro = 1;

		for (int i = 1; i <= limit; i++) {
			int sum = 0;
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					sum += j;
				}
			}

			if (i == sum) {
				System.out.println(i);
				perfectCount++;
				perfectSum += i;
				perfectPro *= i;
			}
		}

		System.out.println("------------");
		System.out.println("Perfect number count=" + perfectCount);
		System.out.println("perfect number sum =" + perfectSum);
		System.out.println("perfect number product =" + perfectPro);
	}
}
