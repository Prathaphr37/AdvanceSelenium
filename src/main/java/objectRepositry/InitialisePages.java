package objectRepositry;

import org.openqa.selenium.WebDriver;

public class InitialisePages {

	public LoginPage Login;
	public HomePage Home;
	public ClientInformationPage ClientInfoPage;
	public AddClientPage AddClient;
	public EditClientPage ClientEdit;
	public NomineeInformationPage NomineeInfoPage;
	public AddNomineePage AddNominee;
	public PaymentInformationPage PaymentInfoPage;
	public AddPaymentPage AddPayment;
	
	public InitialisePages(WebDriver driver) {
		this.Login = new LoginPage(driver);
		this.Home = new HomePage(driver);
		this.ClientInfoPage = new ClientInformationPage(driver);
		this.AddClient = new AddClientPage(driver);
		this.ClientEdit = new EditClientPage(driver);
		this.NomineeInfoPage = new NomineeInformationPage(driver);
		this.AddNominee = new AddNomineePage(driver);
		this.PaymentInfoPage = new PaymentInformationPage(driver);
		this.AddPayment = new AddPaymentPage(driver);
	}
}
