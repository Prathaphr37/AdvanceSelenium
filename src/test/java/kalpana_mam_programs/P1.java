package kalpana_mam_programs;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class P1 {
	
	public static void main(String[] args) throws Throwable {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.irctc.co.in");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("disha-banner-close")).click();
		driver.findElement(By.xpath("//div[@class='h_menu_drop_button hidden-xs']")).click();
		driver.findElement(By.xpath("//label[@class='toggle' and text()='FLIGHTS']")).click();
		
		Set<String> allwin = driver.getWindowHandles();
		for (String string : allwin) {
			driver.switchTo().window(string);
		}
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='stationFrom']")).click();
		
	}
}
