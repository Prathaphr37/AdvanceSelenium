package numbersystem_programs;

import java.util.Scanner;

public class CountNumbersMultipliedBySpecificNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the limit");
		int limit = sc.nextInt();
		System.out.println("enter the divisor number");
		int divisor = sc.nextInt();
		int count = 0;
		for (int i = 1; i <= limit; i++) {

			if (i % divisor == 0) {
				count++;
			}
		}
		System.out.println("numbers devided by  "+divisor +"  is ------>"+count);
	}
}
