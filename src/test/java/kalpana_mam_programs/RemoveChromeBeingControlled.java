package kalpana_mam_programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


//program to remove chrome is being controlled by automated test software using string array , Array, Collections
public class RemoveChromeBeingControlled {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--versions");
		System.out.println(options.addArguments("--versions"));
		
		//using String
//		options.setExperimentalOption("excludeSwitches",new String[] {"enable-automation"});
		
		//using arrays
//		options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
		
		//using collections
//		options.setExperimentalOption("excludeSwitches", Collections.singleton("enable-automation"));
//		options.setExperimentalOption("excludeSwitches", Collections.singletonlist("enable-automation"));
		
		//another method
		ArrayList eSwitches = new ArrayList<>();
		eSwitches.add("enable-automation");
		options.setExperimentalOption("excludeSwitches",eSwitches );
		options.setExperimentalOption("useAutomationExtension", false);
		
		//this is applicable only for old versions chrome
		options.addArguments("--disable-infobars");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
	}
}
