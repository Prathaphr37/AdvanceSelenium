package testScripts;

import org.testng.annotations.Test;

import com.LIMS.GenericUtility.BaseClass;

import objectRepositry.ClientInformationPage;
import objectRepositry.HomePage;


public class ClientStatusModule extends BaseClass{

	@Test(groups="login")
	public void viewStatus() throws Throwable {
		HomePage hp = new HomePage(driver);
		hp.clickOnClientLnk();
		
		ClientInformationPage cip = new ClientInformationPage(driver);
		cip.checkForClientStatus(driver);
	}
}
