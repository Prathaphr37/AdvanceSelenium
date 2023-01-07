package arrays_programs;

public class PrimeNumberArray {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 5, 6, 8, 9, 7, 4, 10, 20, 30, 55, 53, 27, 16 };
		int PrimeSum = 0;
		int PrimePro = 1;
		int PrimeCount = 0;
		for (int i = 0; i < a.length; i++) {
			int count=0;
			for (int j = 1; j < a[i]; j++) {
				if (a[i] % j == 0) {
					count++;
				}
			}
			if (count==1) {
				System.out.println(a[i]);
				PrimeCount++;
				PrimeSum=PrimeSum+a[i];
				PrimePro=PrimePro*a[i];
			}
			
		}
		System.out.println("------------");
		System.out.println("prime Count=" + PrimeCount);
		System.out.println("Prime Sum = " + PrimeSum);
		System.out.println("Prime Product = " + PrimePro);
	}
}
