package arrays_programs;

import java.util.Arrays;
import java.util.Scanner;

public class CopyAnArray {

	public static void main(String[] args) {
		int[] a = new int[5];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		int[] b=a;
		System.out.println("a array is -->"+Arrays.toString(a));
		System.out.println("b array is -->"+Arrays.toString(b));
		System.out.println("b array is");
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}

	//anoother way to add element to array dynamically
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter the size of the array");
//		int n = sc.nextInt();
//		int[] a = new int[n];
//		
//		for (int i = 0; i < a.length; i++) {
//			System.out.println("enter the value for "+i+" th index");
//			a[i]=sc.nextInt();
//		}
//		int[] b=new int[a.length];
//		for (int i = 0; i < b.length; i++) {
//			b[i]=a[i];
//		}
//		
//		System.out.println("a array is -->"+Arrays.toString(a));
//		System.out.println("b array is -->"+Arrays.toString(b));
//	}
}
