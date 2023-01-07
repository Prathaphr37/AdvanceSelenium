package pattern_programs_stars;
/* o/p
         *****
          ***
           *
 
 */
public class F2 {

	public static void main(String[] args) {
		int row =3;
		int chr = 5;
		int space = 0;
		
		for (int i = 0; i < row ; i++) {
			
			for (int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			
			for (int k = 0; k < chr; k++) {
				System.out.print("*");
			}
			
			System.out.println();
			space++;
			chr-=2;
		}
	}
}
