package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;



public class TeamNamesAndMatches {

	@Test
	public void matches() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/t20i");
		List<WebElement> names = driver.findElements(By.xpath("//span[@class='u-hide-phablet']"));
		List<WebElement> match = driver.findElements(By.xpath(
				"//span[@class='u-hide-phablet']/ancestor::table[@class='table']/descendant::td[@class='rankings-block__banner--matches']/following-sibling::td[@class='rankings-block__banner--points']|//td[@class='table-body__cell u-center-text']/following-sibling::td[@class='table-body__cell u-center-text']"));

		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i).getText() + "=" + match.get(i).getText());
		}
	}
}
