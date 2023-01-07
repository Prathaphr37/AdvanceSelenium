package numbersystem_programs;

import java.util.Scanner;

import org.testng.annotations.Test;

public class ThreeDigit {

	@Test
	public void threeDigit1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int a = sc.nextInt();

		if (a >= 100 && a < 1000) {
			System.out.println(a + " is three digit number");
		} else {
			System.out.println(a + " is not three digit number");
		}
	}

	@Test
	public void threeDigit2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int a = sc.nextInt();
		int n = a;
		int count = 0;
		while (n != 0) {
			count++;
			n /= 10;
		}
		if (count == 3) {
			System.out.println(a + " is three digit number");
		} else {
			System.out.println(a + " is not three digit number");
		}
	}

}
