package pattern_programs_stars;

import java.util.Scanner;
/*o/p    *
        ***
       *****
*/
public class F1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the row value");
		int row =sc.nextInt();
		System.out.println("enter the column value");
		int col =(row*2)-1;
		
		int chr = 1;
		int space = col/2;
		
		for (int i = 0; i < row ; i++) {
			
			for (int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			
			for (int k = 0; k < chr; k++) {
				System.out.print("*");
			}
			
			System.out.println();
			space--;
			chr+=2;
		}
	}
}
