package maven_dd.dd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Program Files/Driver/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/search?q=marathi+to+english+translation&oq=marathi+to+english+&aqs=chrome.1.69i57j0i512l5j69i65l2.12078j0j4&sourceid=chrome&ie=UTF-8#bsht=CgRmYnNtEgIIBA");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[@title='Swap languages']//*[name()='svg']")).click();
		driver.findElement(By.xpath("//textarea[@id='tw-source-text-ta']")).sendKeys("Sports");
		driver.findElement(By.xpath("//span[@id='tw-src-spkr-button']//span[@title='Listen']//*[name()='svg']//*[name()='path' and contains(@d,'M3 9v6h4l5')]")).click();

		driver.close();

	}

}
