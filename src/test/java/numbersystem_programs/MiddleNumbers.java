package numbersystem_programs;

import java.util.Scanner;

public class MiddleNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		int temp = n;
		while (temp != 0) {
			int rem = temp % 10;
			if (temp < 10 || temp == n) {
				
			}else
			{
				System.out.println("Middle digit is  =" + rem);
			}
			temp /= 10;
		}
		
	}
}
