package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {
	
	public WebDriver driver;
	private By email = By.id("i0116");
	private By eclick = By.id("idSIButton9");
	private By password = By.xpath("//input[@name='passwd']");
	private By pclick = By.xpath("//input[@value='Sign in']");
	private By login = By.xpath("//input[@value='Yes']");
	
	public loginPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public WebElement getemail()
	{
		return driver.findElement(email);	
	}
	
	public WebElement geteclick()
	{
		return driver.findElement(eclick);	
	}
	
	public WebElement getpassword()
	{
		return driver.findElement(password);	
	}
	
	public WebElement getpclick()
	{
		return driver.findElement(pclick);	
	}
	
	public WebElement getlogin()
	{
		return driver.findElement(login);	
	}

}
