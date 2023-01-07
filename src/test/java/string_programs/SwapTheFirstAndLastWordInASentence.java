package string_programs;

public class SwapTheFirstAndLastWordInASentence {

	public static void main(String[] args) {
		String s = "prathap pramod naveen shivamma ramaiah madaiah madamma";
		System.out.println("before reversing :" + s);

		String[] ch = s.split(" ");
		String temp = ch[0];
		ch[0] = ch[ch.length - 1];
		ch[ch.length - 1] = temp;
		
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]+" ");
		}
		
	}
}
