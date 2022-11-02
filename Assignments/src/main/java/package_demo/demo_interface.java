package package_demo;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class demo_interface {

	public void method() {
		System.out.println("method body");
	}
	
	public void data() {
		System.out.println("parent class override");
	}
	
	public void data(int a) {
		System.out.println(a);
	}
	
	public abstract void getData();
		
	
}
