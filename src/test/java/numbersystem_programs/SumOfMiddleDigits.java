package numbersystem_programs;

import java.util.Scanner;

public class SumOfMiddleDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		int temp = n;
		int meanSum=0;
		while (temp != 0) {
			int rem = temp % 10;
			if (temp < 10 || temp == n) {
				
			}else
			{
				meanSum+=rem;
			}
			temp /= 10;
		}
		System.out.println("middle digit sum  =" + meanSum);
	}
}
