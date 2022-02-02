package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class CommonFunctions {
	public static WebDriver driver;
	
	
	
	/*@BeforeMethod
	public void LaunchApplication() {
		driver=CommonFunctions.invokeDriver();
	}*/
    
	public static WebDriver invokeDriver() {

		ReadPropertyFile prop = new ReadPropertyFile();
		String url = prop.getApplicationUrl();
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		System.out.println("Url enter successfully");
		return driver;

	}

	/*
	public void launchAndLoginApplcation() {
		ReadPropertyFile prop = new ReadPropertyFile();
		String url = prop.getApplicationUrl();
		driver = new ChromeDriver();
		driver.get(url);
		System.out.println("url succussfully entered");
	}*/

}
