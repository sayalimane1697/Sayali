package practice_1;

import package_interface.demo_interface;

public class classDemo implements demo_interface{

	public static void main(String[] args){

		classDemo c=new classDemo();
		c.method();
		c.getData();


	}

	@Override
	public void method() {
		System.out.println("method interface");
		
	}

	@Override
	public void getData() {
		System.out.println("getdata interface");
		
	}

	

}
