package pattern_programs_stars;

public class B17 {

	public static void main(String[] args) {
		int row = 7;
		int col = 7;
		char ch = 'a';

		for (int i = 0; i < row; i++) {

			for (int j = 0; j < col; j++) {

				if (i >= j) {
					if (ch < 'z') {
						System.out.print(ch + " ");
						ch += 2;
					} else {
						ch = 'a';
						System.out.print(ch + " ");
						ch += 2;
					}

				} else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
