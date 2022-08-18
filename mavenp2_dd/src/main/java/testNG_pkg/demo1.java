package testNG_pkg;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class demo1 {

	@Test (groups = "Group1")
	public void tc1() {
		System.out.println("Hello G");
	}
	
	@AfterTest (groups = "Group1")
	private void tc2() {
		System.out.println("World G");
	
	}
	
	@Parameters({"URL"})
	@BeforeTest 
    private void tc3(String urlname) {
			System.out.println("beforetest");	
			System.out.println(urlname);
	}
	
	@Test (enabled=true)
	public void m1() {
		System.out.println("true");
		Assert.assertTrue(false);
	}
	
}
