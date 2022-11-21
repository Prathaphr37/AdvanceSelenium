package objectRepositry;

import java.util.Map;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AddPaymentPage {

	// declaration
	@FindBy(name = "client_id")
	private WebElement ClientidTB;

	@FindBy(name = "month")
	private WebElement MonthTB;

	@FindBy(name = "amount")
	private WebElement AmountTB;

	@FindBy(name = "due")
	private WebElement DueTB;

	@FindBy(name = "fine")
	private WebElement FineTB;

	@FindBy(name = "agent_id")
	private WebElement AgentidTB;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement SubmitBtn;

	// initialization
	public AddPaymentPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// utilization
	public WebElement getClientidTB() {
		return ClientidTB;
	}

	public WebElement getMonthTB() {
		return MonthTB;
	}

	public WebElement getAmountTB() {
		return AmountTB;
	}

	public WebElement getDueTB() {
		return DueTB;
	}

	public WebElement getFineTB() {
		return FineTB;
	}

	public WebElement getAgentidTB() {
		return AgentidTB;
	}

	public WebElement getSubmitBtn() {
		return SubmitBtn;
	}

	// Business Libraries
	public void addPaymentPage(Map<String, String> map,WebDriver driver) {
		for (Entry<String, String> set : map.entrySet()) {
			driver.findElement(By.name(set.getKey())).sendKeys(set.getValue());
		}
	}

	public void clickOnSubmitButtonToAddPayment() {
		SubmitBtn.click();
	}
}
