package numbersystem_programs;

import java.util.Scanner;

public class EvenDigitInNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value number");
		int n = sc.nextInt();
		int evenCount = 0;
		int oddCount = 0;
		int evenSum = 0;
		int evenPro = 1;
		int oddSum = 0;
		int oddPro = 1;
		while (n != 0) {
			int rem = n % 10;
			if (n % 2 == 0) {
				evenCount++;
				evenSum += rem;
				evenPro *= rem;

			} else {
				oddCount++;
				oddSum += rem;
				oddPro *= rem;
			}
			n /= 10;

		}

		System.out.println("------------");
		System.out.println("even digit count=" + evenCount);
		System.out.println("even sum=" + evenSum);
		System.out.println("even product=" + evenPro);
		System.out.println("-------------");
		System.out.println("odd digit count=" + oddCount);
		System.out.println("divisors sum =" + oddSum);
		System.out.println("divisors product =" + oddPro);
	}
}
