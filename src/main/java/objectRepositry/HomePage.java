package objectRepositry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.LIMS.GenericUtility.ExcelUtility;


public class HomePage extends ExcelUtility{

	// declaration
	@FindBy(xpath = "//a[text()='Aegon Life']")
	private WebElement HomeLnk;

	@FindBy(xpath = "//input[@name='key']")
	private WebElement SearchBarTB;

	@FindBy(xpath = "//input[@class='searchBtn']")
	private WebElement SearchBtn;

	@FindBy(xpath = "//a[text()='CLIENTS']")
	private WebElement ClientLnk;

	@FindBy(xpath = "//a[text()='NOMINEE']")
	private WebElement NomineeLnk;

	@FindBy(xpath = "//a[text()='PAYMENTS']")
	private WebElement PaymentLnk;

	@FindBy(xpath = "//a[text()='AGENTS']")
	private WebElement AgentLnk;

	@FindBy(xpath = "//a[text()='POLICY']")
	private WebElement PolicyLnk;

	@FindBy(xpath = "//a[@class='btn btn-danger']")
	private WebElement LogoutBtn;

	// initialization
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// utilization
	public WebElement getHomeLnk() {
		return HomeLnk;
	}

	public WebElement getSearchBarTB() {
		return SearchBarTB;
	}

	public WebElement getSearchBtn() {
		return SearchBtn;
	}

	public WebElement getClientLnk() {
		return ClientLnk;
	}

	public WebElement getNomineeLnk() {
		return NomineeLnk;
	}

	public WebElement getPaymentLnk() {
		return PaymentLnk;
	}

	public WebElement getAgentLnk() {
		return AgentLnk;
	}

	public WebElement getPolicyLnk() {
		return PolicyLnk;
	}

	public WebElement getLogoutBtn() {
		return LogoutBtn;
	}

	// Business Libraries
	public void searchContact(String key) throws Throwable {
		SearchBarTB.sendKeys(key);
		Thread.sleep(3000);
		SearchBtn.click();
	}

	public void clickOnHomeLnk() {
		HomeLnk.click();
	}

	public void clickOnClientLnk() {
		ClientLnk.click();
	}

	public void clickOnNomineeLnk() {
		NomineeLnk.click();
	}

	public void clickOnPaymentLnk() {
		PaymentLnk.click();
	}

	public void clickOnAgentLnk() {
		AgentLnk.click();
	}

	public void clickOnPolicyLnk() {
		PolicyLnk.click();
	}

	public void clickOnLogoutBtn() {
		LogoutBtn.click();
	}
}
