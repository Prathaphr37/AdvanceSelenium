package numbersystem_programs;

import java.util.Scanner;

import org.testng.annotations.Test;

public class BigNumbers {

	@Test
	public void bigNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the 3 numbers to check big number");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (a > b && a > c) {
			System.out.println(a + " is big number");
		} else if (b > a && b > c) {
			System.out.println(b + " is big number");
		} else {
			System.out.println(c + " is big number");
		}
	}

	@Test
	public void smallNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the 3 numbers to check small number");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (a < b && a < c) {
			System.out.println(a + " is small number");
		} else if (b < a && b < c) {
			System.out.println(b + " is small number");
		} else {
			System.out.println(c + " is small number");
		}
	}

	@Test
	public void middleNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the 3 numbers to check middle number");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (a > b && a < c) {
			System.out.println(a + " is middle number");
		} else if (b > a && b < c) {
			System.out.println(b + " is middle number");
		} else if (c > a && c < b) {
			System.out.println(c + " is middle number");
		}
	}
}
