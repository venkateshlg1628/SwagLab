package testPackage;
import org.junit.Assert;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;

import pagesPackage.LoginPage;
import pagesPackage.ProductPage;
import utilities.ReadPropertyFile;


public class LoginTests extends BaseClass{

	@Test
	public void VerifyProductAscendingOrder() throws InterruptedException {
		LoginPage loginpage=new LoginPage(driver);
		ProductPage productobj=new ProductPage(driver);
		ReadPropertyFile prop=new ReadPropertyFile();
		String username=prop.getUserName();
		String password=prop.getPassWord();
		loginpage.loginIntoApplication(username, password);
		boolean sortstatus = productobj.VerifyAscendingOrderSorting();
		
		if(sortstatus == true) {
			System.out.println("Sorted the List of Items based on SOrt Criteria");
			Assert.assertTrue(sortstatus);
			extentTest.log(LogStatus.PASS, "List is ordered in Ascending Order"); // to add error/exception in
		}else {
			System.out.println("Not Sorted the List of Items based on SOrt Criteria");
			Assert.assertTrue(sortstatus);
			extentTest.log(LogStatus.FAIL, "List is not Ordered"); // to add error/exception in
		}
	}
	
	
	@Test
	public void VerifyProductDesscendingOrder() throws InterruptedException {
		LoginPage loginpage=new LoginPage(driver);
		ProductPage productobj=new ProductPage(driver);
		
		ReadPropertyFile prop=new ReadPropertyFile();
		String username=prop.getUserName();
		String password=prop.getPassWord();
		loginpage.loginIntoApplication(username, password);
		boolean sortstatus = productobj.VerifyDescendingOrderSorting();
		
		if(sortstatus == true) {
			System.out.println("Sorted the List of Items based on Sort Criteria");
			Assert.assertTrue(sortstatus);
			extentTest.log(LogStatus.PASS, "List is ordered in Descending Order"); // to add error/exception in
		}else {
			System.out.println("Not Sorted the List of Items based on Sort Criteria");
			Assert.assertTrue(sortstatus);
			extentTest.log(LogStatus.FAIL, "List is not Ordered"); // to add error/exception in
		}
	}
	
	
	@Test
	public void VerifyProductAscendingOrderPrice() throws InterruptedException {
		LoginPage loginpage=new LoginPage(driver);
		ProductPage productobj=new ProductPage(driver);
		
		ReadPropertyFile prop=new ReadPropertyFile();
		String username=prop.getUserName();
		String password=prop.getPassWord();
		loginpage.loginIntoApplication(username, password);
		boolean sortstatus = productobj.VerifyAscendingOrderprice();
		
		if(sortstatus == true) {
			System.out.println("Sorted the List of price based on Sort Criteria");
			Assert.assertTrue(sortstatus);
			extentTest.log(LogStatus.PASS, "List is ordered in Descending Order"); // to add error/exception in
		}else {
			System.out.println("Not Sorted the List of price based on Sort Criteria");
			Assert.assertTrue(sortstatus);
			extentTest.log(LogStatus.FAIL, "List is not Ordered"); // to add error/exception in
		}
	}
	
	@Test
	public void VerifyProductDescendingOrderPrice() throws InterruptedException {
		LoginPage loginpage=new LoginPage(driver);
		ProductPage productobj=new ProductPage(driver);
		
		ReadPropertyFile prop=new ReadPropertyFile();
		String username=prop.getUserName();
		String password=prop.getPassWord();
		loginpage.loginIntoApplication(username, password);
		boolean sortstatus = productobj.VerifyDescendingOrderprice();
		
		if(sortstatus == true) {
			System.out.println("Sorted the List of price based on Sort Criteria");
			Assert.assertTrue(sortstatus);
			extentTest.log(LogStatus.PASS, "List is ordered in Descending Order"); // to add error/exception in
		}else {
			System.out.println("Not Sorted the List of price based on Sort Criteria");
			Assert.assertTrue(sortstatus);
			extentTest.log(LogStatus.FAIL, "List is not Ordered"); // to add error/exception in
		}
	}
	
	
}
