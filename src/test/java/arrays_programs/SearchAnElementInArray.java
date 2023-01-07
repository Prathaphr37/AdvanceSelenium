package arrays_programs;

import java.util.Scanner;

public class SearchAnElementInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = { 10, 20, 30, 55, 2, 3, 5, 6, 8, 9, 7, 4, 53, 27, 16 };
		System.out.println("search the element");
		int ele = sc.nextInt();
		 boolean res = search(a, ele);
		 if (res) {
			System.out.println(ele+"  is found");
		} else {
			System.out.println(ele+"  is not found");
		}
	}

	public static boolean search(int[] b, int c) {
		for (int i = 0; i < b.length; i++) {
			if (b[i]==c) {
				return true;
			}
		}
		
		return false;
		
	}
}
