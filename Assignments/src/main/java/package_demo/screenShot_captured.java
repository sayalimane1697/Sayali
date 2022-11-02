package package_demo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screenShot_captured {
	
	public static WebDriver driver;

	public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
//	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Driver\\chromedriver_win32\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.get("http://www.google.com");
	driver.findElement(By.xpath("//input[@title=\"Search\"]")).sendKeys("Google images");
	
	screenShot_captured ss=new screenShot_captured();
	ss.screenShot();
	
	driver.close();
	
	}


   public static void screenShot() {
	
	File shot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	try {
	
		FileUtils.copyFile(shot,new File("shot.png"));
	} 
	catch (IOException e)
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
 }
	 
}


