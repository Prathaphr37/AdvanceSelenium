package objectRepositry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NomineeInformationPage {

	// declaration
	@FindBy(xpath = "//a[text()='Add Nominee']")
	private WebElement AddNomineeBtn;

	// initialization
	public NomineeInformationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// utilization
	public WebElement getAddNomineeBtn() {
		return AddNomineeBtn;
	}
	
	//Business Libraries
		public void clickOnNomineeButton() {
			AddNomineeBtn.click();
		}
}
