package A_package;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.ForgotPassword;
import pageObject.landingPage;
import pageObject.loginPage;

public class HomePage extends Base {
	
	public WebDriver driver;
	public static Logger log =LogManager.getLogger(Base.class.getName());
	
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
		loginPage lp=l.getlogin(); //driver.findElement(By.css()
		lp.getemail().sendKeys(username);
		lp.getpassword().sendKeys(password);

		log.info(text);
		
		lp.getlogin().click(); 
		ForgotPassword fp= lp.getForgetPass();
		fp.getEmail().sendKeys("xxx");
		fp.sendMeInstructions().click();
	  
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
//driver.get(p.getProperty("url"));
//
//landingPage l=new landingPage(driver);
//loginPage login=new loginPage(driver);
//l.getlogin().click();
//login.getemail().sendKeys(username);
//
//WebElement name=driver.findElement(By.cssSelector("user_email"));
//name.sendKeys("dsjfs");
//File file =name.getScreenshotAs(OutputType.FILE);
//FileUtils.copyFile(file, new File("logo.png"));
//System.out.println(name.getRect().getDimension().getHeight());
//name.getAttribute("Value");
//
//login.getpassword().sendKeys(password);
//System.out.println(text);
//login.getlogin().click();
