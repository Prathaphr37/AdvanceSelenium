package string_programs;

public class Segregate {

	public static void main(String[] args) {
		String s="!@2#H^&A3b5c*/?1";
		String alp="";
		String splchr="";
		String num="";
		
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch>='A'&&ch<='Z'||ch>='a'&&ch<='z') {
				alp+=ch;
			} else if(ch>='0'&&ch<='9'){
				num+=ch;
			}else
			{
				splchr+=ch;
			}	
		}
		System.out.println(alp+num+splchr);
	}
}
