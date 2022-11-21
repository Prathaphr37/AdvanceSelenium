package batch;

import java.util.Properties;

public class P1 {
	public static void main(String[] args) {

		Properties pobj = new Properties();
		String BROWSER = pobj.getProperty("browser");
		String URL = pobj.getProperty("url");
		String USERNAME = pobj.getProperty("username");
		String PASSWORD = pobj.getProperty("password");

		System.out.println(BROWSER);
		System.out.println(URL);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);

	}
}
