package TestNG;

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
import org.testng.annotations.Test;

public class isdisplayed {
	WebDriver driver;    
	
	@BeforeSuite
	public void openbrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dheeraj\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	    driver=new ChromeDriver();
	    System.out.println("chrome");

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
	@Test
	public void BBBB() throws InterruptedException 
	{
		System.out.println("BBBB");
		String text=driver.findElement(By.xpath("(//p[@class='regular ng-tns-c194-1'])[1]")).getText();
		System.out.println(text);
		driver.findElement(By.xpath("(//span[@class='falseElem'])[3]")).click();
		driver.findElement(By.xpath("(//a[@href='/india-inbound'])[1]")).click();
		driver.findElement(By.xpath("//div[@class='searchButton vw-btn-primary']")).isDisplayed();
		System.out.println("button is displayed");
			
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
