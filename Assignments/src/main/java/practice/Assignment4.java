package practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import javax.management.remote.JMXServiceURL;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import practice_1.base_class;


public class Assignment4 extends base_class  {
	
	 static WebDriver driver;
	 
	@BeforeTest
	public void initialize() {
		
		driver=initializeDriver();
	}


	@Test
	public void test4() throws IOException {
		
	

		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//ul/li/a[@href='/windows']")).click();
		WebElement element= driver.findElement(By.xpath("//a[text()='Click Here']")); 
		Actions act= new Actions(driver);

		//	    act.moveToElement(element).click();
		
//		Set<String> windows=driver.getWindowHandles();
//		Iterator<String>it=windows.iterator();
//		String parentId=it.next();
//		String childId=it.next();
//		// String subChildId=it.next();
//
//		driver.switchTo().window(childId);
//		System.out.println(driver.findElement(By.cssSelector(".example")).getText());
//
//		driver.switchTo().window(parentId);
//		System.out.println(driver.findElement(By.cssSelector(".example")).getText());
//		driver.findElement(By.cssSelector(".example")).getText();
//		System.out.println(driver.findElement(By.cssSelector(".example")).getText().split("Click")[0]);
		
		
	}

		public static void getScreenshot(WebDriver webdriver, String path) {
			
			try {
				TakesScreenshot ts = ((TakesScreenshot)webdriver);
				File srcf= ts.getScreenshotAs(OutputType.FILE);
				File destf= new File(path);
//				FileUtils.copyFile(srcf, destf); 
				FileUtils.copyFile(srcf, new File("Fail1.png")); // need apache common.in jar
				System.out.println("Screenshot is captured");
				
				} 
			
			catch (Exception e) {
					// TODO Auto-generated catch block
				System.out.println("Screenshot is not captured");

				}
//			    	

	}
		
	
// 

//	public static void getScreenshot(ITestResult result) {
//		
//	
//		if (ITestResult.FAILURE == result.getStatus()) {
//
//	           try {
//
//	               TakesScreenshot screenshot = ((TakesScreenshot) driver);
//
//	                File file = screenshot.getScreenshotAs(OutputType.FILE);
//
//	               FileUtils.copyFile(file, new File("test.png"));
//
//	               System.out.println("Screnshot is Captured");
//
//	           } catch (Exception e) {
//	                // TODO: handle exception
//
//	               System.out.println("Screnshot is not Captured");
//		
//	           }
//		}	
//	}

	@AfterTest
	public void close()
	{
		driver.close();
	}
	
}
