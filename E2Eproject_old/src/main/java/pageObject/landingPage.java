package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class landingPage {

	public WebDriver driver;
	 private By loginButton= By.cssSelector("a[href*='sign_in']");
	 private By title=By.cssSelector(".text-center h2");
	 private By TopMenu=By.cssSelector(".nav.navbar-nav.navbar-right>li");
	 
	 
	 public landingPage(WebDriver driver) {
		this.driver= driver;
	}

	public loginPage getlogin()
	 {
		
		 driver.findElement(loginButton).click();
		 loginPage lp=new loginPage(driver);
		 return lp;
//		 return driver.findElement(loginButton);
	 }
	
	public WebElement getTitle()
	{
		return driver.findElement(title);
	}
	
	public WebElement getTopMenu()
	{
		return driver.findElement(TopMenu);
		
	}
	
}
