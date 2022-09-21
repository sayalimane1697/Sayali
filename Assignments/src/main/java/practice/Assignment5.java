package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import practice_1.base_class;


public class Assignment5 extends base_class {
	
	@BeforeTest
	public void initialize() {
		
		driver=initializeDriver();
		}
	

	@Test
	public void test5() {
		
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Nested Frames")).click();
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-middle");
		System.out.println(driver.findElement(By.id("content")).getText());

	}

	@AfterTest
	public void close()
	{
		driver.close();
	}
	
}
