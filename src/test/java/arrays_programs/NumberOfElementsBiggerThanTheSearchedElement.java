package arrays_programs;

import java.util.Scanner;

public class NumberOfElementsBiggerThanTheSearchedElement {

	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 55, 2, 3, 5, 6, 8, 9, 7, 4, 53, 27, 16 };
		Scanner sc = new Scanner(System.in);
		System.out.println("search the element");
		int ele = sc.nextInt();
		int count=0;
		for (int i = 0; i < a.length; i++) {
			if (a[i]>ele) {
				count++;
			}
		}
		System.out.println(count+"  elements is bigger than "+ele);
		
	}
}
