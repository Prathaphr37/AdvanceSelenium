package numbersystem_programs;

import java.util.Scanner;

public class XylemPhloemNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		int temp = n;
		int extremeSum=0;
		int meanSum=0;
		while (temp != 0) {
			int rem = temp % 10;
			if (temp < 10 || temp == n) {
				extremeSum+=rem;
			}else
			{
				meanSum+=rem;
			}
			temp /= 10;
		}
		if (extremeSum==meanSum) {
			System.out.println(n+"----> is xylem number");
		} else {
			System.out.println(n+"----> is phloem number");
		}
	}
}
