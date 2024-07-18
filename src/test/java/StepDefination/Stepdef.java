package StepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import Pageobject.LoginPagess;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;




public class Stepdef {
	public WebDriver driver;

	public LoginPagess k;


	@Given("user Launch Chrome Browser")
	public void user_Launch_Chrome_Browser ()  {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		driver = new ChromeDriver(options);
		
		k = new LoginPagess(driver);

		}

	@When("User opens URL{string}")
	public void user_opens_url(String URL) throws InterruptedException {
		driver.get(URL);
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}

	@When("User enter Email as {string} and Password as {string}")
	public void user_enter_email_as_and_password_as(String mail, String pwd) {

		k.enterEmail(mail);

		k.enterPassword(pwd);

	}

	@When("Click on Login")
	public void click_on_login() {
		k.clickOnLoginButton();
	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String exptitle) {

		String actualtitle = driver.getTitle();

		if (actualtitle.equals(exptitle)) {

			System.out.println("True");
		} else {
			System.out.println("False");

		}
	}

	@When("User click on the log out link")
	public void user_click_on_the_log_out_link() {
		k.clickOnLogOutButton();
	}

	@When("Close the Browser")
	public void close_the_browser() {
		driver.close();
	}
	

}
