package pkg_office;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.landingPage;
import pageObject.loginPage;

public class Debugger {
// static WebDriver driver;
 static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setExperimentalOption("debuggerAddress", "localhost:9988");
        driver= new ChromeDriver(chromeOptions);
    	driver.get("https://onebeta.systenics.com/app");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		landingPage land= new landingPage(driver);
		loginPage login = new loginPage(driver);
	
//		land.getexplore().click();
//		land.getbtn().click();
//		land.getbtnOfc().click();
//		
//	
//		login.getemail().sendKeys("sayali.m@systenics.net");
//		login.geteclick().click();
//		login.getpassword().sendKeys("a67!FT@Kc$CT7WZ");
//		Thread.sleep(1000);
//		login.getpclick().click();
//		login.getlogin().click();
//		System.out.println("login success");
		
		Attendance at = new Attendance();
	    at.addAttedance(driver);
	    System.out.println("attendance filled successfully");
		
	    Thread.sleep(1000);
		leaveApplication leave = new leaveApplication();
		Thread.sleep(3000);
		land.getlogo().click();
		land.getaddLeaveBtn().click();
		leave.leaveMethod(driver);
		
		
	    
//	    wfh w = new wfh(driver);
//	    w.wfh(driver);
	 
	}

}
