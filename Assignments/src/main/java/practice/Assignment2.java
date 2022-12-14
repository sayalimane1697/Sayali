package practice;

	import java.time.Duration;
	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import practice_1.base_class;

	public class Assignment2 extends base_class{
		
		@BeforeTest
		public void initialize() {
			
			driver=initializeDriver();
		}

		@Test
		public void test2() {

			driver.get("https://rahulshettyacademy.com/angularpractice/");
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
		    driver.findElement(By.xpath("//div[@class='form-group']//input[@name='name']")).sendKeys("abc");
	     
	        driver.findElement(By.xpath("//div[@class='form-group']//input[@name='email']")).sendKeys("abc12@gmail.com");
	        
	        driver.findElement(By.cssSelector("#exampleInputPassword1")).sendKeys("12345");
	        
	        System.out.println(driver.findElement(By.id("exampleCheck1")).isSelected());
	        driver.findElement(By.id("exampleCheck1")).click();
	        System.out.println(driver.findElement(By.id("exampleCheck1")).isSelected());
	        

	        driver.findElement(By.xpath("//select[@id='exampleFormControlSelect1']")).click();
			List<WebElement> options=driver.findElements(By.xpath("//option[normalize-space()='Female']"));
			for(WebElement option: options)
			{
				if(option.getText().equalsIgnoreCase("Female"))
				{
					option.click();
					
					break;
				}
			} 
			
			System.out.println(driver.findElement(By.id("inlineRadio1")).isEnabled());
			driver.findElement(By.id("inlineRadio1")).click();
			System.out.println("Select: Student");
			
			driver.findElement(By.xpath("//div[@class='form-group'] //input[@type='date']")).sendKeys("10/12/2000");
			System.out.println("DOB");

			driver.findElement(By.cssSelector(".btn[value='Submit']")).click();
			
			System.out.println(driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText());
	
		
	}

		@AfterTest
		public void close()
		{
			driver.close();
		}
	
	
}
