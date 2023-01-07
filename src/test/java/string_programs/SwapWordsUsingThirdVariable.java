package string_programs;

public class SwapWordsUsingThirdVariable {

	public static void main(String[] args) {
		String s1="adarsh";
		String s2="prathap";
		System.out.println("before swapping ");
		System.out.println("s1 = "+s1);
		System.out.println("s2 = "+s2);
		
		String s3=s1;
		s1=s2;
		s2=s3;
		
		System.out.println("after swapping ");
		System.out.println("s1 = "+s1);
		System.out.println("s2 = "+s2);
	}
}
