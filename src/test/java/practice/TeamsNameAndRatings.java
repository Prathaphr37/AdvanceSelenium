package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;



public class TeamsNameAndRatings {

	@Test
	public void ratings()
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
		
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/t20i");
		List<WebElement> teamNames = driver.findElements(By.xpath("//span[@class='u-hide-phablet']"));
		List<WebElement> rating = driver.findElements(By.xpath("//span[@class='u-hide-phablet']/ancestor::table[@class='table']/descendant::td[@class='rankings-block__banner--rating u-text-right']|//td[@class='table-body__cell u-text-right rating']"));
		
		for (int i = 0; i <teamNames.size(); i++) {
			System.out.println(teamNames.get(i).getText()+"="+rating.get(i).getText());
		}
		
		
	}
}
