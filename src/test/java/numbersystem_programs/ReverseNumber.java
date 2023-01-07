package numbersystem_programs;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value number");
		int n = sc.nextInt();
		int a = n;
		int rev = 0;
		while (a != 0) {
			int rem = a % 10;
			rev = rev * 10 + rem;
			a /= 10;
		}
		System.out.println("reverse of " + n + " is---> " + rev);
		System.out.println("----------");
		if (n == rev) {
			System.out.println(n + " is palindrome");
		} else {
			System.out.println(n + " is not palindrome");
		}
	}
}
