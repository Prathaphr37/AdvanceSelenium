package objectRepositry;

import java.util.Map;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.LIMS.GenericUtility.ExcelUtility;


public class EditClientPage {

//	declaration
	@FindBy(name="client_id")
	private WebElement ClientIdTB;
	
	@FindBy(name="client_password")
	private WebElement ClientPwdTB;
	
	@FindBy(name="name")
	private WebElement NameTB;
	
	@FindBy(name="sex")
	private WebElement GenderTB;
	
	@FindBy(name="birth_date")
	private WebElement DobTB;
	
	@FindBy(name="marital_status")
	private WebElement MaritalStatusTB;
	
	@FindBy(name="nid")
	private WebElement NidTB;
	
	@FindBy(name="phone")
	private WebElement PhoneTB;
	
	@FindBy(name="address")
	private WebElement AddressTB;
	
	@FindBy(name="policy_id")
	private WebElement PolicyIdTB;
	
	@FindBy(name="agent_id")
	private WebElement AgentIdTB;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement SubmitBtn;
	
	
//	initialization
	public EditClientPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getClientIdTB() {
		return ClientIdTB;
	}

	public WebElement getClientPwdTB() {
		return ClientPwdTB;
	}

	public WebElement getNameTB() {
		return NameTB;
	}

	public WebElement getGenderTB() {
		return GenderTB;
	}

	public WebElement getDobTB() {
		return DobTB;
	}

	public WebElement getMaritalStatusTB() {
		return MaritalStatusTB;
	}

	public WebElement getNidTB() {
		return NidTB;
	}

	public WebElement getPhoneTB() {
		return PhoneTB;
	}

	public WebElement getAddressTB() {
		return AddressTB;
	}

	public WebElement getPolicyIdTB() {
		return PolicyIdTB;
	}

	public WebElement getAgentIdTB() {
		return AgentIdTB;
	}

	public WebElement getSubmitBtn() {
		return SubmitBtn;
	}
	
//	Busineess libraries
	
	public void editClientDetails(WebDriver driver) throws Throwable {
		ExcelUtility eLib = new ExcelUtility();
		eLib.getListForUpdate("updateClient", driver);
	}
	
	public void clickOnSubmitButtonToUpdateClient() throws Throwable {
		Thread.sleep(3000);
		SubmitBtn.click();
	}
}
