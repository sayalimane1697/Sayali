package package_demo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class dateDemo {

	public static void main(String[] args) {
				
// to print current date-time
		
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		System.out.println(sdf.format(d));
		System.out.println(d.toString());

	}

}
