package arrays_programs;

public class VowelArray {

	public static void main(String[] args) {
		char[] arr= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u'};
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u') {
				System.out.println(arr[i]+"  is vowel ");
			}
		}
		
	}
}
