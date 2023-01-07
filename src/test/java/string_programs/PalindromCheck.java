package string_programs;

public class PalindromCheck {

	public static void main(String[] args) {
		String s="nayan";
		String rev="";
		
		for (int i = s.length()-1; i >=0 ; i--) {
			char ch = s.charAt(i);
			rev+=ch;
		}
		if (s.equalsIgnoreCase(rev)) {
			System.out.println(rev+"  is palindrome");
		}else
		{
			System.out.println(rev+"  is not palindrome");
		}
		
	}
}
