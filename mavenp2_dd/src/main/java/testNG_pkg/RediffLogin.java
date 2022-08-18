package testNG_pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLogin {
	
	WebDriver driver;
	
	public RediffLogin(WebDriver driver) //constructor of class
	{
		this.driver=driver;	//local driver(blue) will behaves like testcase driver
		PageFactory.initElements(driver, this); //page factory
	}
	
//	By username=By.id("login1");
//	By password=By.name("passwd");
//	By login=By.name("proceed");
//	
//	public WebElement emailid()
//	{
//		return driver.findElement(username);
//	}
//	
//	public WebElement password()
//	{
//		return driver.findElement(password);
//	}
//	
//	public WebElement login()
//	{
//		return driver.findElement(login);
//	}

	
//page factory		
	@FindBy (id = "login1") //*[@id='login1']
	WebElement username;
	@FindBy (name = "passwd")
	WebElement password;
	@FindBy (name = "proceed")
	WebElement login;
	@FindBy (xpath = "//a[text()='rediff.com']")
	WebElement home;
	
	public WebElement emailid()
	{
		return username;
	}
	
	public WebElement password()
	{
		return password;
	}
	
	public WebElement login()
	{
		return login;
	}
	
	public WebElement home()
	{
		return home;
	}


}
