import java.io.File;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.LIMS.GenericUtility.BaseClass;

import objectRepositry.AddClientPage;
import objectRepositry.ClientInformationPage;
import objectRepositry.HomePage;


@Listeners(com.LIMS.GenericUtility.ListenerImplementationClass.class)
public class ClientModule extends BaseClass{

	@Test(groups="integration")
	public void addClient() throws Throwable {
		HomePage hp = new HomePage(driver);
//		To fail the script
//		Assert.fail();
		hp.clickOnClientLnk();
		
		ClientInformationPage cip = new ClientInformationPage(driver);
		cip.clickOnAddClientButton();
		
		AddClientPage AddClient = new AddClientPage(driver);
		AddClient.addClientpage(eLib.getList("client"), driver);
		Thread.sleep(3000);
		
		File f1 = new File("./src/test/resources/virat-kohli.png");
		String photo_path = f1.getAbsolutePath();
		driver.findElement(By.xpath("//input[@name='fileToUpload']")).sendKeys(photo_path);
		Thread.sleep(3000);
//		AddClient.clickOnSubmitButtonToAddClient();
	}
}
