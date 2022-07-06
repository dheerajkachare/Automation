package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;



public class assertion 
{
	WebDriver driver;
	ExtentHtmlReporter Htmlreporter;
	ExtentReports Extent;
	ExtentTest test;
	

	@BeforeSuite
	public void openbrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Dheeraj\\\\Downloads\\\\chromedriver_win32 (2)\\\\chromedriver.exe");
		driver=new ChromeDriver();
		System.out.println("openbrowser");
	}
	@BeforeTest
	public void geturl()
	{
		Htmlreporter=new ExtentHtmlReporter("extent.html");
		Extent = new ExtentReports();
		Extent.attachReporter(Htmlreporter);
		test=Extent.createTest("mercury","successfull");
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
	public void Asertion() throws InterruptedException
	{
		String actual=driver.getTitle();
		String expected="Holiday Packages India - India Tour Packages, Trip to India, Honeymoon Packages India | Mercury Travels";
		Assert.assertEquals(expected, actual);
		System.out.println("assert passed");
		test.info("assert title");
		
		System.out.println("ABC");
		driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//ul[@class='dropdown-menu user-login'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("sign_user_email")).sendKeys("dheerajk7703@gmail.com");
		Thread.sleep(2000);
		test.info("username");
		driver.findElement(By.id("sign_user_password")).sendKeys("Admin@123");
		Thread.sleep(2000);
		test.info("password");
		driver.findElement(By.xpath("(//button[@class='btn btn-lg btn-primary modal-btn ajax-submit'])[1]")).click();
		Thread.sleep(2000);
		test.info("loginbutton");
		driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[4]")).click();
		Thread.sleep(2000);
		test.info("check");
		driver.findElement(By.xpath("(//a[@href='https://www.mercurytravels.co.in/b2c/logout'])[2]")).click();
		Thread.sleep(2000);
		test.info("logout");
		System.out.println("logout");
		System.out.println("AAA");
		test.info("successfull AAA");
	}
	
	@AfterMethod
	public void screenshot()
	{
		System.out.println("sceenshot");
	}
	@AfterClass
	public void deletecookies()
	{
		System.out.println("deletecookies");
	}
	
	
	@AfterTest
	public void dbconnectionclose()
	{
		Extent.flush();
		System.out.println("dbconnectionclose");
	}
	
	@AfterSuite
	public void closebrowser()
	{
		System.out.println("closebrowser");
		driver.close();
	}
	

}
