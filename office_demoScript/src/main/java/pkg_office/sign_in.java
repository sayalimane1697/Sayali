package pkg_office;


import java.io.IOException;
import java.time.Duration;
import org.testng.annotations.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.landingPage;
import pageObject.loginPage;

public class sign_in extends base{


	@BeforeTest
	public void initialize() throws IOException
	{
		driver=initializeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void pageNavigation() throws InterruptedException
	{
	
		driver.get(prop.getProperty("url"));
		
		
		landingPage land= new landingPage(driver);
		loginPage login = new loginPage(driver);
		land.getexplore().click();
		land.getbtn().click();
		land.getbtnOfc().click();
	
		login.getemail().sendKeys("sayali.m@systenics.net");
		login.geteclick().click();
		login.getpassword().sendKeys("a67!FT@Kc$CT7WZ");
		login.getpclick().click();
		login.getlogin().click();
		System.out.println("login sucess");
		
		Attendance at = new Attendance();
	    at.addAttedance(driver);
	    System.out.println("attendance filled successfully");
	
		leaveApplication leave = new leaveApplication();
		Thread.sleep(3000);
		land.getlogo().click();
		land.getaddLeaveBtn().click();
		leave.leaveMethod(driver);
		
	}
	

//	@AfterTest
//	public void close()
//	{
//		driver.close();
//	}
	
	
//	@DataProvider
//	public Object[][] getData()
//	{
//	Object[][] data = new Object[1][2];
//	
//	data[0][0]="sayali.m@systenics.net";
//	data[0][1]="a67!FT@Kc$CT7WZ";
//	
//	return data;
//	}
//	


	
	
}

