package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class demo 
{
	WebDriver driver;    
	
	@BeforeSuite
	public void openbrowser()
	{
	System.out.println("openbrowser");
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dheeraj\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
	driver=new ChromeDriver();
	
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
	public void Veenaworld() throws InterruptedException 
	{
		System.out.println("veenaworld");
		WebElement list=driver.findElement(By.xpath("(//span[@class='actualNav'])[5]"));
		Actions actions=new Actions(driver);
		actions.moveToElement(list).build().perform();
		Thread.sleep(2000);
		WebElement li=driver.findElement(By.xpath("(//span[@class='actualNav'])[9]"));
		actions.moveToElement(li).build().perform();
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
		driver.manage().deleteAllCookies();
		System.out.println("deleteallcookies");
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
		
	  }
	
}
