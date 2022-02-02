package pagesPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Currency;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProductPage {
	
	
	public static WebDriver driver;
	@FindBy(xpath="//select[@class='product_sort_container']")
	WebElement clickDropdown;
	
	@FindBy(xpath="//div[@class='inventory_item_name']")
	List<WebElement> inventary_item;
	
	@FindBy(xpath="//div[@class='inventory_item_price']")
	List<WebElement> inventary_item_price;
   
	public ProductPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public Boolean VerifyAscendingOrderSorting() {
		
		Boolean sortstatus = false;
		Select sel=new Select(clickDropdown);
		sel.selectByVisibleText("Name (A to Z)");
		
		ArrayList<String> alist=new ArrayList<String>();
		for(WebElement ele:inventary_item) {
			String value=ele.getText();
			alist.add(value);
			
		}	
		
		System.out.print("Original List : ");
		System.out.println(alist);
		
		ArrayList<String> sortList =new ArrayList<String>();
		sortList = (ArrayList)alist.clone();
		
		Collections.sort(sortList);
		System.out.println(sortList);
		
		System.out.print("Sorted List : ");
		System.out.println(alist);
		
		if(alist.equals(sortList)) {
			//System.out.println("Sorted the List of Items based on SOrt Criteria");
			sortstatus = true;
		}
		
		return sortstatus;
	}
	
public Boolean VerifyDescendingOrderSorting() {
		Boolean sortstatus = false;
		Select sel=new Select(clickDropdown);
		sel.selectByVisibleText("Name (Z to A)");
		
		ArrayList<String> alist=new ArrayList<String>();
		for(WebElement ele:inventary_item) {
			String value=ele.getText();
			alist.add(value);
			
		}	
		
		System.out.print("Original List : ");
		System.out.println(alist);
		
		ArrayList<String> sortList =new ArrayList<String>();
		sortList = (ArrayList)alist.clone();
		
		//Collections.sort(sortList);
		 Collections.sort(alist, Collections.reverseOrder());
		System.out.println(sortList);
		
		System.out.print("Sorted List : ");
		System.out.println(alist);
		
		if(alist.equals(sortList)) {
			//System.out.println("Sorted the List of Items based on SOrt Criteria");
			sortstatus = true;
		}
		
		return sortstatus;
	}



public Boolean VerifyAscendingOrderprice() {
	Boolean sortstatus = false;
	Select sel=new Select(clickDropdown);
	sel.selectByVisibleText("Price (low to high)");
	
	ArrayList<Double> alist=new ArrayList<Double>();
	for(WebElement ele:inventary_item_price) {
		String val = ele.getText().replace("$", "");
		
		Double value = Double.parseDouble(val);
		alist.add(value);
		
	}		
	
	System.out.print("Original List : ");
	System.out.println(alist);
	
	ArrayList<Double> sortList =new ArrayList<Double>();
	sortList = (ArrayList)alist.clone();
	
	//Collections.sort(sortList);
	Collections.sort(alist, Collections.reverseOrder());
	System.out.println(sortList);
	
	System.out.print("Sorted List : ");
	System.out.println(alist);
	
	if(alist.equals(sortList)) {
		//System.out.println("Sorted the List of Items based on SOrt Criteria");
		sortstatus = true;
	}
	
	return sortstatus;
}


public Boolean VerifyDescendingOrderprice() {
	Boolean sortstatus = false;
	Select sel=new Select(clickDropdown);
	sel.selectByVisibleText("Price (high to low)");
	
	ArrayList<Double> alist=new ArrayList<Double>();
	for(WebElement ele:inventary_item_price) {
		String val = ele.getText().replace("$", "");
		
		Double value = Double.parseDouble(val);
		alist.add(value);
		
	}	
	
	System.out.print("Original List : ");
	System.out.println(alist);
	
	ArrayList<Double> sortList =new ArrayList<Double>();
	sortList = (ArrayList)alist.clone();
	
	//Collections.sort(sortList);
	Collections.sort(alist, Collections.reverseOrder());
	System.out.println(sortList);
	
	System.out.print("Sorted List : ");
	System.out.println(alist);
	
	if(alist.equals(sortList)) {
		//System.out.println("Sorted the List of Items based on SOrt Criteria");
		sortstatus = true;
	}
	
	return sortstatus;
}







}
