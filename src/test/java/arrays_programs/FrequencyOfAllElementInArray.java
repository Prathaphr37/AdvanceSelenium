package arrays_programs;

public class FrequencyOfAllElementInArray {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,2,1,3,4,5,6,1,2,4,6,3,9};
		for (int i = 0; i < a.length; i++) {
		
			int freq=0;
			for (int j = 0; j < a.length; j++) {
				if (a[i]==a[j]) {
					freq++;
				}
			} 
			System.out.println(a[i]+"  occurred "+freq);
		}
	}
}
