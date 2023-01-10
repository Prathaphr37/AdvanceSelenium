package kalpana_mam_programs;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class Flight {

	public static void main(String[] args) throws Throwable {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
//		WebDriverManager.chromedriver().setup();
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
		driver.findElement(By.xpath("//span[text()=' 15']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-md yellow-gradient home-btn']")).click();
		
		
		List<WebElement> flightNames = driver.findElements(By.xpath("//div[@class='row']//div[@class='right-searchbarbtm']//b"));
		List<WebElement> flightId = driver.findElements(By.xpath("//div[@class='row']//div[@class='right-searchbarbtm']/descendant::b/following-sibling::span"));
		List<WebElement> Departure = driver.findElements(By.xpath("//div[@class='row']//div[@class='right-searchbarbtm']//div[2]//label"));
		List<WebElement> Arrival = driver.findElements(By.xpath("//div[@class='row']//div[@class='right-searchbarbtm']//div[3]//label"));
		List<WebElement> price = driver.findElements(By.xpath("//div[@class='row']//div[@class='right-searchbarbtm']//label[@class='price']"));
		
		FileInputStream fis = new FileInputStream("./src/test/resources/Flight.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		
		int j=0;
		for (int i = 1; i <=flightNames.size(); i++) {
			Row row = sh.createRow(i);
			row.createCell(0).setCellValue(flightNames.get(j).getText());
			row.createCell(1).setCellValue(flightId.get(j).getText());
			row.createCell(2).setCellValue(Departure.get(j).getText());
			row.createCell(3).setCellValue(Arrival.get(j).getText());
			row.createCell(4).setCellValue(price.get(j).getText());
			j++;
		}
		FileOutputStream fos = new FileOutputStream("./src/test/resources/Flight.xlsx");
		wb.write(fos);			

//	ArrayList namelist = new ArrayList<>();
//	for (int i = 0; i <flightNames.size() ; i++) {
//		namelist.add(flightNames.get(i).getText());
//	}		
//	System.out.println(namelist);
	
	
//	for (WebElement lv : flightNames) {
//	System.out.println(lv.getText());
//      }
	
	

	}
}
