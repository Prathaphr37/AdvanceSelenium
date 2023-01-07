package numbersystem_programs;

import java.util.Scanner;

public class SumAndProductOfDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value number");
		int n = sc.nextInt();
		int count = 0;
		int sum = 0;
		int pro = 1;
		while (n != 0) {
			count++;
			int rem = n % 10;
			sum = sum + rem;
			pro = pro * rem;
			n /= 10;
		}
		System.out.println("Digit count = " + count);
		System.out.println("Sum = " + sum);
		System.out.println("Product = " + pro);
	}
}
