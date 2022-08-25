package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class Assignment6 {

	@Test
	public void test6() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/#");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[3]")).click();
		String op=driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[3]")).getText();
		
		WebElement staticDropdown=driver.findElement(By.id("dropdown-class-example"));
		Select dropdown=new Select(staticDropdown); // using select it means static dd
		dropdown.selectByVisibleText(op);
	
		driver.findElement(By.xpath("//fieldset[@class='pull-right'] //input[@id='name']")).sendKeys(op);
		driver.findElement(By.id("alertbtn")).click();
		String t=driver.switchTo().alert().getText();
		
		if(t.contains(op))
		{
			System.out.println(t);
			driver.switchTo().alert().accept();
		}
		
	}

}


//select checkbox and grab text of it
//select an option in dd (it should be come from above step)
//enter selected dd option in editbox (we have grab option from checkbox text)
//click alert and verify grabbed option should be present in alert window