
//add to cart

package maven_dd.dd;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Section8_addtocart {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
/*	    String[] items= {"Beans - 1 Kg", "Carrot - 1 Kg", "Brocolli - 1 Kg"};	
		List<WebElement> count=driver.findElements(By.cssSelector(".product-name"));
 	   for(int i=0;i<count.size();i++)
		{
			String name = count.get(i).getText();
	        //System.out.println(name);
			if(name.contains("Tomato"))
		   {
			driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
		   }
		}
	    System.out.println("tomato");
  		
		for (int j = 0; j < count.size(); j++) 
		{
			String name = count.get(j).getText();
			List itemslist = Arrays.asList(items); // multiple selection in one cmd
			if (itemslist.contains(name)) 
			{
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(j).click();
			}	
		}
	    System.out.println("items");
		//driver.close();
*/	    
		
		// OR 
		
		String[] itemsNeeded= {"Beans", "Tomato", "Carrot", "Brocolli"};
		List<WebElement> items=driver.findElements(By.cssSelector(".product-name"));
		
		Thread.sleep(3000);

		addItems(driver,itemsNeeded);

		}

		public static  void addItems(WebDriver driver,String[] itemsNeeded)

		{

		int j=0;

		List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));

		for(int i=0;i<products.size();i++)

		{

		String[] name=products.get(i).getText().split("-");

		String formattedName=name[0].trim();

		List itemsNeededList = Arrays.asList(itemsNeeded);

		if(itemsNeededList.contains(formattedName))

		{

		j++;

		//click on Add to cart

		driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

		if(j==itemsNeeded.length)

		{

		break;

		}

		}

		}
		
	    
    }
}
