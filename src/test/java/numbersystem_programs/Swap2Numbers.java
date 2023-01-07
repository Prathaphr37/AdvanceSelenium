package numbersystem_programs;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Swap2Numbers {

	@Test
	public void withThirdVariable() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value for a");
		int a = sc.nextInt();
		System.out.println("enter value for b");
		int b = sc.nextInt();

		System.out.println("before swapping : "+"a="+a +"  "+"b="+ b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("after swapping : "+"a="+a +"  "+"b="+b);
	}
}
