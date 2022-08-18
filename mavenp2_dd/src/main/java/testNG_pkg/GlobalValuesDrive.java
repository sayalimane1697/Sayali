package testNG_pkg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalValuesDrive {
	
	public static void main(String[] args) throws IOException {
		
		Properties pro=new Properties();
		FileInputStream f=new FileInputStream("C:/Users/SayaliMane/eclipse-workspace/mavenp2_dd/src/File.properties");
		pro.load(f);
		System.out.println(pro.getProperty("browser"));
		System.out.println(pro.getProperty("url"));
        pro.setProperty("browser", "firefox");
        System.out.println(pro.getProperty("browser"));
        FileOutputStream fo=new FileOutputStream("C:/Users/SayaliMane/eclipse-workspace/mavenp2_dd/src/File.properties");
		pro.store(fo, null);
		
		System.out.println(pro.getProperty("browser") +" "+pro.getProperty("url"));
        
	}

}
