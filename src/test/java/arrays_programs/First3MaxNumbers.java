package arrays_programs;

public class First3MaxNumbers {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 40, 30, 40,30,20,5, 20, 10 };
		
		int firstMax=a[0];
		int secondMax=a[0];
		int thirdMax=a[0];
		
		for (int i = 1; i < a.length; i++) {
			if (a[i]>firstMax) {
				thirdMax=secondMax;
				secondMax=firstMax;
				firstMax=a[i];
			} else if(a[i]>secondMax&&a[i]<firstMax){
				thirdMax=secondMax;
				secondMax=a[i];
			}else if(a[i]>thirdMax&&a[i]<secondMax&&a[i]<firstMax) {
				thirdMax=a[i];
			}
		}
		System.out.println("First max Number = "+firstMax);
		System.out.println("second max Number = "+secondMax);
		System.out.println("third max Number = "+thirdMax);
		
		// sum and product of 1st 3 big numbers
		int sum = firstMax+secondMax+thirdMax;
		int pro = firstMax*secondMax*thirdMax;;
		
		System.out.println("Sum = " + sum);
		System.out.println("Product = " + pro);
	}
}
