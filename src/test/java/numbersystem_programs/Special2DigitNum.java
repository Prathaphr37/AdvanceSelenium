package numbersystem_programs;

import java.util.Scanner;

public class Special2DigitNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the 2 digit number");
		int n = sc.nextInt();
		
		int a=n%10;
		int b=n/10;
		
		int res=a+b+(a*b);
		
		if (res==n) {
			System.out.println(n+"  is special 2 digit number");
		} else {
			System.out.println(n+"  is not special 2 digit number");
		}
	}
}
