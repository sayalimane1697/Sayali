package maven_dd.dd;

import java.util.Iterator;
import java.util.Set;

import javax.swing.text.html.CSS;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Section10_windowsFrames {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
//		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
//		driver.manage().window().maximize();
		
//		driver.findElement(By.cssSelector(".blinkingText")).click();
//		Set<String> windows= driver.getWindowHandles();
//		Iterator<String>it= windows.iterator(); //to find ids of different windows (parentid childid)
//		String parentId= it.next();
//		String childId= it.next();
//		driver.switchTo().window(childId);
//		
//		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
//		driver.findElement(By.cssSelector(".im-para.red")).getText();
//	String id=driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
//        driver.switchTo().window(parentId);
//	    driver.findElement(By.id("username")).sendKeys(id);
	    
		
//frames and dropdown
		
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		driver.switchTo().frame(0);
//		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
//		driver.findElement(By.id("draggable")).click();	    
	    
	    Actions a=new Actions(driver);
	    WebElement source=driver.findElement(By.id("draggable"));
	    WebElement target=driver.findElement(By.id("droppable"));
	    
	    a.dragAndDrop(source, target).build().perform();
	    driver.switchTo().defaultContent();  //when u want to exit frame
	}

}
