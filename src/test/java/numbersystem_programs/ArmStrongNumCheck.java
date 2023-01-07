package numbersystem_programs;

import java.util.Scanner;

public class ArmStrongNumCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int a = sc.nextInt();
		int temp = a;
		int dC = digitCount(a);
		int sum = 0;
		while (temp != 0) {
			int rem = temp % 10;
			sum = sum + power(rem, dC);
			temp/=10;
		}
		
		if (sum==a) {
			System.out.println(a+"-----> is Arm Strong Number");
		} else {
			System.out.println(a+"-----> is not Arm Strong Number");
		}
	}

	public static int digitCount(int a) {
		int count = 0;
		while (a != 0) {
			count++;
			a /= 10;
		}
		return count;
	}

	public static int power(int rem, int dC) {
		int pow = 1;
		while (dC > 0) {
			pow = pow * rem;
			dC--;
		}
		return pow;
	}
}
