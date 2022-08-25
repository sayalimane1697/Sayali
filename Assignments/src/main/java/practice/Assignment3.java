package practice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class Assignment3 {

	@Test
	public void test3() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(5));
		String[] items= {"Brocolli", "Tomato", "Cucumber"};
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		
//		driver.findElement(By.className("btn btn-success")).click();
//		
//		System.out.println("clicked user");
		
		driver.findElement(By.xpath("//label[@class='customradio'] //span[contains(text(), 'User')]")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='okayBtn']")));
		
		driver.findElement(By.xpath("//button[@id='okayBtn']")).click();
		
		WebElement staticDropdown=driver.findElement(By.xpath("//select[@data-style='btn-info']"));
		Select dd=new Select(staticDropdown);
		dd.selectByIndex(2);
		dd.getFirstSelectedOption();
		System.out.println(dd.getFirstSelectedOption().getText());
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		driver.findElement(By.id("signInBtn")).click();
		driver.findElement(By.xpath("//input[@value='admin']")).click();
		
	//got changed url
		w.until(ExpectedConditions.urlToBe("https://rahulshettyacademy.com/angularpractice/shop"));
//		System.out.println("Got url");
		
	String[] mobiles = {"iphone", "Samsung", "Nokia", "Blackberry"};
	
	Thread.sleep(2000);
	Assignment3 as=new Assignment3(); 
	as.addToKart(driver, mobiles);
	
	driver.findElement(By.xpath("//a[contains(text(), 'Checkout')]")).click();
	
	w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Checkout']")));
	driver.findElement(By.xpath("//button[normalize-space()='Checkout']")).click();
	
	driver.findElement(By.id("country")).sendKeys("India");
	System.out.println(driver.findElement(By.xpath("//label[@for='country']")).getText());
	driver.findElement(By.xpath("//label[@for='checkbox2']")).click();
	
	driver.findElement(By.cssSelector("[value='Purchase']")).click();
	
//	System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());
//	driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText();
	System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText().split(":")[0]);

	}
	    private static void addToKart(WebDriver driver, String[] mobiles) {
	    	
	    	int j=0;
	    	
	    	System.out.println(mobiles.length);
			List<WebElement> products = driver.findElements(By.xpath("//h4[@class='card-title']"));
			
			for(int i=0; i<products.size(); i++)
			{
				//String[] name=products.get(i).getText().split(" ");
				String mobilesName=products.get(i).getText();
				List<String> addList= Arrays.asList(mobilesName);
				
				if(addList.contains(mobilesName)) 
				{
					driver.findElement(By.xpath("//div[@class='card-footer']/button")).click();
					j++;
					
					if(j==mobiles.length)
					{
						break;
					}
				}
			}
		
	}

}
