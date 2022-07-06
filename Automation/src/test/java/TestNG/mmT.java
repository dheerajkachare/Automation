package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;


public class mmT
{
	WebDriver driver;    
	
	@BeforeSuite
	public void openbrowser()
	{
	System.out.println("openbrowser");
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dheeraj\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	driver=new ChromeDriver();
	
	}
	@BeforeTest
	public void geturl()
	{
		System.out.println("geturl");
		driver.get("https://www.makemytrip.com/");
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
	@Test
	public void loginmercury() throws InterruptedException 
	{
		System.out.println("loginset");
		driver.findElement(By.xpath("(//span[@class='chNavText darkGreyText'])[2]")).click();
		Thread.sleep(2000);
		String title=driver.getTitle();
	    System.out.println(title);
	    String currenturl=driver.getCurrentUrl();
		System.out.println(currenturl);
		
		driver.findElement(By.xpath("(//span[@class='chNavText darkGreyText'])[2]")).click();
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)", "");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body[@class='desktop in webp']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class='font14 blueText latoBlack pushRight'])[1]")).click();
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

