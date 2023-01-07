package pattern_programs_stars;
/* o/p
 
    *
    **
    ***
    **
    *

 */
public class F5 {

	public static void main(String[] args) {
		int row = 5;
		int col = 3;
		
		int chr = 1;
		int space = 2;
		
		for (int i = 0; i < row ; i++) {
			
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
