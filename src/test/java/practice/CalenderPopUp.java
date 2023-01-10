package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CalenderPopUp {

	@Test
	public void calender() throws Throwable {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://xdsoft.net/jqplugins/calendar-popup/");
//		driver.findElement(By.xpath(
//				""))
//				.click();
		
		driver.findElement(By.xpath(
				"//a[.='December']/ancestor::div[@class='calendar-popup-composer calendar-popup-composer_main calendar-popup-composer_inline']/descendant::a[.='22']"))
				.click();
	}
}
//div[@class='calendar-popup-composer calendar-popup-composer_main calendar-popup-composer_inline']/descendant::div[@class='calendar-popup-container calendar-popup-container_active']
