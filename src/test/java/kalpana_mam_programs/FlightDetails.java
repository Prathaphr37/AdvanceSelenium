package kalpana_mam_programs;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class FlightDetails {

	public static void main(String[] args) throws Throwable {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.irctc.co.in");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//div[@class='h_menu_drop_button hidden-xs']")).click();
		driver.findElement(By.id("disha-banner-close")).click();

		driver.findElement(By.xpath("//label[@class='toggle' and text()= 'FLIGHTS' ]")).click();

		Set<String> allWindows = driver.getWindowHandles();
		for (String lv : allWindows) {
			driver.switchTo().window(lv);
		}

		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class='form-in-custom stationFrom']")).click();
		WebElement from = driver.findElement(By.xpath("//div[text()='Bengaluru (BLR)']"));
		Actions a = new Actions(driver);
		a.moveToElement(from).click().perform();

		driver.findElement(By.xpath("//div[@class='form-in-custom stationTo']")).click();
		WebElement to = driver.findElement(By.xpath("(//div[text()='Chennai (MAA)'])[2]"));
		a.moveToElement(to).click().perform();
		
		driver.findElement(By.id("originDate")).click();
		WebElement month = driver.findElement(By.xpath("//div[@style='display: block;']/descendant::div[@class='date-table-right']/descendant::tr[@class='active']"));		
//		driver.findElement(By.xpath("//button[@class='btn btn-md yellow-gradient home-btn']")).click();
		a.moveToElement(month).click().perform();
		driver.findElement(By.xpath("//div[@style='display: block;']//table[@class='date-table']/descendant::span[.=' 1']")).click();
		List<WebElement> flightNames = driver
				.findElements(By.xpath("//div[@class='row']//div[@class='right-searchbarbtm']//b"));
		List<WebElement> flightId = driver.findElements(By
				.xpath("//div[@class='row']//div[@class='right-searchbarbtm']/descendant::b/following-sibling::span"));
		List<WebElement> Departure = driver
				.findElements(By.xpath("//div[@class='row']//div[@class='right-searchbarbtm']//div[2]//label"));
		List<WebElement> Arrival = driver
				.findElements(By.xpath("//div[@class='row']//div[@class='right-searchbarbtm']//div[3]//label"));
		List<WebElement> price = driver
				.findElements(By.xpath("//div[@class='row']//div[@class='right-searchbarbtm']//label[@class='price']"));
		int j = 1;
		for (int i = 0; i < flightNames.size(); i++) {
			System.out.println(j + "--->" + "  " + "name=" + flightNames.get(i).getText() + "  " + "id="
					+ flightId.get(i).getText() + "  " + "departureTime=" + Departure.get(i).getText() + "  "
					+ "ArrivalTime=" + Arrival.get(i).getText() + "  " + "price=" + price.get(i).getText());
			j++;
		}
	}
}
