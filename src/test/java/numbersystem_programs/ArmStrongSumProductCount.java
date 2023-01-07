package numbersystem_programs;

import java.util.Scanner;

public class ArmStrongSumProductCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the limit");
		int limit = sc.nextInt();
		int armCount=0;
		int armSum=0;
		int armPro=1;
		
		for (int i = 1; i <= limit; i++) {
			int temp = i;
			int dC = digitCount(i);
			int sum = 0;
			while (temp != 0) {
				int rem = temp % 10;
				sum = sum + power(rem, dC);
				temp /= 10;
			}

			if (sum == i) {
				System.out.println(i);
				armCount++;
				armSum+=i;
				armPro*=i;
			}

		}
		System.out.println("------------");
		System.out.println("arm strong count ="+armCount);
		System.out.println("arm strong sum ="+armSum);
		System.out.println("arm strong Product ="+armPro);
		
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
