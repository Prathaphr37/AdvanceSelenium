package testScripts;

import org.testng.annotations.Test;

import com.LIMS.GenericUtility.BaseClass;

public class LoginAndLogout extends BaseClass {

	@Test(groups="function")
	public void login() {
		System.out.println("Login Completed");
	}
}
