package numbersystem_programs;

import java.util.Scanner;

public class BiggestDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value number");
		int n = sc.nextInt();
		int biggest = 0;
		while (n != 0) {
			int rem = n % 10;
			n /= 10;
			if (rem > biggest) {
				biggest = rem;
			}
		}
		System.out.println("Smallest number = " + biggest);
	}
}
