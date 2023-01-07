package numbersystem_programs;

import java.util.Scanner;

import org.testng.annotations.Test;

public class PrimePrint {

	@Test
	public void primePrint() {
		Scanner sc = new Scanner(System.in);
		System.out.println("----enter the limit-----");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2)
				System.out.println(i);

		}
	}

	//another way
	@Test
	public void primePrint2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("----enter the limit-----");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			int count = 0;
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 1)
				System.out.println(i);

		}
	}
}
