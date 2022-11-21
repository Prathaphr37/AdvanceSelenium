package testScripts;

import org.testng.annotations.Test;

import com.LIMS.GenericUtility.BaseClass;

import objectRepositry.ClientInformationPage;
import objectRepositry.EditClientPage;
import objectRepositry.HomePage;



public class EditModule extends BaseClass {

	@Test
	public void updateClient() throws Throwable {
		HomePage hp = new HomePage(driver);
		hp.clickOnClientLnk();
		
		ClientInformationPage cip = new ClientInformationPage(driver);
		cip.clickOnEditButton();
		
		EditClientPage edit = new EditClientPage(driver);
		edit.editClientDetails(driver);
//		edit.clickOnSubmitButtonToUpdateClient();
	}
}

