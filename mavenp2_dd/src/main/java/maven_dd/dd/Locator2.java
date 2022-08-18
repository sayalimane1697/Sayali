//class name & tag name

package maven_dd.dd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
	
		driver.manage().window().maximize(); //maximize web page
	
	//to findout total advertize/images list count having same class name
	//Using Class Name
		int slider=driver.findElements(By.className("homeslider-container")).size(); //size used return total number 
		System.out.println(slider);
		
	//Using Tag Name
		int links=driver.findElements(By.tagName("a")).size();
		System.out.println(links);
		
		driver.close();

	}

}
