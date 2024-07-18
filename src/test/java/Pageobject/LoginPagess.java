package Pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginPagess {
	

	WebDriver ldriver;

	  public LoginPagess(WebDriver rdriver) {
	        ldriver = rdriver;
	        PageFactory.initElements(rdriver, this);
	    }

	@FindBy(id = "Email")
	@CacheLookup
	WebElement email;

	@FindBy(id = "Password")
	@CacheLookup
	WebElement password;

	@FindBy(xpath = "/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")
	@CacheLookup
	WebElement button;

	@FindBy(linkText = "Logout")
	WebElement logout;

	public void enterEmail(String mail) {
		email.clear();
		email.sendKeys(mail);
	}

	public void enterPassword(String pwd) {
		password.clear();
		password.sendKeys(pwd);
			
		
	}

	public void clickOnLoginButton() {
		button.click();
	}

	public void clickOnLogOutButton() {
		logout.click();
	}

}
