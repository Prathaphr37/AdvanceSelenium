package numbersystem_programs;

import java.util.Scanner;

public class DivisorsSumCountProduct {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value number");
		int n = sc.nextInt();
		int count = 0;
		int sum = 0;
		int pro = 1;

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.println(i);
				count++;
				sum += i;
				pro *= i;
			}
		}

		System.out.println("------------");
		System.out.println("divisors count=" + count);
		System.out.println("divisors sum =" + sum);
		System.out.println("divisors product =" + pro);
	}
}
