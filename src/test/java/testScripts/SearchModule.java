package testScripts;

import org.testng.annotations.Test;

import com.LIMS.GenericUtility.BaseClass;

import objectRepositry.HomePage;


public class SearchModule extends BaseClass{

	@Test(groups="login")
	public void searchclient() throws Throwable {
		HomePage hp = new HomePage(driver);
		hp.searchContact(eLib.readDataFromExcelFile("searchClient", 0, 0));
	}
}
