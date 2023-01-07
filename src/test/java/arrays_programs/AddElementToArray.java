package arrays_programs;

import java.util.Arrays;
import java.util.Scanner;

public class AddElementToArray {

//	public static void main(String[] args) {
//		int[] a = new int[5];
//		a[0] = 10;
//		a[1] = 20;
//		a[2] = 30;
//		a[3] = 40;
//		a[4] = 50;
//		System.out.println(Arrays.toString(a));
//		for (int i = 0; i < a.length; i++) {
//			System.out.println(a[i]);
//		}
//	}

	//anoother way to add element to array dynamically
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int n = sc.nextInt();
		int[] a = new int[n];
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("enter the value for "+i+" th index");
			a[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
	}
}
