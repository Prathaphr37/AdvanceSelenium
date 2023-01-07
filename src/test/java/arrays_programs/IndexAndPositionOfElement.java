package arrays_programs;

import java.util.Scanner;

public class IndexAndPositionOfElement {

	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 55, 2, 3, 5, 6, 8, 9, 7, 4, 53, 27, 16 };
		Scanner sc = new Scanner(System.in);
		System.out.println("search the element");
		int ele = sc.nextInt();
		
		int res = index(a,ele);
		int position=res+1;
		System.out.println("index of "+ele+" is "+res);
		System.out.println("position of "+ele+" is "+position);
		
	}
	
	public static int index(int[] x,int b) {
		for (int i = 0; i < x.length; i++) {
			if (x[i]==b) {
				return i;
			}
		}
		return -1;
	}
}
