package A_package;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Base {
	
	public WebDriver driver;
	public Properties p;
	public WebDriver initializeDriver() throws IOException
	{
	 p=new Properties();
	FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\A_package\\data.properties");
	p.load(fis);
	String browserName= p.getProperty("browser");
	String URL= p.getProperty("url"); 
	if(browserName.equals("chrome"))
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
	}
	else if(browserName.equals("firefox"))
	{
		WebDriverManager.firefoxdriver().setup();
		driver= new FirefoxDriver();
	}
	else if(browserName.equals("edge"))
	{
		WebDriverManager.edgedriver().setup();
		driver= new EdgeDriver();
	}
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	return driver;
	}
	

	public String getScreenShotPath(String testCaseName, WebDriver driver) throws IOException
	{
		TakesScreenshot ss=(TakesScreenshot) driver;
		File source =ss.getScreenshotAs(OutputType.FILE);
		String destinationFile = System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
		FileUtils.copyFile(source, new File(destinationFile));
		FileUtils.copyFile(source, new File("logo.png"));
		source.getAbsolutePath();
		return destinationFile;
	} 
	

}
