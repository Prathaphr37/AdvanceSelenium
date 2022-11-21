package com.LIMS.GenericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

import objectRepositry.HomePage;
import objectRepositry.LoginPage;

public class BaseClass {

	public WebDriver driver;
	public ExcelUtility eLib = new ExcelUtility();
	public DatabaseUtility dLib = new DatabaseUtility();
	public FileUtility fLib = new FileUtility();
	public JavaUtility jLib = new JavaUtility();
	public WebdriverUtility wLib = new WebdriverUtility();
	public static WebDriver sDriver;
	
	@BeforeSuite
	public void connectToDataBase() throws Throwable {
		dLib.connectToDB();
		System.out.println("-- connect to the database --");
	}

	@AfterSuite
	public void closeDataBase() throws Throwable {
		dLib.closeDB();
		System.out.println("-- close the database --");
	}

//	@Parameters("BrowserName")-----> for parallel execution and pass String BROWSER parameter for launchBrowser method
	@BeforeClass
	public void launchBrowser() throws Throwable {
		String BROWSER = fLib.readDataFromPropertyFile("browser");
		
		if (BROWSER.equals("chrome")) {
			//WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (BROWSER.equals("firefox")) {
			//WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else {
			System.out.println("-- invalid browser --");
		}
		sDriver = driver;
		String URL = fLib.readDataFromPropertyFile("url");
		wLib.maximizeWindow(driver);
		wLib.waitForPageLoad(driver);
		driver.get(URL);
		System.out.println("-- launching the browser --");
	}

	@AfterClass
	public void closeBrowser() {
		driver.quit();
		System.out.println("-- close the browser --");
	}

	@BeforeMethod
	public void loginToApplication() throws Throwable {
		String USERNAME = fLib.readDataFromPropertyFile("username");
		String PASSWORD = fLib.readDataFromPropertyFile("password");

		LoginPage lp = new LoginPage(driver);
		Thread.sleep(3000);
		lp.loginPage(USERNAME, PASSWORD);
		System.out.println("-- login to application --");
	}

	@AfterMethod
	public void logoutFromApplication() throws Throwable {
		HomePage hp = new HomePage(driver);
		Thread.sleep(3000);
		hp.clickOnLogoutBtn();
		System.out.println("-- logout from application --");
	}
}
