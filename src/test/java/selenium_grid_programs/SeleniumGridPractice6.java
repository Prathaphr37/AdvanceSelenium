package selenium_grid_programs;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

public class SeleniumGridPractice6 {

	@org.testng.annotations.Parameters("browsername")
	@Test
	public void test(String bn) throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setPlatform(Platform.WINDOWS);
		if (bn.equalsIgnoreCase("chrome")) {
			cap.setBrowserName("chrome");
		} else if(bn.equalsIgnoreCase("firfox")) {
			cap.setBrowserName("chrome");
		}
		cap.setBrowserName("chrome");
		
		URL url =new URL(" http://192.168.152.139:4444/wd/hub");
		
		WebDriver driver = new RemoteWebDriver(url, cap);
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
		Thread.sleep(4000);
		driver.close();
	}
}
