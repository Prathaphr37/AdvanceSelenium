package pattern_programs_stars;

import java.util.Scanner;

/* 
o/p           *   ( condition is   "i+j == row-1")
            * 
          * 
        * 
      *  
*/
public class A2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the row value");
		int row =sc.nextInt();
		System.out.println("enter the column value");
		int col =sc.nextInt();
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
			
				if (i+j==row-1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
