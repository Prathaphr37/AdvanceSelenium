package pattern_programs_stars;

public class C11 {

	public static void main(String[] args) {
		int row = 5;
		int col = 5;
		
		
		for (int i = 0; i < row; i++) {
			char ch='a';
			for (int j = 0; j < col; j++) {
			
				if (i<=j) {
					System.out.print(ch+" ");
					ch+=2;
				}
				else
					System.out.print("  ");
			}
			System.out.println();
			
		}
	}
}
