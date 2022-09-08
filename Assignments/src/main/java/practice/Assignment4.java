package practice;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class Assignment4 {

	@Test
	public void test4() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		

		driver.findElement(By.xpath("//ul/li/a[@href='/windows']"));
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
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
		        
		        TakesScreenshot ts = (TakesScreenshot)driver;
		    	File file = ts.getScreenshotAs(OutputType.FILE);
		    	try {
					FileUtils.copyFile(file, new File("logo.png"));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
//		    	String save = System.getProperty("user.dir")+"\\reports\\"+methodName + ".png";
		    	  
		 driver.quit();    	

	}

}
