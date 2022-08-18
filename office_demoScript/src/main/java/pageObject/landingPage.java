package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class landingPage {
	
	public WebDriver driver;
	By explore = By.xpath("//div/a[text()='Explore']");
	By btn = By.className("btn");
	By b = By.xpath("//div/a[contains(@class, 'btn-office_365')]");
	
	By logo=By.xpath("//img[@class='app-logo']");
	
	
	public landingPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement getexplore()
	{
		return driver.findElement(explore);
	}
	
	public WebElement getbtn()
	{
		return driver.findElement(btn);
	}

	public WebElement getb()
	{
		return driver.findElement(b);
	}
	
	public WebElement getlogo()
	{
		return driver.findElement(logo);
	}
	
}
