package numbersystem_programs;

import java.util.Scanner;

public class HappyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		int temp = n;
		int sum = 0;
		while (n > 1) {
			sum = 0;
			while (n != 0) {
				int rem = n % 10;
				sum = sum + (rem * rem);
				n /= 10;
			}
			if (sum >= 1 && sum < 10) {
				n = sum;
				break;
			}
		}
		if (n == 1) {
			System.out.println(temp + "-----> is happy number");
		} else {
			System.out.println(temp + "-----> is sad number");
		}
	}

}
