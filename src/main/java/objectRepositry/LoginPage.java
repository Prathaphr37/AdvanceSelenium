package objectRepositry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	// declaration
	@FindBy(xpath = "//input[@name='username']")
	private WebElement UserNameTB;

	@FindBy(xpath = "//input[@name='password']")
	private WebElement PasswordTB;

	@FindBy(xpath = "//button[text()='login']")
	private WebElement LoginBtn;

	// initialization
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// utilization
	public WebElement getUserNameTB() {
		return UserNameTB;
	}

	public WebElement getPasswordTB() {
		return PasswordTB;
	}

	public WebElement getLoginBtn() {
		return LoginBtn;
	}

	// Business Libraries
	public void loginPage(String username, String password) {
		UserNameTB.sendKeys(username);
		PasswordTB.sendKeys(password);
		LoginBtn.click();
	}

}