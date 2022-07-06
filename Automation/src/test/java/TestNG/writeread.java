package TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class writeread {

	public static void main(String[] args) throws IOException 
	{
		Properties properties=new Properties();
		FileInputStream inputstream = new FileInputStream("C:\\Users\\Dheeraj\\eclipse-workspace\\Automation\\src\\test\\resources\\properties\\testdata.properties");
		properties.load(inputstream);
		System.out.println(properties.getProperty("browser"));
		System.out.println(properties.getProperty("url"));
		
		FileOutputStream outputstream = new FileOutputStream("C:\\Users\\Dheeraj\\eclipse-workspace\\Automation\\src\\test\\resources\\properties\\testdata.properties");
		properties.setProperty("testdata", "Dheeraj");
		properties.setProperty("store", "firstname");
		
		properties.store(outputstream, "read the data and add data from file successfully");

		
		
		

	}

}
