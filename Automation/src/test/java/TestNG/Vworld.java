package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Vworld 
{
	WebDriver driver;    
	
	@BeforeSuite
	public void openbrowser()
	{
	System.out.println("openbrowser");
	System.setProperty("webdriver.gecko.driver","C:\\Users\\Dheeraj\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
	driver=new FirefoxDriver();

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
	public void getcookies()
	{
		System.out.println("getcookies");
	
	}
	@Test(priority=1)
	public void BBBB() throws InterruptedException 
	{
		System.out.println("BBBB");
		driver.findElement(By.xpath("(//span[@class='falseElem'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@href='/india-inbound'])[1]")).click();
		Thread.sleep(2000);
		
	}
	
	@Test(priority=-1)
	public void AAAA() throws InterruptedException 
	{
		System.out.println("AAAA");
		driver.findElement(By.xpath("(//span[@class='falseElem'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@href='/india-inbound'])[1]")).click();
		Thread.sleep(2000);
		
	}
	
	@AfterMethod
	public void screenshot()
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

