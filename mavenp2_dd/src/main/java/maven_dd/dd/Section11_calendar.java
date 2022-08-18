package maven_dd.dd;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Section11_calendar {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().window().maximize();
		
		Section11_calendar sec=new Section11_calendar();
//		if (true)
//		{
//			driver.findElement(By.xpath("//div[@class='sumome-react-svg-image-container']")).click();
//		}
//		else
//		{
//			System.out.println("popup not found");
//		}

	    w.until(ExpectedConditions.visibilityOfElementLocated(By.id("travel_date")));
		driver.findElement(By.id("travel_date")).click();
// while loop will keep executes until it become false	
// symbol ! makes true-false and false-true
		
		while(!driver.findElement(By.xpath("//div[@class='datepicker-days'] //th[@class='datepicker-switch']")).getText().contains("April")) 
		{
			driver.findElement(By.xpath("//div[@class='datepicker-days'] //th[@class='datepicker-switch']")).click();
		}
		
		List<WebElement> dates= driver.findElements(By.cssSelector(".day"));
		int url=driver.findElements(By.cssSelector(".day")).size();
		
		for(int i=0; i< url; i++)
		{
			String t=driver.findElements(By.cssSelector(".day")).get(i).getText();
			if(t.equalsIgnoreCase("23"))
			{
				driver.findElement(By.cssSelector(".day")).click();
				break;
			}
		}
		
	}

}
