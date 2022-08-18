package testNG_pkg;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class demo2 {
	
	@Test (groups = "Group1")
	public void tc1() {
		System.out.println("testNG G");
	}
	
	@BeforeSuite
	public void suite() {
		System.out.println("BS suite no 1");
	}
	
	@AfterSuite
	public void suiteLast() {
		System.out.println("AS suite no 1 from last");
	}
	
	@Test (enabled=false)
	public void method() {
		System.out.println("false");
	}
	
	
	@Test(timeOut = 3000)
	public void time() {
		System.out.println("timeout mtd");
	}
	


}
