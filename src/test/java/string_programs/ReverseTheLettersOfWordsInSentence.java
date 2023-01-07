package string_programs;

public class ReverseTheLettersOfWordsInSentence {

	public static void main(String[] args) {
		String s = "prathap pramod naveen shivamma ramaiah madaiah madamma";
		
		String[] ch = s.split(" ");
		String rev ="";
		
		for (String lv : ch) {
			for (int i = lv.length()-1; i>=0; i--) {
				rev+=lv.charAt(i);
			}
			rev+=" ";
		}
		System.out.println(rev);
	}
	
	
	//another way
	
//	public static void main(String[] args) {
//		String s = "prathap pramod naveen shivamma ramaiah madaiah madamma";
//		
//		String[] ch = s.split(" ");
//		String rev ="";
//		
//		for (int j=0;j <ch.length;j++) {
//			String str = ch[j];
//			for (int i=str.length()-1;i>=0;i--) {
//				rev+=str.charAt(i);
//			}
//			rev+=" ";
//		}
//		System.out.println(rev);
//	}
}
