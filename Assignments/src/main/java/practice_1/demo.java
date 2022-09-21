package practice_1;

import java.io.File;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo {

        @Test
	    public void testGuru99TakeScreenShot() throws Exception{

			WebDriver driver ;
//	    	System.setProperty("webdriver.chromedriver.driver","C:\\Program Files\\Driver\\chromedriver_win32\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
	    	driver = new ChromeDriver();

	        //goto url

//	        driver.get("http://demo.guru99.com/V4/");

	        //Call take screenshot function
	    	
	    	driver.get("https://the-internet.herokuapp.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

			driver.findElement(By.xpath("//ul/li/a[@href='/windows']")).click();
			WebElement element= driver.findElement(By.xpath("//a[text()='Click Here']")); 
			Actions act= new Actions(driver);
//		    act.moveToElement(element).click();
		
			this.takeSnapShot(driver, "C:\\Users\\SayaliMane\\Assignment4.png") ;   
			
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

	    /**

	     * This function will take screenshot

	     * @param webdriver

	     * @param fileWithPath

	     * @throws Exception

	     */

	    public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{

	        //Convert web driver object to TakeScreenshot

	        TakesScreenshot scrShot =((TakesScreenshot)webdriver);

	        //Call getScreenshotAs method to create image file

	                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

	            //Move image file to new destination

	                File DestFile=new File(fileWithPath);

	                //Copy file at destination

	                FileUtils.copyFile(SrcFile, DestFile);

	    

	}

}
