package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class flipkart {
	
	WebDriver driver;
	
	@BeforeSuite
	public void openbrowser() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dheeraj\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
	    driver=new ChromeDriver();
	    System.out.println("chrome");
		
	}
	@BeforeTest
	public void geturl()
	{
		System.out.println("geturl");
		driver.get("https://www.flipkart.com/");
	}
	@BeforeClass
	public void maximizeurl()
	{
		System.out.println("maximizeurl");
		driver.manage().window().maximize();
	
	}
	@BeforeMethod
	public void getcookies()
	{
		System.out.println("getcookies");
	}
	@Test
	public void login() throws InterruptedException
	{
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='xtXmba'])[8]")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
        WebElement Electronics= driver.findElement(By.xpath("(//div[@class='xtXmba'])[5]"));
		
		Actions actions=new Actions(driver);
		actions.moveToElement(Electronics).build().perform();
		
		
		
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
		
	}
	
}
