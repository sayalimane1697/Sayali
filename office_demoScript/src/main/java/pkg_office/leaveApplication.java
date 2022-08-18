package pkg_office;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class leaveApplication {

	
	public void leaveMethod(WebDriver driver)
	{
		driver.findElement(By.xpath("//img[@class='app-logo']")).click();
		driver.findElement(By.xpath("//div[normalize-space()='Add Leave Application']")).click();
		
		driver.findElement(By.cssSelector("input[data-fieldname='leave_type']")).sendKeys("leave");
		driver.findElement(By.xpath("//p[@title='Leave with Pay']/child::strong")).click();
			
		}
	
}
