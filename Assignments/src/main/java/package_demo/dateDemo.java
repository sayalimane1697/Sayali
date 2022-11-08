package package_demo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class dateDemo {

	public static void main(String[] args) {
				
// to print current date-time
		
//		Date d = new Date();
//		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
//		System.out.println(sdf.format(d));
//		System.out.println(d.toString());

// by using calender
		
//		Calendar cal=Calendar.getInstance();
//		SimpleDateFormat sdf1 = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
//		System.out.println(sdf1.format(cal.getTime()));
//		System.out.println(cal.get(Calendar.DAY_OF_MONTH));   
//		System.out.println(cal.get(Calendar.DAY_OF_WEEK));      //total weeks in month
//		System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH)); //present week number
//		System.out.println(cal.get(Calendar.AM_PM));       //AM-0  and  PM-1
//		System.out.println(cal.get(Calendar.MINUTE));   
		
//
		
		dateDemo dd=new dateDemo();
		dateDemo dd1=new dateDemo(2);
		dateDemo dd2=new dateDemo("name");
	
	}
	
//without void and same as classname- constructor method	
	
	public dateDemo()   //default constructor
	{
		System.out.println("constructor method");
	}

	public dateDemo(int i)  //parameterized constructor --here-- int i is parameter/argument
	{
		System.out.println("constructor method " +i);
	}
	
	public dateDemo(String j)
	{
		System.out.println("constructor method " +j);
	}
}
