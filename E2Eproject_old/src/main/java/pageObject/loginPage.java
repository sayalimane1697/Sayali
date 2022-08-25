package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {

	public WebDriver driver;
	private By email= By.id("user_email");
	private By password= By.id("user_password");
	private By login= By.name("commit");
	private By forgotPassword = By.cssSelector("[href*='password/new']");

	
	 public loginPage(WebDriver driver) {
			this.driver= driver; //
		}

		public WebElement getemail()
		 {
			 return driver.findElement(email);
		 }
		
	    public WebElement getpassword()
	    {
	    	return driver.findElement(password);
	    }
	    
	    public WebElement getlogin()
	    {
	    	return driver.findElement(login);
	    }
	
	    public ForgotPassword getForgetPass()
	    {
	    	driver.findElement(forgotPassword).click();
	    	return new ForgotPassword(driver);
//	    	return driver.findElement(forgotPassword);
	    	
	    }
}
