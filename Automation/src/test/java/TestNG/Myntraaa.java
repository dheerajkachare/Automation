package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Myntraaa 
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
	public void getcookie()
	{
		System.out.println("getcookies");
	}
	@Test
	public void ABC() throws InterruptedException
	{
		System.out.println("ABC");
		String text=driver.findElement(By.xpath("//p[@class='font10 userPerText appendTop3']")).getText();
		System.out.println("text");
		driver.findElement(By.xpath("//div[@class='makeFlex column flexOne whiteText latoBold']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("dheerajk7703@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='capText font16']")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("Admin@123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@data-cy='login']")).click();
		Thread.sleep(1000);
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