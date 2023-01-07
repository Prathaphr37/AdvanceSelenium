package numbersystem_programs;

import java.util.Scanner;

import org.testng.annotations.Test;

public class TwoDigit {

	@Test
	public void twoDigit1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int a = sc.nextInt();

		if (a > 10 && a < 100) {
			System.out.println(a + " is double digit number");
		} else {
			System.out.println(a + " is not double digit number");
		}
	}

	@Test
	public void twoDigit2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int a = sc.nextInt();
		int n = a;
		int count = 0;
		while (n != 0) {
			count++;
			n /= 10;
		}
		if (count == 2) {
			System.out.println(a + " is double digit number");
		} else {
			System.out.println(a + " is not double digit number");
		}
	}

}
