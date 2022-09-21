package pkg_office;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;


public class base{

	public WebDriver driver;
	public Properties prop;
    public WebDriver initializeDriver() throws IOException
    {
//    	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
    
        prop= new Properties();
    	FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\pkg_office\\data1.properties");
    	prop.load(fis);
    	String browserName = prop.getProperty("browser");
    	String url = prop.getProperty("url");
    	System.out.println(browserName);
    	
    	if(browserName.equals("chrome"))
    	{
    		WebDriverManager.chromedriver().setup();
    		ChromeOptions options= new ChromeOptions();
//    		options.addArguments("headless");
//    		if (browserName.contains("headless")) 
//    		{
//				options.addArguments("headless");
//				options.addArguments("--disable-gpu", "--window-size=1920,1200", "--ignore-certificate-errors","--disable-extensions", "--no-sandbox", "--disable-dev-shm-usage");
//			}
//    		System.setProperty("webdriver.chrome.driver", "C:/Program Files/Driver/chromedriver_win32/chromedriver.exe");
    		driver= new ChromeDriver(options);
    	}
    	else if(browserName.equals("firefox"))
    	{
    		WebDriverManager.firefoxdriver().setup();
//    		System.setProperty("webdriver.firefos.driver", "C:/Program Files/Driver/geckodriver-v0.31.0-win32/geckodriver.exe");
    		driver= new FirefoxDriver();
    	}
    	else if(browserName.equals("edge"))
    	{
    		WebDriverManager.edgedriver().setup();
//    		System.setProperty("webdriver.edge.driver", "C:/Program Files/Driver/edgedriver_arm64/msedgedriver.exe");
    		driver= new EdgeDriver();
    	}
    	
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
    }
	
}

//	@Test
//	public void callingMethods() throws Exception
//	{
//		 ChromeOptions chromeOption =new ChromeOptions();
////		 chromeOption.setExperimentalOption("debuggerAddress", "localhost:9876");
//		WebDriverManager.chromedriver().setup();
////	     System.setProperty("webdriver.chrome.driver", "C:/Program Files/Driver/chromedriver_win32/chromedriver.exe");
//		 WebDriver driver=new ChromeDriver(chromeOption);
//		 driver.get("https://onebeta.systenics.com/app/home/");
////		 driver.manage().window().maximize();
//		 
////		 demo_script d=new demo_script();
//		 sign_in call=new sign_in();
//		 call.callMethod(driver);
//		 Thread.sleep(1000);
//		 
//		 Attendance add =new Attendance();
//		 add.addAttedance(driver);
//		 add.WFH(driver);
//		 
////		 leaveApplication leave=new leaveApplication();
//		 add.leaveMethod(driver);
//		 	
//	}



