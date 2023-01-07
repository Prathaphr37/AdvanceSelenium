package numbersystem_programs;

import java.util.Scanner;

public class SumOfFirstAndLastDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		int temp = n;
		int sum = 0;
		while (temp != 0) {
			
			if (temp < 10 || temp == n) {
				int rem = temp % 10;
				sum += rem;
			}
			temp /= 10;
		}
		System.out.println("sum of 1st and last digit =" + sum);
	}

}
