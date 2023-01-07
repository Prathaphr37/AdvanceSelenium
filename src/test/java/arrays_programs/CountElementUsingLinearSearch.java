package arrays_programs;

import java.util.Scanner;

public class CountElementUsingLinearSearch {

	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 55, 2, 3, 5, 6, 8, 9, 7, 4, 53, 10, 30, 27, 16 };
		Scanner sc = new Scanner(System.in);
		System.out.println("search the element");
		int ele = sc.nextInt();
		linearSearch(a, ele);
	}

	public static void linearSearch(int[] b, int c) {
		int count=0;
		for (int i = 0; i < b.length; i++) {
			if (b[i] == c) {
				count++;
			}
		}
		System.out.println(c+" = occurred "+count+"---->times");

	}
}
