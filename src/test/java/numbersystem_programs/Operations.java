package numbersystem_programs;

import java.util.Scanner;

public class Operations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value for a");
		int a = sc.nextInt();
		System.out.println("enter value for b");
		int b = sc.nextInt();

		int sum = a + b;
		int diff = a - b;
		int mul = a * b;
		int div = a / b;
		int rem = a % b;

		System.out.println(sum);
		System.out.println(diff);
		System.out.println(mul);
		System.out.println(div);
		System.out.println(rem);

	}
}
