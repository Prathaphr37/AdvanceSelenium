package numbersystem_programs;

import java.util.Scanner;

import org.testng.annotations.Test;

public class SingleDigit {

	@Test
	public void singleDigit1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int a = sc.nextInt();

		if (a < 10) {
			System.out.println(a + " is single digit number");
		} else {
			System.out.println(a + " is not single digit number");
		}
	}

	@Test
	public void singleDigit2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int a = sc.nextInt();
		int n = a;
		int count = 0;
		while (n != 0) {
			count++;
			n /= 10;
		}
		if (count == 1) {
			System.out.println(a + " is single digit number");
		} else {
			System.out.println(a + " is not single digit number");
		}
	}
}
