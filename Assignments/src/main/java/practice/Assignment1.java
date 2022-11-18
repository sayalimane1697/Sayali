package practice;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;
import practice_1.base_class;


public class Assignment1 extends base_class {
	
	@BeforeTest
	public void initialize() {
		
		driver=initializeDriver();
	}

  @Test(groups= {"test1"})
  public void test1() {
	  
	  
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
		driver.findElement(By.id("checkBoxOption1")).click();
		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
		
	
		
//		driver.findElement(By.id("name")).sendKeys("Sayali");
//		driver.findElement(By.id("alertbtn")).click();
//		System.out.println(driver.switchTo().alert().getText()); //alert popup handling 
//		driver.switchTo().alert().accept();
  }
		
		@AfterTest
		public void close()
		{
			driver.close();
		}
	
 
}
