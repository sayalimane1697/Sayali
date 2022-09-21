package practice_1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;

public class base_class {
	
	
	public WebDriver driver;
	
	public WebDriver initializeDriver() {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Driver\\chromedriver_win32\\chromedriver.exe");
//	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	
	
	return driver;
	}
	
	
//	public void getScreenshot(ITestResult result) {
//		
//		if(ITestResult.FAILURE == result.getStatus()) {
//			
//		try {
//			TakesScreenshot ts = ((TakesScreenshot)driver);
//			File file= ts.getScreenshotAs(OutputType.FILE);
//			FileUtils.copyFile(file, new File("test.png"));
//			System.out.println("Screenshot is captured");
//			
//			} 
//		
//		catch (IOException e) {
//				// TODO Auto-generated catch block
//			System.out.println("Screenshot is not captured");
//
//			}
//		    	
//		}
//	}

	
}
