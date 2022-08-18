//CSS selector

package maven_dd.dd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://practice.automationtesting.in/my-account/");
	
		driver.manage().window().maximize(); //maximize web page
	
	//tag & id..... represent as #id
		//driver.findElement(By.cssSelector("#email")).sendKeys("idemail");
		//driver.findElement(By.cssSelector("input#email")).sendKeys("idemail");
		
		//driver.findElement(By.cssSelector("#pass")).sendKeys("idpass");
		//driver.findElement(By.cssSelector("input#pass")).sendKeys("idpass");
		
	//tag & class..... represent as .class
		//driver.findElement(By.cssSelector(".inputtext")).sendKeys("classemail");       //these syntax will perform only individually.. due to multiple elements 1st element will be considered
		//driver.findElement(By.cssSelector("input.inputtext")).sendKeys("classemail");   //these syntax will perform only individually
		
	//tag & attribute[]
		//driver.findElement(By.cssSelector("input[name=email]")).sendKeys("locate");
		//driver.findElement(By.cssSelector("[name=email]")).sendKeys("locate");
		
		//driver.findElement(By.cssSelector("input[name=pass]")).sendKeys("locate");
		//driver.findElement(By.cssSelector("[name=pass]")).sendKeys("locate");
		

	//tag,class,attribute.....  when there is same class name present for all elements, then it use to differentiate matching multiple element
		//driver.findElement(By.cssSelector(".inputtext[name=email]")).sendKeys("xyz");
		//driver.findElement(By.cssSelector(".inputtext[name=pass]")).sendKeys("xyz");
		
		driver.findElement(By.cssSelector(".woocommerce-Input[name=username]")).sendKeys("pavanoltraining");
		driver.findElement(By.cssSelector(".woocommerce-Input[name=password]")).sendKeys("pavanoltraining");

		driver.close();

	}

}
