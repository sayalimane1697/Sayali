package maven_dd.dd;

import static org.openqa.selenium.support.locators.RelativeLocator.*;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_Features {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); 
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
//		WebElement nameEditBox =driver.findElement(By.cssSelector("[name='name']"));
//		System.out.println(driver.findElement(with(By.tagName("label")).above(nameEditBox)).getText()); // have to import static package for relative locator
//
//		WebElement DOB =driver.findElement(By.cssSelector("[for='dateofBirth']")); // if flex is present on line it will not locate any locator 
//		driver.findElement(with(By.tagName("input")).below(DOB)).click();
//		
//		WebElement checkbox = driver.findElement(By.cssSelector("[class='form-check-label']"));
//		driver.findElement(with(By.tagName("input")).toLeftOf(checkbox)).click();
//		
//		WebElement radio = driver.findElement(By.id("inlineRadio2"));
//		System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(radio)).getText());

		
// parent-child windows
		
	    driver.switchTo().newWindow(WindowType.TAB); // it will open new tab
//	    driver.switchTo().newWindow(WindowType.WINDOW); // it will open new window
	   Set<String> handle = driver.getWindowHandles();
	   Iterator<String> it = handle.iterator();
	   String parentId = it.next();
	   String childId = it.next();
	   driver.switchTo().window(childId);
	   driver.get("https://rahulshettyacademy.com/#/index");
	   
	 String courseName =  driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(1).getText();
	   
	   driver.switchTo().window(parentId);
	   WebElement name= driver.findElement(By.cssSelector("[name='name']"));
	   name.sendKeys(courseName);
	   
// get height and width dimentions
	   
	   System.out.println(name.getRect().getDimension().getHeight()); // name.getRect().getHeight() we can use this also
	   System.out.println(name.getRect().getDimension().getWidth());

	    
//	   driver.quit();
		
	}

}
