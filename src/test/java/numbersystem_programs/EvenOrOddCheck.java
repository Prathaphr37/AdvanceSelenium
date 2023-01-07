package numbersystem_programs;

import java.util.Scanner;

public class EvenOrOddCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();

		if (n % 2 == 0)
			System.out.println(n + "  is even number");
		else
			System.out.println(n + "  is odd number");
	}
}
