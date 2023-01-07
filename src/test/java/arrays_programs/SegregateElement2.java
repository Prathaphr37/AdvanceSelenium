package arrays_programs;

import java.util.Arrays;
//input=int[] a= {0,1,0,1,0,1,0,1,0,1,0,1};  output={1,1,1,1,1,0,0,0,0,0}
public class SegregateElement2 {

	public static void main(String[] args) {
		int[] a= {0,1,0,1,0,1,0,1,0,1,0,1};
		int count=0;
		for (int i = 0; i < a.length; i++) {
			if (a[i]==1) {
				count++;
			}
		}
		for (int i = 0; i < count; i++) {
			a[i]=1;
		}
		for (int i = count; i < a.length; i++) {
			a[i]=0;
		}
		
		System.out.println(Arrays.toString(a));
	}
}
