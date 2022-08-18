package A_package;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.landingPage;

public class navigationBar extends Base {
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver=initializeDriver();
		driver.get(p.getProperty("url"));
	}
	
	@Test
	public void validationBar()
	{
		   landingPage l=new landingPage(driver);
		  Assert.assertTrue(l.getTopMenu().isDisplayed());
		    
		  System.out.println(l.getTopMenu().getText());
	 
	}
	
	@AfterTest
	public void close()
	{
		driver.close();
	}

}
