package numbersystem_programs;

import java.util.Scanner;

//program for print 1 To N natural number
public class NaturalNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the limit");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println(i);
		}
	}
}
