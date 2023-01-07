package string_programs;

public class DifferentTypeChararactersCount {

	public static void main(String[] args) {
		String s = "PRAthapHr@ 03 07 1998#%&";
		System.out.println(s);
		System.out.println(s.length());
		int uc = 0, lc = 0, splch = 0, num = 0;

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				uc++;
			} else if (ch >= 'a' && ch <= 'z') {
				num++;
			} else if (ch >= '0' && ch <= '9') {
				lc++;
			} else {
				splch++;
			}

		}
		System.out.println("upper case = " + uc);
		System.out.println("lower case = " + lc);
		System.out.println("numbers = " + num);
		System.out.println("special characters = " + splch);
	}
}
