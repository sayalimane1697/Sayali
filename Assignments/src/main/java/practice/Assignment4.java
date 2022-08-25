package practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

@Test
public class Assignment4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		

		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		Set<String> windows=driver.getWindowHandles();
		Iterator<String>it=windows.iterator();
		String parentId=it.next();
		String childId=it.next();
		// String subChildId=it.next();

		driver.switchTo().window(childId);
		System.out.println(driver.findElement(By.cssSelector(".example")).getText());

		driver.switchTo().window(parentId);
		// System.out.println(driver.findElement(By.cssSelector(".example")).getText());
		// driver.findElement(By.cssSelector(".example")).getText();
		System.out.println(driver.findElement(By.cssSelector(".example")).getText().split("Click")[0]);

		        driver.quit();

	}

}
