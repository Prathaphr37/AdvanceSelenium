package objectRepositry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentInformationPage {

	//declaration
	@FindBy(xpath="//a[text()='Add Payment']")
	private WebElement AddPaymentBtn;
	
	//initialization
	public PaymentInformationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//utilization
	public WebElement getAddPaymentBtn() {
		return AddPaymentBtn;
	}
	
	//Business Libraries
	public void clickOnAddPaymentButton() {
		AddPaymentBtn.click();
	}
}
