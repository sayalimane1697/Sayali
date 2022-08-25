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

public class navigationBar extends Base {
	
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(Base.class.getName());
	
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
		 
// compare the text from the browser with actual text.- Error..
		   Assert.assertTrue(l.getTopMenu().isDisplayed());
		   log.info("navigation bar is displayed");
		   System.out.println(l.getTopMenu().getText());
		   
	}
	
	@AfterTest
	public void close()
	{
		driver.close();
	}

}

