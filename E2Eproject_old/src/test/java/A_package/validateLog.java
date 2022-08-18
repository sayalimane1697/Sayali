package A_package;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.landingPage;

public class validateLog extends Base {
	
	public static Logger Log = LogManager.getLogger(Base.class.getName());
   
	@BeforeTest
	public void initialize() throws IOException
	{
		driver=initializeDriver();
		Log.info("driver is initialized");
		
		driver.get(p.getProperty("url"));
		Log.info("navigate to page");
	}
	
	@Test
	public void pageNavigation() throws IOException
	{
		
//	    driver.get("http://www.qaclickacademy.com/");
		
	    landingPage l=new landingPage(driver);
	    Assert.assertEquals(l.getTitle().getText(), "FEATURED COURSES");
	    Log.info("driver find text message");
	   
	    Assert.assertTrue(l.getTopMenu().isDisplayed());
	    Log.info("topmenu id displayed");
	    
	    System.out.println(l.getTopMenu().getText());
 
	} 
	
	
	@AfterTest
	public void TearDown()
	{
		driver.close();
	}
  
}
