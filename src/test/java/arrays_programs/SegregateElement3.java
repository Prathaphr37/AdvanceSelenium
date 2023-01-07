package arrays_programs;

import java.util.Arrays;

//input=int[] a= {0,1,0,1,0,1,0,1,0,1,0,1};  output={0,0,0,0,0,1,1,1,1,1}
public class SegregateElement3 {

	public static void main(String[] args) {
		int[] a= {0,1,0,1,0,1,0,1,0,1,0,1};
		int[] b= new int[a.length];
		int m=0;
		int n=a.length-1;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i]==0) {
				b[m]=a[i];
				m++;
			} else {
				b[n]=a[i];
				n--;
			}
		}
		
		System.out.println(Arrays.toString(b));
	}
}
