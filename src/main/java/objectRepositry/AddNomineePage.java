package objectRepositry;

import java.util.Map;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNomineePage {

	@FindBy(name = "client_id")
	private WebElement ClientidTB;

	@FindBy(name = "name")
	private WebElement NomineeNameTB;

	@FindBy(name = "sex")
	private WebElement NomineeGenderTB;

	@FindBy(name = "birth_date")
	private WebElement NomineeDobTB;

	@FindBy(name = "nid")
	private WebElement NomineeNidTB;

	@FindBy(name = "relationship")
	private WebElement NomineeRelationshipTB;

	@FindBy(name = "priority")
	private WebElement PriorityTB;

	@FindBy(name = "phone")
	private WebElement NomineePhonenoTB;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement SubmitBtn;

	//// initialization

	public AddNomineePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// utilization
	public WebElement getClientidTB() {
		return ClientidTB;
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

	public WebElement getNomineeNidTB() {
		return NomineeNidTB;
	}

	public WebElement getNomineeRelationshipTB() {
		return NomineeRelationshipTB;
	}

	public WebElement getPriorityTB() {
		return PriorityTB;
	}

	public WebElement getNomineePhonenoTB() {
		return NomineePhonenoTB;
	}

	public WebElement getSubmitBTN() {
		return SubmitBtn;
	}

	// Business Libraries
	public void addNomineepage(Map<String, String> map,WebDriver driver) {
		for (Entry<String, String> set : map.entrySet()) {
			driver.findElement(By.name(set.getKey())).sendKeys(set.getValue());
		}
	}
	
	public void clickOnSubmitButtonToAddNominee() {
		SubmitBtn.click();
	}
}
