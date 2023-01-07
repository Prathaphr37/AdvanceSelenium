package string_programs;

public class ReverseTheSentence {

	public static void main(String[] args) {
		String s="prathap pramod naveen shivamma ramaiah madaiah madamma";
		System.out.println("before reversing :"+s);
		
		String[] ch = s.split(" ");
		String rev="";
		
		for (int i = ch.length-1; i >=0 ; i--) {
			rev+=ch[i]+" ";
		}
		System.out.println("after reversing :"+rev);
	}
}
