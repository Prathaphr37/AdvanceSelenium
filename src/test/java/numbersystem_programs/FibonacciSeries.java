package numbersystem_programs;

public class FibonacciSeries {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		
		System.out.print(a+" "+b);
		for (int i = 2; i < 10; i++) {
			int sum=a+b;
			a=b;
			b=sum;
			System.out.print(" "+sum);
		}
	}
}
