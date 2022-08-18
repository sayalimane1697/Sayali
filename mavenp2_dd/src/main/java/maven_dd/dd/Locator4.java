package maven_dd.dd;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator4 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@name='loginfmt']")).sendKeys("");
		driver.findElement(By.xpath("//input[@id='idSIButton9']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='passwd']")).sendKeys("");
		driver.findElement(By.xpath("//input[@value='Sign in']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Yes']")).click();
	/*	try
		{
			//driver.findElement(By.xpath("//input[@name='passwd']/ancestor::div[1]/following::input[1]")).click();
			driver.findElement(By.xpath("//input[@value='Sign in']")).click();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			
		}
		
	*/	
	     driver.findElement(By.xpath("//span[contains(@id, 'Canada_5')]/ancestor::tr/following::tr[3]"));	
		 System.out.println("Success");
	
		driver.close();

	}

}
