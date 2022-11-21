package com.LIMS.GenericUtility;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.Duration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * This class is used to write web driver specific methods
 * 
 * @author Prathap
 *
 */
public class WebdriverUtility {

	/**
	 * This method is used for fullscreen the window
	 * @param driver
	 */
	public void fullscreenWindow(WebDriver driver) {
		driver.manage().window().fullscreen();
	}
	
	/**
	 * This method is used for maximize the window
	 * @param driver
	 */
	public void maximizeWindow(WebDriver driver) {
		driver.manage().window().maximize();
	}
	
	
	/**
	 * This method is used to wait for the page is loaded
	 * 
	 * @param driver
	 */
	public void waitForPageLoad(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void waitForPageToLoadForJSElement(WebDriver driver) {
		driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
	}

	/**
	 * This method is used until element to be visible
	 * 
	 * @param driver
	 * @param element
	 */
	public void waitForElementToBevisible(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	/**
	 * This method is used until element to be clickable
	 * 
	 * @param driver
	 * @param element
	 */
	public void waitForElementToBeClickable(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	/**
	 * This method is used to be visible in GUI and check for specififc element
	 * for every 500 milli seconds
	 * 
	 * @param driver
	 * @param element
	 * @param pollingTime
	 */
	public void waitForElementWithCustomTimeoutElementVisible(WebDriver driver, WebElement element, int pollingTime) {
		FluentWait wait = new FluentWait(driver);
		wait.pollingEvery(Duration.ofMillis(pollingTime));
		wait.ignoring(NoSuchElementException.class);
		wait.withTimeout(Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	/**
	 * This method is used to be clickable in GUI and check for specififc element
	 * for every 500 milli seconds
	 * 
	 * @param driver
	 * @param element
	 * @param pollingTime
	 */
	public void waitForElementWithCustomTimeout(WebDriver driver, WebElement element, int pollingTime) {
		FluentWait wait = new FluentWait(driver);
		wait.pollingEvery(Duration.ofMillis(pollingTime));
		wait.ignoring(NoSuchElementException.class);
		wait.withTimeout(Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	/**
	 * This method is used to handle drop down or list box by index
	 * 
	 * @param element
	 * @param Index
	 */
	public void select(WebElement element, int Index) {
		Select sel = new Select(element);
		sel.selectByIndex(Index);
	}

	/**
	 * This method is used to handle drop down or list box using visible value
	 * 
	 * @param element
	 * @param Index
	 */
	public void select(WebElement element, String value) {
		Select sel = new Select(element);
		sel.selectByValue(value);
	}

	/**
	 * This method is used to handle drop down or list box using visible text
	 * 
	 * @param element
	 * @param Index
	 */
	public void select(String text, WebElement element) {
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}

	/**
	 * used to Switch to Any Window based on Window Title
	 * 
	 * @param driver
	 * @param partialWindowTitle
	 */
	public void switchToWindow(WebDriver driver, String partialWindowTitle) {

		Set<String> windows = driver.getWindowHandles();
		Iterator<String> itr = windows.iterator();

		while (itr.hasNext()) {
			String wID = itr.next();
			String currentWindowTitle = driver.switchTo().window(wID).getTitle();
			if (currentWindowTitle.contains(partialWindowTitle)) {
				break;
			}
		}
	}

	/**
	 * used to Switch to Alert Window & click on OK button
	 * 
	 * @param driver
	 */
	public void switchToAlertWindowAndAccpect(WebDriver driver) {
		driver.switchTo().alert().accept();
	}

	/**
	 * used to Switch to Alert Window & click on Cancel button
	 * 
	 * @param driver
	 */
	public void switchToAlertWindowAndCancel(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}

	/**
	 * used to Switch to Frame Window based on index
	 * 
	 * @param driver
	 * @param index
	 */
	public void switchToFrame(WebDriver driver, int index) {
		driver.switchTo().frame(index);
	}

	/**
	 * used to Switch to Frame Window based on id or name 
	 * 
	 * @param driver
	 * @param id_name_attribute
	 */
	public void switchToFrame(WebDriver driver, String nameORid) {
		driver.switchTo().frame(nameORid);
	}
	
	/**
	 * used to Switch to Frame Window based on address
	 * 
	 * @param driver
	 * @param id_name_attribute
	 */
	public void switchToFrame(WebDriver driver, WebElement address) {
		driver.switchTo().frame(address);
	}

	/**
	 * used to place mouse cursor on specified element
	 * 
	 * @param driver
	 * @param elemnet
	 */
	public void mouseOverOnElement(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}

	/**
	 * used to right click on specified element
	 * 
	 * @param driver
	 * @param elemnet
	 */
	public void rightClickOnElement(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.contextClick(element).perform();
	}

	/**
	 * used to double click on specified element
	 * 
	 * @param driver
	 * @param elemnet
	 */
	public void doubleClickOnElement(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.doubleClick(element).perform();
	}

	/**
	 * This method is used to double click on the web page
	 * 
	 * @param driver
	 */
	public void doubleClickOnWebPage(WebDriver driver) {
		Actions act = new Actions(driver);
		act.doubleClick().perform();
	}
	
	/**
	 * This method is used to right click on the web page
	 * 
	 * @param driver
	 */
	public void rightClickOnWebPage(WebDriver driver) {
		Actions act = new Actions(driver);
		act.contextClick().perform();
	}

	/**
	 * This method is used to drag and drop 
	 * 
	 * @param driver
	 * @param elemnet
	 */
	public void dragAndDropElement(WebDriver driver, WebElement src, WebElement dst) {
		Actions act = new Actions(driver);
		act.dragAndDrop(src, dst).perform();
	}

	/**
	 * This method is used to execute the java script code
	 * 
	 * @param driver
	 * @param javaScript
	 */
	public void executeJavaScript(WebDriver driver, String javaScript) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(javaScript);
		//js.executeScript(javaScript, null);
	}

	/**
	 * This method is used to execute the java script code
	 * 
	 * @param driver
	 * @param javaScript
	 */
	public void executeAsyncJavaScript(WebDriver driver, String javaScript) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeAsyncScript(javaScript);
		//js.executeAsyncScript(javaScript, null);
	}

	/**
	 * this method is used to perform random scroll
	 * @param driver
	 */
	public void scrollBarAction(WebDriver driver,int y) {
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,"+y+")");
	}
	
	/**
	 * this method is used to perform random scroll
	 * @param driver
	 */
	public void scrollAction(WebDriver driver, WebElement element) {
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		int y = element.getLocation().getY();
		jse.executeScript("window.scrollBy(0,"+y+")",element);
//		jse.executeScript("argument[0].scrollIntoView()", element);
	}
	
	/**
	 * This method is used to click on the web element
	 * 
	 * @param driver
	 * @param javaScript
	 */
	public void waitAndClick(WebElement element) throws Throwable {
		int count = 0;
		while (count < 20) {
			try {
				element.click();
				break;
			} catch (Throwable e) {
				Thread.sleep(1000);
				count++;
			}
		}
	}

	/**
	 * This method is used to capture the screenshot of web page
	 * 
	 * @param driver
	 * @param screenshotName
	 * @throws Throwable
	 */
	public void takeScreenshot(WebDriver driver, String screenshotName) throws Throwable {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/" + screenshotName + ".PNG");
		FileUtils.copyFile(src, dest);
	}

	/**
	 * This method is used press enter Key using actions class
	 * 
	 * @param driver
	 */
	public void enterKeyPress(WebDriver driver) {
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
	}

	/**
	 * this method is used to press enter key using robot class
	 * 
	 * @param driver
	 * @throws Throwable
	 */
	public void pressEnterKey(WebDriver driver) throws Throwable {
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_ENTER);
	}
	
	/**
	 * this method is used to release enter key using robot class
	 * 
	 * @param driver
	 * @throws Throwable
	 */
	public void releaseEnterKey(WebDriver driver) throws Throwable {
		Robot rb = new Robot();
		rb.keyRelease(KeyEvent.VK_ENTER);
	}	
}
