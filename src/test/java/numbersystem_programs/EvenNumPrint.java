package numbersystem_programs;

import java.util.Scanner;

public class EvenNumPrint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the limit");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {

			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
}
