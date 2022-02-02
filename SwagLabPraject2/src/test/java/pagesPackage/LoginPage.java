package pagesPackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import utilities.CommonFunctions;
import utilities.SeleniumUtilities;

public class LoginPage extends CommonFunctions {
	// here write loginPage element objects
    public static WebDriver driver;
	@FindBy(xpath="//input[@id='user-name']")
	WebElement firstName;

	@FindBy(xpath = "//input[@id='password']")
	WebElement password;

	@FindBy(xpath = "//input[@id='login-button']")
	WebElement login;
	
	@FindBy(xpath="//select[@class='product_sort_container']")
	WebElement clickDropdown;
    

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void loginIntoApplication(String username, String pwd) {
		EnterUserName(username);
		Enterpassword(pwd);
		ClickOnLogin();

	}
	
	

	public void EnterUserName(String username) {
		SeleniumUtilities.clickElement(firstName);
		SeleniumUtilities.enterValueIntoTextField(firstName, username);

	}
  
	public void Enterpassword(String pwd) {
		SeleniumUtilities.enterValueIntoTextField(password, pwd);

	}

	public void ClickOnLogin() {
		SeleniumUtilities.clickElement(login);
	}
	
	
	
	

}
