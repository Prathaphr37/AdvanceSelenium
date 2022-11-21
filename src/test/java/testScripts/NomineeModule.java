package testScripts;

import org.testng.annotations.Test;

import com.LIMS.GenericUtility.BaseClass;

import objectRepositry.AddNomineePage;
import objectRepositry.HomePage;
import objectRepositry.NomineeInformationPage;


public class NomineeModule extends BaseClass {

	@Test(groups="integration")
	public void addNominee() throws Throwable {
		HomePage hp = new HomePage(driver);
		hp.clickOnNomineeLnk();
		
		NomineeInformationPage nip = new NomineeInformationPage(driver);
		nip.clickOnNomineeButton();
		
		AddNomineePage AddNominee = new AddNomineePage(driver);
		
//		To fail the script
//		Assert.fail();
		
		AddNominee.addNomineepage(eLib.getList("Sheet2"), driver);
		Thread.sleep(3000);
//		AddNominee.clickOnSubmitButtonToAddNominee();
	}
}
