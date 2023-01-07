package numbersystem_programs;

import java.util.Scanner;

import org.testng.annotations.Test;

public class PrimeNumCountSumPro {

	@Test
	public void primePrint() {
		Scanner sc = new Scanner(System.in);
		System.out.println("----enter the limit-----");
		int n = sc.nextInt();
		
		int primeCount = 0;
		int primeSum = 0;
		int primeProduct = 1;
		
		for (int i = 1; i <= n; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;

				}
			}
			if (count == 2) {
				primeCount++;
				primeSum += i;
				primeProduct *= i;
			}
		}
		System.out.println("Prime Number Count = "+primeCount);
		System.out.println("Prime Number Sum = "+primeSum);
		System.out.println("Prime Number Product = "+primeProduct);
	}
}
