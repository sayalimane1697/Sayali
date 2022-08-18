package maven_dd.dd;

import java.time.Duration;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class Dropdown {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	//static dropdown with select tag
		WebElement staticDropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown=new Select(staticDropdown); // using select it means static dd
		dropdown.selectByIndex(0);
		dropdown.getFirstSelectedOption();
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
	//multiclick
        driver.findElement(By.id("divpaxinfo")).click(); 
        Thread.sleep(2000L);
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		for(int i=1;i<4;i++)
		{
	    driver.findElement(By.id("hrefIncAdt")).click();  // 4 times
		}

		driver.findElement(By.id("hrefIncChd")).click();
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println( driver.findElement(By.id("divpaxinfo")).getText());
		
	//dynamic dropdown 
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BOM']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("(//a[@value='GOI'])[2]")).click(); // these is index step
		
	driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='GOI']")).click(); //parent-child technique.. instead of using index
		System.out.println("Mumbai-Goa");
        
	//auto select options
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		List<WebElement> options=driver.findElements(By.cssSelector("li[class='ui-menu-item'] a")); //list<webelements> only use for driver.findelements
		for(WebElement option: options)
		{
			if(option.getText().equalsIgnoreCase("India"))
			{
				option.click();
				break;
			}
		}
        System.out.println("IND");
		
        
	//checkbox select
/*		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
		driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
*/
		
	//testNG framework
		Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
		driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
		Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
	    System.out.println("TestNG");
	    
	    
	    
	//will continue to search
	    
	    driver.findElement(By.xpath("//td[@class=\" ui-datepicker-days-cell-over  ui-datepicker-today\"] //a[contains(@class, 'ui-state-highlight')]")).click();
		System.out.println("July 29");
		
	    
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
	
	    
	    driver.findElement(By.xpath("//input[@id='ctl00_mainContent_btn_FindFlights']")).click();
	    
	    driver.close();
	    
	//    
	    
	    
	}
	
}
