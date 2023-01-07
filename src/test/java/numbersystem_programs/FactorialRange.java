package numbersystem_programs;

import java.util.Scanner;

public class FactorialRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int a = sc.nextInt();

		for (int i = 1; i <= a; i++) {
			int fact = 1;
			for (int j = 1; j <= i; j++) {
				fact = fact * j;
			}
			System.out.println("factorial of " + i + " is-->" + fact);
		}

	}
}
