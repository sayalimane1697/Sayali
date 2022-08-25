package A_package;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.landingPage;

public class validateTitle extends Base {
	
	public WebDriver driver;
	public static Logger log= LogManager.getLogger(Base.class.getName());
   
	@BeforeTest
	public void initialize() throws IOException
	{
		driver=initializeDriver();
		log.info("driver is initialized");
		
		driver.get(p.getProperty("url"));
		log.info("navigate to page");
	}
	
	@Test
	public void pageNavigation() throws IOException
	{
		
//	    driver.get("http://www.qaclickacademy.com/");
		
	    landingPage l=new landingPage(driver);
	    Assert.assertEquals(l.getTitle().getText(), "FEATURED COURSES123");
	    log.info("find text message");
	    System.out.println(l.getTitle().getText());
	  
	} 
	

	@AfterTest
	public void close()
	{
		driver.close();
	}
  
}
