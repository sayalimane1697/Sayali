package maven_dd.dd;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Dropdown_calender {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BOM']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("(//a[@value='GOI'])[2]")).click(); // these is index step
		
	driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='GOI']")).click(); //parent-child technique.. instead of using index
		System.out.println("Mumbai-Goa");
	
		
/*		driver.findElement(By.xpath("//td[@class=\" ui-datepicker-days-cell-over  ui-datepicker-today\"] //a[contains(@class, 'ui-state-highlight')]")).click();
		System.out.println("July 29");
		
		
		System.out.println(driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).isEnabled());
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
	    System.out.println(driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).isEnabled());
*/	    
	    
	    
	 // System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());

	    System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

	    driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

	    System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

	    if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
	    {
	      System.out.println("its enabled");
	    Assert.assertTrue(true);
	    }
	    else
	    {
	      Assert.assertTrue(false);
	    }
	

			
		//driver.close();
	}

}
