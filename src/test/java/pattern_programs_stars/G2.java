package pattern_programs_stars;

import java.util.Scanner;

public class G2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the row value");
		int row =sc.nextInt();
		System.out.println("enter the column value");
		int col =sc.nextInt();
		int num=1;
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(num+" ");
			}
			System.out.println();
			num++;
		}
	}
}
