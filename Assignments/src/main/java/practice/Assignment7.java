package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class Assignment7 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/#");
		driver.manage().window().maximize();
		
		List<WebElement>column= driver.findElements(By.xpath("//table[@class='table-display'] //th"));
		List<WebElement>rows= driver.findElements(By.xpath("//table[@class='table-display'] //tr"));
		
		System.out.println("columns=" + column.size());
		System.out.println("rows=" + rows.size());
		
		
		String text = driver.findElement(By.xpath("//table[@class='table-display'] //tr[3]")).getText();
	
	    System.out.println(text);
	    
		
// OR		
	    
//	    WebElement table=driver.findElement(By.id("product"));
//
//	    System.out.println(table.findElements(By.tagName("tr")).size());
//
//	    System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());
//
//	    List<WebElement> secondrow=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
//
//	    System.out.println(secondrow.get(0).getText());
//
//	    System.out.println(secondrow.get(1).getText());
//
//	    System.out.println(secondrow.get(2).getText());
	    
	}

}

//column- //table[@class="table-display"] //th
//rows- //table[@class="table-display"] //tr