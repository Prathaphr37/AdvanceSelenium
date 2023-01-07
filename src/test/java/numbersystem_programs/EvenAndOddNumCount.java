package numbersystem_programs;

import java.util.Scanner;

public class EvenAndOddNumCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the limit");
		int n = sc.nextInt();
		int evenCount=0;
		int oddCount=0;
		for (int i = 1; i <= n; i++) {

			if (i % 2 == 0) {
				evenCount++;
			}else {
				oddCount++;
			}
		}
		
		System.out.println("Even Count = "+evenCount);
		System.out.println("Odd Count = "+oddCount);
	}
}
