package maven_dd.dd;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Section12_scrollParsing {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/#");
		driver.manage().window().maximize();
		
	JavascriptExecutor js= (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,500)");
		
	Thread.sleep(3000);
	js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
	      
	System.out.println("Success");	
	
	     List<WebElement>city= driver.findElements(By.xpath("//div[@class='tableFixHead'] //td[3]"));
	     List<WebElement>values= driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		
//	     xpth- //div[@class="tableFixHead"] //td[3]
//	     cssSelector- .tableFixHead td:nth-child(3)
	     
	     System.out.println(city.size() + "-City, "+ values.size() + "-Value");
	     int i=0, j=0, sum=0;
	     
		 for(i=0; i< city.size(); i++)
		 {
			System.out.println((city.get(i).getText())); 
		 }
		 
		 for(j=0; j< values.size(); j++)
		 {
			System.out.println(Integer.parseInt(values.get(j).getText())); //convert string into integer
			sum=sum + Integer.parseInt(values.get(j).getText());
		 }
		 System.out.println(sum);
		 
		 driver.findElement(By.cssSelector(".totalAmount")).getText();
		int total=Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
		
		
		if (sum == total) {
			Assert.assertEquals(sum, total);
			System.out.println("assertion pass");
		}
		 
	}

}
