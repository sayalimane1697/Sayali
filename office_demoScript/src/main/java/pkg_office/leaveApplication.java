package pkg_office;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class leaveApplication {

	
	public void leaveMethod(WebDriver driver)
	{
		
//		driver.findElement(By.cssSelector("input[data-fieldname='leave_type']")).sendKeys("leave");
//		List<WebElement> options=driver.findElements(By.xpath("//ul[@role='listbox']/li/a/p")); //list<webelements> only use for driver.findelements
		
        Actions act = new Actions(driver);
		WebElement staticDropdown=driver.findElement(By.xpath("//ul[@id='awesomplete_list_4']"));
		staticDropdown.click();
		act.moveToElement(staticDropdown).click().build().perform();
		act.moveToElement(staticDropdown).sendKeys(Keys.DOWN).click().build().perform();
	
//		for(WebElement option: options)
//		{
//			if(option.getText().equalsIgnoreCase("leave with pay"))
//			{
//				option.click();
//				break;
//			}
//		}
//        System.out.println("paid");
//		driver.findElement(By.xpath("//p[@title='Leave with Pay']/child::strong")).click();
		
			
	}
	
}
