package maven_dd.dd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
	
		driver.manage().window().maximize(); //maximize web page
	
	//to findout total advertize/images list count having same class name	
/*		int count=driver.findElements(By.className("homeslider-container")).size();
		System.out.println(count);
*/

	//id & name locators... we have to store return statement in element WebElement
		WebElement searchbox=driver.findElement(By.id("search_query_top"));
		
		try
		{
		searchbox.sendKeys("T-shirts");
		
		driver.findElement(By.name("submit_search")).click();
		
	//linktext & partial linktext
		//driver.findElement(By.linkText("Faded Short Sleeve T-shirts")).click();
		driver.findElement(By.partialLinkText("Short Sleeve T-shirt")).click();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	driver.close();
		
	}

}
