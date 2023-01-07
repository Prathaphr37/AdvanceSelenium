package numbersystem_programs;

import java.util.Scanner;

public class StrongNumberCountSumProduct {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the limit ");
		int limit = sc.nextInt();
		int strongSum = 0;
		int strongCount = 0;
		int strongProduct = 1;

		for (int i = 1; i <= limit; i++) {
			int sum = 0;
			int temp = i;
			while (temp != 0) {

				int rem = temp % 10;
				sum = sum + fact(rem);
				temp /= 10;
			}
			
			if (i == sum) {
				System.out.println(i);
				strongSum += i;
				strongProduct *= i;
				strongCount++;
			}
		}
		System.out.println("-----------");
		System.out.println("strong Sum = " + strongSum);
		System.out.println("strong product = " + strongProduct);
		System.out.println("strong count = " + strongCount);

	}

	public static int fact(int a) {
		int fact = 1;
		for (int i = 1; i <= a; i++) {
			fact = fact * i;
		}
		return fact;
	}
}
