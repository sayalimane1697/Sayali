//Link count

package maven_dd.dd;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Section11_links {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
//	give me the count of link on page
		System.out.println(driver.findElements(By.tagName("a")).size());

//	count of footer	
		WebElement footerDriver=driver.findElement(By.id("gf-BIG"));
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		
//	count of footer column 	
		WebElement footerColumn=driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(footerColumn.findElements(By.tagName("a")).size());
		
//	count of links within column
		for(int i=1; i< footerColumn.findElements(By.tagName("a")).size(); i++ )
		{
			String clickLink=Keys.chord(Keys.CONTROL, Keys.ENTER);
			
			footerColumn.findElements(By.tagName("a")).get(i).sendKeys(clickLink);
			Thread.sleep(5000L);
			
		}
		
		Set<String> ab=driver.getWindowHandles();
		Iterator<String> it=ab.iterator();
		
		while(it.hasNext())   //is next present or not
		{
			driver.switchTo().window(it.next()); //gives next window
			System.out.println(driver.getTitle());
		}

	}

}
