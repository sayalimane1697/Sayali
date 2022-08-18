package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class landingPage {
	
	public WebDriver driver;
	By explore = By.xpath("//div/a[text()='Explore']");
	By btn = By.className("btn");
	By btnOfc = By.xpath("//div/a[contains(@class, 'btn-office_365')]");
	
	By logo = By.xpath("//img[@class='app-logo']");
	By addLeaveBtn = By.xpath("//div[contains(text(),'Add Leave Application')]");
	By leaveType = By.cssSelector("input[data-fieldname='leave_type']");
	
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

	public WebElement getbtnOfc()
	{
		return driver.findElement(btnOfc);
	}
	
	public WebElement getlogo()
	{
		return driver.findElement(logo);
	}

	public WebElement getaddLeaveBtn()
	{
		return driver.findElement(addLeaveBtn);
	}
	
	public WebElement getleaveType()
	{
		return driver.findElement(leaveType);
	}
}
