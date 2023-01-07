package string_programs;

public class ReverseTheSentenceAndWordSizeShouldBeSameAsOriginalStringInThatPosition1
{

	public static void main(String[] args) {
		String s1="i am prathap";
		
		String[] str = s1.split(" ");
		int size[] =new int[str.length];
		
		for (int i = 0; i < str.length; i++) {
			size[i]=str[i].length();
		}
		
		//size={1,2,7}
//		for (int i = 0; i < size.length; i++) {
//			System.out.println(size[i]);
//		}
		
		String s2="";
		
		for (int i = 0; i <str.length ; i++) {
			s2+=str[i];
		}
		//s2=iamprathap
//		System.out.println(s2);
		String s3="";
		for (int i = s2.length()-1; i >=0; i--) {
			s3+=s2.charAt(i);
		}
		//s3=pahtarpmai
//		System.out.println(s3);
		
		int k=0;
		String s4="";
		for (int i = 0; i < size.length; i++) {
			int n=size[i];
			while (n>0) {
				s4+=s3.charAt(k++);
				n--;
			}
			s4+=" ";
		}
		System.out.println(s4);
	}
}
