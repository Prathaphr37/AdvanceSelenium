package string_programs;

public class SwapWordsWithoutUsingThirdVariable {

	public static void main(String[] args) {
		String a = "adarsh";
		String b = "prathap";

		System.out.println("before swapping ");
		System.out.println("a = " + a);
		System.out.println("b = " + b);

		a = a + b; // adarshprathap
		b = a.substring(0, a.length() - b.length());
		a = a.substring(b.length());
		System.out.println("after swapping ");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}
