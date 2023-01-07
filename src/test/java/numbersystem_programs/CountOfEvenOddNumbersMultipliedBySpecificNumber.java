package numbersystem_programs;

import java.util.Scanner;

public class CountOfEvenOddNumbersMultipliedBySpecificNumber {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the limit");
		int limit = sc.nextInt();
		System.out.println("enter the divisor number");
		int divisor = sc.nextInt();
		int evenCount = 0;
		int oddCount=0;
		for (int i = 1; i <= limit; i++) {

			if (i % divisor == 0) {
				if (i%2==0) {
					evenCount++;
				} else {
					oddCount++;
				}
			}
		}
		System.out.println("Even Count of devided by "+divisor+" is  = "+evenCount);
		System.out.println("Odd Count of devided by "+divisor+" is  = "+oddCount);
	}
	
}
