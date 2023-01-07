package arrays_programs;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 55, 2, 3, 5, 6, 8, 9, 7, 4, 53, 27, 16 };
		Scanner sc = new Scanner(System.in);
		System.out.println("search the element");
		int ele = sc.nextInt();
		 boolean res = linearSearch(a, ele);
		 if (res) {
			System.out.println(ele+"  is found");
		} else {
			System.out.println(ele+"  is not found");
		}
		 System.out.println(Arrays.toString(a));
	}

	public static boolean linearSearch(int[] b, int c) {
		for (int i = 0; i < b.length; i++) {
			if (b[i]==c) {
				return true;
			}
		}
		
		return false;
		
	}
}
