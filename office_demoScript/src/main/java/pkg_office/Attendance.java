package pkg_office;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Attendance extends base {

	
	public void addAttedance(WebDriver driver) throws InterruptedException {
		
		
		driver.findElement(By.xpath("//div[text()= 'Add Attendance']")).click();

//	System.out.println(java.time.LocalDate.now());

		Thread.sleep(2000);

		System.out.println(driver.findElement(By.xpath("//input[@data-fieldname='attendance_date']")).isDisplayed());

		driver.findElement(By.xpath("//input[@data-fieldname='attendance_date']")).click(); 
		driver.findElement(By.cssSelector("span[data-action='today']")).click();
		
		System.out.println(driver.findElement(By.xpath("//input[@data-fieldname='attendance_date']")).getAttribute("value"));
  
  String s = driver.findElement(By.xpath("//div[contains(@data-fieldname,'company')] //div[contains(@class,'control-value')]")).getText();
  System.out.println(s);
  
  System.out.println( driver.findElement(By.xpath("(//input[@class='input-with-feedback form-control bold'])[1]")).getAttribute("value"));

		WebElement dd = driver.findElement(By.cssSelector("select[data-fieldname='status']"));
		Select option = new Select((WebElement) dd);
		option.selectByIndex(1);
		System.out.println(option.getFirstSelectedOption().getText());
        System.out.println(driver.findElement(By.cssSelector("div[data-fieldname='employee_name']")).getText().split("Name")[1].trim());
      
		driver.findElement(By.cssSelector("button[data-label='Save']")).click();
//		Thread.sleep(1000);
//		System.out.println(driver.findElement(By.cssSelector(".modal-content")).getText().split("Message")[1].trim());
		
		Thread.sleep(1000);
		Actions act= new Actions(driver);
		WebElement e=driver.findElement(By.id("page-Attendance"));
		act.moveToElement(e).click().build().perform();
		
		
	}
		
}


//List<WebElement> dd = driver.findElements(By.xpath("//div/select[@data-fieldname='status']/option"));
//System.out.println(dd.size());
//Select option = new Select(dd.get(3));
//System.out.println(dd.get(0).getText());
//for (int i=0; i< dd.size(); i++)
//{
//	for(int j=0; j<i; j++)
//	{
//	Select op = new Select (dd.get(j));
//	op.selectByIndex(j); 
//	System.out.println(op.getFirstSelectedOption().getText());
//	}
//}


