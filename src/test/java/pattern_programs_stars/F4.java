package pattern_programs_stars;
/*   o/p
 
  *
 **
***
 **
  *

 */
public class F4 {

	public static void main(String[] args) {
		int row = 5;
		int col = 3;
		
		int chr = 1;
		int space = 2;
		
		for (int i = 0; i < row ; i++) {
			
			for (int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			
			for (int k = 0; k < chr; k++) {
				System.out.print("*");
			}
			
			System.out.println();
			if (i<row/2) {
				chr++;
				space--;
			} else {
				chr--;
				space++;
			}
		}
	}
}
