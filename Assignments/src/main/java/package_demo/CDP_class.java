package package_demo;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;


public class CDP_class {


		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "C:/Program Files/Driver/chromedriver_win32/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();

			DevTools devt=driver.getDevTools();
			devt.createSession();
			Map deviceMetrics = new HashMap(); 
			deviceMetrics.put("width", 700);
			deviceMetrics.put("heigth", 1000);
			deviceMetrics.put("deviceScaleFactor", 50);
			deviceMetrics.put("mobile", true); 
			
			driver.executeCdpCommand("Emulation.setDeviceMetricsOverride", deviceMetrics);
			driver.get("https://rahulshettyacademy.com/angularAppdemo/");
			 
			driver.findElement(By.cssSelector(".navbar-toggler-icon")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Library")).click(); 
		}       

	}


