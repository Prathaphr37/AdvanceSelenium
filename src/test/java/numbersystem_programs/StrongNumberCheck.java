package numbersystem_programs;

import java.util.Scanner;

public class StrongNumberCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number ");
		int n = sc.nextInt();
		int temp = n;
		int sum = 0;

		while (n != 0) {
			int rem = n % 10;
			sum = sum + fact(rem);
			n /= 10;
		}

		if (temp == sum) {
			System.out.println(temp + "----->is strong number");
		} else {
			System.out.println(temp + "----->is not strong number");
		}

	}

	public static int fact(int a) {
		int fact = 1;
		for (int i = 1; i <= a; i++) {
			fact = fact * i;
		}
		return fact;
	}
}
