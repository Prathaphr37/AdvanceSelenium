package numbersystem_programs;

import java.util.Scanner;

public class DisariumNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		int temp = n;
		int dC = digitCount(n);
		int sum = 0;
		while (n != 0) {
			int rem = n % 10;
			sum = sum + power(rem, dC);
			dC--;
			n /= 10;
		}

		if (sum == temp) {
			System.out.println(temp + "  is disarium number");
		} else {
			System.out.println(temp + "  is not disarium number");
		}
	}

	public static int power(int rem, int dC) {
		int pow = 1;
		while (dC > 0) {
			pow = pow * rem;
			dC--;
		}
		return pow;
	}

	public static int digitCount(int a) {
		int count = 0;
		while (a != 0) {
			count++;
			a /= 10;
		}
		return count;
	}
}
