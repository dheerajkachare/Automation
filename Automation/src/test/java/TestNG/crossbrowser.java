package TestNG;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossbrowser {
	WebDriver driver;
	
	@BeforeSuite
	@Parameters("browsername")
	public void openbrowser()
	{
		
	
			System.out.println("openbrowser");
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Dheeraj\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dheeraj\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
		
	}
		
		
	@BeforeTest
	public void geturl()
	{
		System.out.println("geturl");
		driver.get("https://www.veenaworld.com/");
	}
	@BeforeClass
	public void maximize()
	{
		System.out.println("maximize");
		driver.manage().window().maximize();
	
	}
	@BeforeMethod
	public void getcookie()
	{
		System.out.println("getcookies");
	}
	@Test
	public void BCA() throws InterruptedException 
	{
		
	    System.out.println("BCA");
		driver.findElement(By.xpath("(//span[@class='falseElem'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@href='/india-inbound'])[1]")).click();
		Thread.sleep(2000);
	}
		
	@AfterMethod
	public void getscreenshot() throws IOException
	{
		System.out.println("screenshot");
		
	}
	@AfterClass
	public void deletecookies()
	{
		System.out.println("deletecookies");
	}
	@AfterTest
	public void dbconnectionclose()
	{
		System.out.println("dbconnectionclose");
	}
	
	
	@AfterSuite
	public void closebrowser()
	{
		System.out.println("closebrowser");
		driver.close();
		
	}

}

