package maven_dd.dd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.manage().window().maximize();
		
	//Absolute Xpath 
	    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[2]/form[1]/input[4]")).sendKeys("Dresses");
	    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[2]/form[1]/button[1]")).click();
	    
	//Relative Xpath
	    driver.findElement(By.xpath("//*[@id='search_query_top']")).sendKeys("T-shirts");
	    driver.findElement(By.xpath("//button[@name='submit_search']")).click();
	    
	//Operators or (if 1 attribute is right then it will locate element)
	    driver.findElement(By.xpath("//*[@id='search_query_top' or @name='search_query1']")).sendKeys("T-shirts");
	    driver.findElement(By.xpath("//*[@name='submit_search1' or @class='btn btn-default button-search']")).click();

	//Operators and (both sttributes should be right to locate element)
	    driver.findElement(By.xpath("//*[@id='search_query_top' and @name='search_query']")).sendKeys("T-shirts");
	    driver.findElement(By.xpath("//*[@name='submit_search' and @class='btn btn-default button-search']")).click();
		
	//Operator contains() 	
		driver.findElement(By.xpath("//*[contains(@id, 'search_query')]")).sendKeys("T-shirts");
		driver.findElement(By.xpath("//*[contains(@name, 'submit')]")).click();
		
	//Operator starts-with()
		driver.findElement(By.xpath("//*[starts-with(@id, 'sea')]")).sendKeys("T-shirts");
		driver.findElement(By.xpath("//*[starts-with(@name, 'sub')]")).click();
	
	//Operator text()
		driver.findElement(By.xpath("//a[text()='Women']")).click();		// women tab...linktext
		
	//Operator chained xpath	
//		driver.findElement(By.xpath("//form[@id='searchbox']//button[1]")).click();	

		
		//click on button 2 using xpath;
		
		//click on button 3 using xpath;
		
		
		driver.close();

	}

}
