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
import org.openqa.selenium.support.ui.Wait;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import dev.failsafe.Timeout;
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
		
		this.getScreenshot(driver, "C:\\Users\\SayaliMane\\ScreenShots\\assign4.png");
//		File ss=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(ss, new File("output4.png")); 
		
		Set<String> windows=driver.getWindowHandles();
		Iterator<String>it=windows.iterator();
		String parentId=it.next();
		String childId=it.next();
		// String subChildId=it.next();

		driver.switchTo().window(childId);
		System.out.println(driver.findElement(By.cssSelector(".example")).getText());

		driver.switchTo().window(parentId);
		System.out.println(driver.findElement(By.cssSelector(".example")).getText());
		driver.findElement(By.cssSelector(".example")).getText();
		System.out.println(driver.findElement(By.cssSelector(".example")).getText().split("Click")[0]);
		
		
	}

		public static void getScreenshot(WebDriver webdriver, String path) {
			
			try {
				TakesScreenshot ts = ((TakesScreenshot)webdriver);
				File srcf= ts.getScreenshotAs(OutputType.FILE);
				File destf= new File(path);
				FileUtils.copyFile(srcf, destf); 
				FileUtils.copyFile(srcf, new File("Fail.png")); // need apache common.in jar
				System.out.println("Screenshot is captured");
				
				} 
			
			catch (Exception e) {
					// TODO Auto-generated catch block
				System.out.println("Screenshot is not captured");

				}
//			    	

	}
		
	

	@AfterTest
	public void close()
	{
		driver.close();
	}
	
}
