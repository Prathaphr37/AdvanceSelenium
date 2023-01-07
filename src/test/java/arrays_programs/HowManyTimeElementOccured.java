package arrays_programs;

public class HowManyTimeElementOccured {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,2,1,3,4,5,6,1,2,4,6,3,9};
		int number=1;
		occurence(a,number);
	}
	public static void occurence(int[] x, int b) {
		int count=0;
		for (int j = 0; j < x.length; j++) {
			if (x[j]==b) {
				count++;
			}
		}
		System.out.println(b+"=occurred--"+count+"---->times");
		
	}
}
