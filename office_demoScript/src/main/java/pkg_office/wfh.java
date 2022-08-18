package pkg_office;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class wfh extends base{
	
	public void workFH(WebDriver driver) throws InterruptedException 
	{
		driver.findElement(By.xpath("//div[text()= 'Add Attendance']")).click();
		
		Thread.sleep(2000);
		
		System.out.println(driver.findElement(By.xpath("//input[@data-fieldname='attendance_date']")).isDisplayed());

		driver.findElement(By.xpath("//input[@data-fieldname='attendance_date']")).click(); 

		driver.findElement(By.xpath("//div[@class='datepicker--cells datepicker--cells-days']/child::div[15]")).click();
		
		
		System.out.println(driver.findElement(By.xpath("//input[@data-fieldname='attendance_date']")).getAttribute("value"));

  String s = driver.findElement(By.xpath("//div[contains(@data-fieldname,'company')] //div[contains(@class,'control-value')]")).getText();
  System.out.println(s);
			
  System.out.println( driver.findElement(By.xpath("(//input[@class='input-with-feedback form-control bold'])[1]")).getAttribute("value"));

		WebElement dd = driver.findElement(By.cssSelector("select[data-fieldname='status']"));
		Select option = new Select(dd);
		option.selectByIndex(5);
		System.out.println(option.getFirstSelectedOption().getText());
        System.out.println(driver.findElement(By.cssSelector("div[data-fieldname='employee_name']")).getText().split("Name")[1].trim());
        
        Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[data-label='Save']")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.cssSelector(".modal-content")).getText().split("Message")[1].trim());
		
		Thread.sleep(1000);
		Actions act= new Actions(driver);
		WebElement e=driver.findElement(By.id("page-Attendance"));
		act.moveToElement(e).click().build().perform();
		
		System.out.println("WFH");
		
		
	}
	
	

}
