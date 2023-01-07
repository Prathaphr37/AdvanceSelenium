package string_programs;

public class BalanceCheck {

	public static void main(String[] args) {
		String s = "{[<()>]}";
		boolean flag = true;
		int a = 0;
		int b = s.length() - 1;

		for (int i = 0, j = s.length() - 1; i < s.length()/2; i++, j--) {
			int c = s.charAt(i);
			int d = s.charAt(j);

			if (c == (d - 1) || c == (d - 2)) {
			} else {
				flag = false;
			}
		}
		if (flag) {
			System.out.println(s + "  balanced");
		} else {
			System.out.println(s + "  unbalanced");
		}
	}
}
