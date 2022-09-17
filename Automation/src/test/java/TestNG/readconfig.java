package TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class readconfig 
{
 
 
	public static void main(String[] args) throws IOException 
	{
	
        WebDriver driver = null;
		
		Properties propObj=new Properties();
		FileInputStream fisobj=new FileInputStream("C:\\Users\\Dheeraj\\git\\Automation\\Automation\\src\\test\\java\\TestNG\\config.properties");
		propObj.load(fisobj);
		
		String browsername=propObj.getProperty("Chrome");
		
		if(browsername.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dheeraj\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browsername.equals("firefox"))
		{
			driver=new ChromeDriver();
		}
		
		driver.get(propObj.getProperty("url"));
		    
		String uname=propObj.getProperty("Admin");
		System.out.println(uname);
		String upassword=propObj.getProperty("admin123");
		System.out.println(upassword);

	}

}
