package maven_dd.dd;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Section9_waits_syncusage {

	@SuppressWarnings("static-access")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
 String[] items= {"Brocolli", "Tomato", "Cucumber"};
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
//    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	//Explicit wait
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		Thread.sleep(2000);
		Section9_waits_syncusage s=new Section9_waits_syncusage();
		s.addItems(driver,items);
		
		driver.findElement(By.cssSelector("[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='promoCode']"))); // explicit wait
		
		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
	
		driver.findElement(By.cssSelector(".promoBtn")).click();
		System.out.println("applycode");
	
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoInfo"))); // explicit wait
		
		System.out.println(driver.findElement(By.cssSelector(".promoInfo")).getText());		
	}

	private static void addItems(WebDriver driver, String[] items) {
		
        int j=0;

		List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));

		for(int i=0;i<products.size();i++)
		{
			String[] name=products.get(i).getText().split("-");
			String productName=name[0].trim();
			List itemsList = Arrays.asList(items);
			
			if(itemsList.contains(productName))
			{
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				
				if(j==items.length)
				{
					break;
				}
			}
		}
	
		
	}	
}
