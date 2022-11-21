package objectRepositry;

import java.util.Map;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddClientPage {

	// declaration
	@FindBy(name = "client_password")
	private WebElement ClientPasswordTB;

	@FindBy(name = "name")
	private WebElement ClientNameTB;

	@FindBy(name = "sex")
	private WebElement ClientGenderTB;

	@FindBy(name = "birth_date")
	private WebElement ClientDobTB;

	@FindBy(name = "maritial_status")
	private WebElement MaritalStatusTB;

	@FindBy(name = "nid")
	private WebElement ClientNidTB;

	@FindBy(name = "phone")
	private WebElement ClientPhoneTB;

	@FindBy(name = "address")
	private WebElement ClientAddressTB;

	@FindBy(name = "policy_id")
	private WebElement PolicyidTB;

	@FindBy(name = "nominee_name")
	private WebElement NomineeNameTB;

	@FindBy(name = "nominee_sex")
	private WebElement NomineeGenderTB;

	@FindBy(name = "nominee_birth_date")
	private WebElement NomineeDobTB;

	@FindBy(name = "nominee_nid")
	private WebElement NomineeidTB;

	@FindBy(name = "nominee_relationship")
	private WebElement RelationshipTB;

	@FindBy(name = "priority")
	private WebElement PriorityTB;

	@FindBy(name = "nominee_phone")
	private WebElement NomineePhoneTB;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement SubmitBtn;
	
	//initialization
	public AddClientPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getClientPasswordTB() {
		return ClientPasswordTB;
	}

	public WebElement getClientNameTB() {
		return ClientNameTB;
	}

	public WebElement getClientGenderTB() {
		return ClientGenderTB;
	}

	public WebElement getClientDobTB() {
		return ClientDobTB;
	}

	public WebElement getMaritalStatusTB() {
		return MaritalStatusTB;
	}

	public WebElement getClientNidTB() {
		return ClientNidTB;
	}

	public WebElement getClientPhoneTB() {
		return ClientPhoneTB;
	}

	public WebElement getClientAddressTB() {
		return ClientAddressTB;
	}

	public WebElement getPolicyidTB() {
		return PolicyidTB;
	}

	public WebElement getNomineeNameTB() {
		return NomineeNameTB;
	}

	public WebElement getNomineeGenderTB() {
		return NomineeGenderTB;
	}

	public WebElement getNomineeDobTB() {
		return NomineeDobTB;
	}

	public WebElement getNomineeidTB() {
		return NomineeidTB;
	}

	public WebElement getRelationshipTB() {
		return RelationshipTB;
	}

	public WebElement getPriorityTB() {
		return PriorityTB;
	}

	public WebElement getNomineePhoneTB() {
		return NomineePhoneTB;
	}

	public WebElement getSubmitBtn() {
		return SubmitBtn;
	}
	
	
	//Business Libraries
	public void addClientpage(Map<String, String> map, WebDriver driver) {
		for(Entry<String, String> set:map.entrySet())
		{
			driver.findElement(By.name(set.getKey())).sendKeys(set.getValue());
		}
	}
	
	public void clickOnSubmitButtonToAddClient() {
		SubmitBtn.click();
	}

}
