package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class dropdown
{
	WebDriver driver;
	
	@BeforeSuite
	public void openbrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Dheeraj\\\\Downloads\\\\chromedriver_win32 (2)\\\\chromedriver.exe");
		driver=new ChromeDriver();
	    System.out.println("chrome");
	}
	
	@BeforeTest
	public void geturl()
	{
		System.out.println("geturl");
		driver.get("https://www.mercurytravels.co.in/");
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
	public void AAA() throws InterruptedException
	{
		System.out.println("AAA");
		int count=driver.findElements(By.tagName("a")).size();
		System.out.println(count);
		WebElement Select_duration=driver.findElement(By.id("duration_d"));
		
		Select s= new Select(Select_duration);
		s.selectByVisibleText("4Nights+5Days");
		s.selectByIndex(6);
		s.selectByValue("4Nights / 5Days");
		Thread.sleep(2000);
		
		WebElement Mice=driver.findElement(By.xpath("(//a[@class='font14'])[10]"));
		Mice.click();
		Thread.sleep(2000);
        
		WebElement hotel=driver.findElement(By.xpath("(//a[@class=\"font14\"])[12]"));
		hotel.click();
		Thread.sleep(2000);

		
		//System.out.println(count1);
		driver.findElement(By.xpath("(//input[@type='text'])[17]")).sendKeys("Pune");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//button[@type='submit'])[4]")).click();
		
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
		
	}

}
