package A_package;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.landingPage;

public class validateTitle extends Base {
   
	@BeforeTest
	public void initialize() throws IOException
	{
		driver=initializeDriver();
		driver.get(p.getProperty("url"));
	}
	
	@Test
	public void pageNavigation() throws IOException
	{
		
//	    driver.get("http://www.qaclickacademy.com/");
		
	    landingPage l=new landingPage(driver);
	    Assert.assertEquals(l.getTitle().getText(), "FEATURED COURSES12");
	   
	  
	} 
	

	@AfterTest
	public void close()
	{
		driver.close();
	}
  
}
