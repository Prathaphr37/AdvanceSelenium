package arrays_programs;

import java.util.Scanner;

public class BinarySearch {
//, 55, 2, 3, 5, 6, 8, 9, 7, 4, 53, 27, 16
	public static void main(String[] args) {
		int[] a = { 10, 20, 30 };

		Scanner sc = new Scanner(System.in);
		System.out.println("search the element");
		int ele = sc.nextInt();
		int start = 0;
		int end = a.length - 1;

		while (start <= end) {
			
			int mid = (start + end) / 2;
			
			if (ele == a[mid]) {
				System.out.println(ele + " ----->is found");
				return;
			} else if (ele > a[mid]) {
				start = mid + 1;
			} else if(ele<a[mid]){
				end = mid - 1;
			}
		}
		System.out.println(ele+" ----> is not found");
	}

}
