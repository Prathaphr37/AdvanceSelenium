package testScripts;

import org.testng.annotations.Test;

import com.LIMS.GenericUtility.BaseClass;

import objectRepositry.AddPaymentPage;
import objectRepositry.HomePage;
import objectRepositry.PaymentInformationPage;

public class PaymentModule extends BaseClass{

	@Test(groups="function")
	public void addPayment() throws Throwable {
		HomePage hp = new HomePage(driver);
		hp.clickOnPaymentLnk();
		
		PaymentInformationPage pip = new PaymentInformationPage(driver);
		pip.clickOnAddPaymentButton();
		
		AddPaymentPage AddPayment = new AddPaymentPage(driver);
		AddPayment.addPaymentPage(eLib.getList("payment"), driver);
		Thread.sleep(3000);
//		AddPayment.clickOnSubmitButtonToAddPayment();
	}
}
