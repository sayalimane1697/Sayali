package testNG_pkg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class demo3 {
	
	@Test
	public void WebloginHomeLoan() {
		System.out.println("WebloginHomeLoan");
	}
	
	
	@Parameters({"study", "URL"})
	@Test
	private void MobileloginHomeLoan(String studyurl, String url ) {
		System.out.println("MobileloginHomeLoan");
		System.out.println(studyurl + "\n" + url);
	}
	
	@Test
	private void LoginAPIHomeLoan() {
		System.out.println("LoginAPIHomeLoan");
	}

	@Test(dataProvider="getData")
	public void printData(String username, String password)
	{
		System.out.println(username);
		System.out.println(password);
	}

	@DataProvider
	public Object[][] getData()
	{
		//1. combination- username p/w (good credit hidtory)
		//2. username p/w (no credit hostory)
		//3. fraudelent credit history
//1st row		
		Object[][] data=new Object[3][2];
		data[0][0]="first_username";
		data[0][1]="first_password";
//2nd row		
		data[1][0]="second_username";
		data[1][1]="second_password";
//3rd row		
		data[2][0]="third_username";
		data[2][1]="third_password";
		
		return data;
	
	}

}
