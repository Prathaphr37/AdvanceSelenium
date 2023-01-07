package numbersystem_programs;

import java.util.Scanner;

public class SmallestDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value number");
		int n = sc.nextInt();
		int smallest = 9;
		while (n != 0) {
			int rem = n % 10;
			n /= 10;
			if (rem < smallest) {
				smallest = rem;
			}
		}
		System.out.println("Smallest number = " + smallest);
	}
}
