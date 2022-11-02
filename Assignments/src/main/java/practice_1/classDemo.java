package practice_1;

import org.openqa.selenium.WebDriver;

import package_interface.demo_interface;

public  class classDemo extends demo_interface{

	public static WebDriver driver;

	public static void main(String[] args){
		
		classDemo c=new classDemo();
//		c.data();
//		c.data(2);
		c.getData();
	}

	
	public void getData() {
//	 int a[][] = new int[2][3];
//	 a[0][0]= 0;
//	 a[0][1]= 1;
//	 a[0][2]= 2;
//	 a[1][0]= 3;
//	 a[1][1]= 4;
//	 a[1][2]= 5;
//	 	System.out.println(a[1][1]);
//	 
//	 String b [][] = {{"add","substract"},{"multiply","divide"}};
//		System.out.println(b[0][1]);
//	 
//	 
//		for(int i=0;i<2;i++)
//		{
//			for(int j=0;j<3;j++)
//			{
//				System.out.print(a[i][j]+ " ");
//			}
//			System.out.println();
//		}
//	}
	
		
// To find min/max no from 3*3 matrix
	int n[][]= {{6,8,4},{2,11,6},{9,-1,2}};
	int min=n[0][0];
	int column=0;
	for(int i=0;i<3;i++) 
	{
		for(int j=0;j<3;j++)
		{
			if(min > n[i][j])        //to find max no- <  and for min no- >
			{
				min=n[i][j];
				column=j;
			}
		}
	}
	
	int max=n[0][column];
	int k=0;
	if(n[k][column]>max)
	{
		max=n[k][column];
	}
	System.out.println(max);
	System.out.println(min);
	}
	
	
	public void data() {
		System.out.println("child class override");
	}


	
		
//		WebDriverManager.chromedriver().setup();
////		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Driver\\chromedriver_win32\\chromedriver.exe");
//		driver= new ChromeDriver();
//		driver.get("http://www.google.com");
//		driver.findElement(By.xpath("//input[@title=\"Search\"]")).sendKeys("Google images");
//		
//		
//
//		classDemo c=new classDemo();
//		c.method();
//		c.getData();
//
//		c.screenShot();
//
//	}
//	
//	public static void screenShot() {
//		
//		File shot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		try {
//		
//			FileUtils.copyFile(shot,new File("shot.png"));
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		 
//	}
	
	
}
