package pattern_programs_stars;

public class B16 {

	public static void main(String[] args) {
		int row=5;
		int col=5;
		
		
		for (int i = 0; i < row; i++) {
			char ch='a';
		
			for (int j = 0; j < col; j++) {
			
				if (i>=j)
				{
					System.out.print(ch+" ");
					ch++;
				}
				else
				      System.out.print(" ");
			}
			System.out.println();
		}
	}
}
