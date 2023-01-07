package string_programs;

public class ReverseWord {

	public static void main(String[] args) {
		String s="prathap";
		System.out.println("before reversing :"+s);
		String rev="";
		
		for (int i = s.length()-1; i >=0 ; i--) {
			char ch = s.charAt(i);
			rev+=ch;
		}
		System.out.println("after reversing :"+rev);
	}
	
//	public static void main(String[] args) {
//		String s="prathap";
//		System.out.println("before reversing :"+s);
//		String rev="";
//		
//		for (int i = 0; i < s.length(); i++) {
//			char ch = s.charAt(i);
//			rev=ch+rev;
//		}
//		System.out.println("after reversing :"+rev);
//	}
}
