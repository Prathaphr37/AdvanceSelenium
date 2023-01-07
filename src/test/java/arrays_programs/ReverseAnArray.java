package arrays_programs;

import java.util.Arrays;

public class ReverseAnArray {
	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 55,2, 3, 5, 6, 8, 9, 7, 4, 53, 27, 16 };
		
		int[] rev=new int[a.length];
		
		for (int i = 0,j=a.length-1; i < rev.length; i++,j--) {
			rev[i]=a[j];
		}
		System.out.println("a array is---------->"+Arrays.toString(a));
		System.out.println("reversed  array is-->"+Arrays.toString(rev));
	}
}
