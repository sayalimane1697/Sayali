package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import testNG_pkg.RediffLogin;

public class RediffLoginApp {
	
	@Test
	public void Login() {
	System.setProperty("webdriver.chrome.driver", "C:/Program Files/Driver/chromedriver_win32/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	RediffLogin rediff= new RediffLogin(driver);
	rediff.emailid().sendKeys("Name");
	rediff.password().sendKeys("Name");
	rediff.login().click();
	rediff.home().click();
	
	}

}
