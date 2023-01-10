package selenium_grid_programs;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SeleniumGridPractice2 {

	@Test
	public void test() throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setPlatform(Platform.WINDOWS);
		cap.setBrowserName("chrome");
		
		URL url =new URL(" http://192.168.152.139:4444/wd/hub");
		
		WebDriver driver = new RemoteWebDriver(url, cap);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		Thread.sleep(4000);
		driver.close();
	}
}
