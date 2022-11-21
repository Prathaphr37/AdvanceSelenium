package objectRepositry;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.LIMS.GenericUtility.WebdriverUtility;


public class ClientInformationPage {

	// declaration
	@FindBy(xpath = "//a[text()='Add Client']")
	private WebElement AddClientBtn;

	@FindBy(xpath = "//td/following-sibling::td/a[.='Client Status']")
	private List<WebElement> StatusBtn;
	
	@FindBy(xpath="//td[.='Tisha Khan']/following-sibling::td/a[.='Edit']")
	private WebElement EditBtn;

	// initialization
	public ClientInformationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// utilization
	public WebElement getAddClientBtn() {
		return AddClientBtn;
	}

	public List<WebElement> getStatus() {
		return StatusBtn;
	}
	
	public WebElement getEditBtn() {
		return EditBtn;
	}
	

	// Business Libraries
	public void clickOnAddClientButton() {
		AddClientBtn.click();
	}

	public void clickOnEditButton() {
		EditBtn.click();
	}

	public void checkForClientStatus(WebDriver driver) throws Throwable {
		WebdriverUtility wLib = new WebdriverUtility();
		for (int i = 0; i < StatusBtn.size(); i++) {
			StatusBtn.get(i).click();
			Thread.sleep(2000);
			wLib.scrollBarAction(driver, 650);
			Thread.sleep(2000);
			wLib.scrollBarAction(driver, 1000);
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
		}
	}
}
