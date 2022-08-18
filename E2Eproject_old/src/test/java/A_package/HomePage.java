package A_package;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.landingPage;
import pageObject.loginPage;

public class HomePage extends Base {
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver=initializeDriver();
		
	}
   
	@Test(dataProvider="getData")
	public void pageNavigation(String username, String password, String text) throws IOException
	{
	
		driver.get(p.getProperty("url"));
		
	    landingPage l=new landingPage(driver);
	    l.getlogin().click();
	    loginPage login=new loginPage(driver);
	    login.getemail().sendKeys(username);
	    login.getpassword().sendKeys(password);
	    System.out.println(text);
	    login.getlogin().click();
	    
	} 
	

	@AfterTest
	public void close()
	{
		driver.close();
	}
	

	@DataProvider
	public Object[][] getData()
	{
// row stands for how many different data types test should run
// columns stands for how many values per each test
		Object[][] data=new Object[2][3];
		
		data[0][0]="nonrestricteduser@qw.com";
		data[0][1]="123456";
		data[0][2]="nonrestricted user";

		data[1][0]="restricteduser@qw.com";
		data[1][1]="456789";
		data[1][2]="restricted user";
	
		return data;
	}
  
}
