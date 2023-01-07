package numbersystem_programs;

import java.util.Scanner;

public class FactorialOfANum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int a = sc.nextInt();

		int fact = 1;
		for (int i = 1; i <= a; i++) {
			fact = fact * i;
		}
		System.out.println("factorial of " + a + " is-->" + fact);
	}
}
