package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SeleniumUtilities {
	
	public static WebDriver driver;
	public static void clickElement(WebElement element) {
		element.click();
	}
	
	public static void enterValueIntoTextField(WebElement element,String value) {
		element.sendKeys(value);
	}
	
	public static void selectValueFromDropDown(WebElement element,String value) {
		Select sel=new Select(element);
		sel.selectByVisibleText(value);
	}
	

}
