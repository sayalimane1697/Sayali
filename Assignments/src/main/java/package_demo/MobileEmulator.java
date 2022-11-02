package package_demo;

import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v102.emulation.Emulation;


public class MobileEmulator {


		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "C:/Program Files/Driver/chromedriver_win32/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver(); //to access chrome devtools
			
			DevTools devt = driver.getDevTools();
			devt.createSession();
			 
	//send cmd to CDP method
			devt.send(Emulation.setDeviceMetricsOverride(600, 1000, 50, true, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty()));
			driver.get("https://rahulshettyacademy.com/angularAppdemo/");
			driver.findElement(By.cssSelector(".navbar-toggler-icon")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Library")).click();
			
	//network.getRequest postData
			
			
		} 
}



