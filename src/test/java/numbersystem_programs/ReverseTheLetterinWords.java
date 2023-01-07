package numbersystem_programs;

import java.util.ArrayList;

public class ReverseTheLetterinWords {

	public static void main(String[] args) {
		String s="i am prathap";
		String[] s2 = s.split(" ");
		
		//store  the length of the particular words in array list
		ArrayList<Object> list = new ArrayList<>();
		for (int i = 0; i < s2.length; i++) {
			list.add(s2[i].length());
		}
		String s3="";
		for (int i = 0; i <s.length() ; i++) {
			s3=s3+s.charAt(i);
		}
		System.out.println(s3);
		
		for (int i = 0; i < list.size(); i++) {
		}
	}
}
