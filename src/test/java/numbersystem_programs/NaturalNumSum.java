package numbersystem_programs;

import java.util.Scanner;

public class NaturalNumSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the limit");
		int n = sc.nextInt();

		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + i;
		}
		System.out.println("Sum = " + sum);
	}
}
