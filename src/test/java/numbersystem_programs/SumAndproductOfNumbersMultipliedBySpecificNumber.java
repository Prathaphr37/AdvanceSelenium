package numbersystem_programs;

import java.util.Scanner;

public class SumAndproductOfNumbersMultipliedBySpecificNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the limit");
		int limit = sc.nextInt();
		System.out.println("enter the divisor number");
		int divisor = sc.nextInt();
		int sum = 0;
		int pro=1;
		for (int i = 1; i <= limit; i++) {

			if (i % divisor == 0) {
				sum+=i;
				pro*=i;
			}
		}
		System.out.println("Sum = "+sum);
		System.out.println("product = "+pro);
	}
}
