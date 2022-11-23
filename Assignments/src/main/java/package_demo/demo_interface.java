package package_demo;

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
		
	public abstract void getData2();
	
	private int i=5;
	
	public void dataa()
	{
		System.out.println(i);
	}
}
