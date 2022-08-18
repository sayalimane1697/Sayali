package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class landingPage {

	public WebDriver driver;
	 By loginButton= By.cssSelector("a[href*='sign_in']");
	 By title=By.cssSelector(".text-center");
	 By TopMenu=By.cssSelector(".nav.navbar-nav.navbar-right>li");
	 
	 
	 public landingPage(WebDriver driver) {
		this.driver= driver;
	}

	public WebElement getlogin()
	 {
		 return driver.findElement(loginButton);
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
