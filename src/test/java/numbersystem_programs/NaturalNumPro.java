package numbersystem_programs;

import java.util.Scanner;

public class NaturalNumPro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the limit");
		int n = sc.nextInt();

		int pro = 1;
		for (int i = 1; i <= n; i++) {
			pro = pro * i;
		}
		System.out.println("Product = " + pro);
	}
}
