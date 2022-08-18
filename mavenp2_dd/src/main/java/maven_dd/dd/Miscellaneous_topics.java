package maven_dd.dd;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Connection;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.net.ssl.HttpsURLConnection;

import org.apache.commons.io.FileUtils;  //to see screenshot physically from path --download from-- commons.apache.org
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Miscellaneous_topics {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
// for insure page / expired certificate page		
		ChromeOptions co=new ChromeOptions(); 
		co.setAcceptInsecureCerts(true);
// For proxy		
//		Proxy p=new Proxy();
//		p.setHttpProxy("ipaddress: ****");
//		co.setCapability("proxy", p);	
		
// to block all popup windows
//		co.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking")); 

// set download directory	
//		Map<String, Object> pref= new HashMap<String, Object>();
//		pref.put("download.default_directory", "/directory/path");
//		co.setExperimentalOption("pref", pref);
		
		WebDriver driver=new ChromeDriver(co);
		
		driver.manage().window().maximize(); 
		driver.manage().deleteAllCookies(); 
//		driver.manage().deleteCookieNamed("name of cookie");
		
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/#");
		System.out.println(driver.getTitle());

// To take screenshots and save physically		
//		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(src, new File("C:\\Users\\SayaliMane\\screenshot.png"));
		
		
// java methods to find broken links
// 1.get all ulrs tide up to the links
// if status is >400, then that url is not working -> broken link
		
		List<WebElement> count=driver.findElements(By.cssSelector(".gf-li a"));
		SoftAssert a=new SoftAssert();
		for(WebElement links: count)
		{
			String link= links.getAttribute("href");
			
			HttpURLConnection connection = (HttpURLConnection)new URL(link).openConnection();
			connection.setRequestMethod("HEAD");
			connection.connect();
			int respCode = connection.getResponseCode(); // to get the response of link
			System.out.println(respCode); 
			a.assertTrue(respCode<400, "broken link name: " + links.getText() + " with code "+ respCode);
			
		}
		a.assertAll();
		
		
	}

}
