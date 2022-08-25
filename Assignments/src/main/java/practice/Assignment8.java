package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class Assignment8 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/#");
		
	   driver.findElement(By.id("autocomplete")).sendKeys("can");
	   Thread.sleep(2000);
	   driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
	   driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
	  
	   System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));
	   
	   
//		List<WebElement> options= driver.findElements(By.xpath("//ul/li[@class='ui-menu-item']/div"));	
	   
//       for(int i=0; i<= driver.findElements(By.xpath("//ul/li[@class='ui-menu-item']/div")).size(); i++)
//       {
//    	   if()
//    	   {
//    		   act.moveToElement(target).click().build().perform();
//    	   }
//       }
       
       
//		for(int i=0; i< options.size(); i++)
//		{
//			if(options.get(i).equals("Canada"))
//			{
//				options.get(i).click();
//			}
//		}
//		System.out.println("Canada");
 

	}

}
