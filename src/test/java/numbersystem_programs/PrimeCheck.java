package numbersystem_programs;

import java.util.Scanner;

import org.testng.annotations.Test;

public class PrimeCheck {

	@Test
	public void primeCheck1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("----enter the number------");
		int n = sc.nextInt();
		int count = 0;

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println(n + "  is prime number");
		} else {
			System.out.println(n + "  is consonant number OR not prime number");
		}
	}

	@Test
	public void primeCheck2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("-----enter the number----");
		int n = sc.nextInt();
		int count = 0;

		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count == 1) {
			System.out.println(n + "  is prime number");
		} else {
			System.out.println(n + "  is consonant number OR not prime number");
		}

	}
}
