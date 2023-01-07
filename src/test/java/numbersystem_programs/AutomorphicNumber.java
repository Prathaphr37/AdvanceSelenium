package numbersystem_programs;

import java.util.Scanner;

public class AutomorphicNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		
		boolean res = automorphicNumber(n);
		if (res) {
			System.out.println(n+"-----> is autmorphic number");
		} else {
			System.out.println(n+"-----> is not autmorphic number");
		}
	}

	public static boolean automorphicNumber(int a) {
		int square=a*a;
		
		while (a>0) {
			if (a%10!=square%10) {
				return false;
			} 
			a/=10;
			square/=10;
		}
		return true;
	}
}
