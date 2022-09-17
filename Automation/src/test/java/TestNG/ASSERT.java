package TestNG;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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

public class ASSERT 
{
	WebDriver driver;
	ExtentHtmlReporter Htmlreporter;
	ExtentReports Extent;
	ExtentTest Test;
	
	@BeforeSuite
		public void Openbrowser()
		{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dheeraj\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
		driver=new ChromeDriver();
		System.out.println("open browser");
		}
	
	@BeforeTest
		public void geturl() 
	{
		Htmlreporter=new ExtentHtmlReporter("Extent.html");
		Extent = new ExtentReports();
		Extent.attachReporter(Htmlreporter);
		Test=Extent.createTest("mercury","successfull");
		System.out.println("geturl");
		driver.get("https://www.mercurytravels.co.in/");
	
	}
	@BeforeClass
	public void maximize()
	{
	driver.manage().window().maximize();	
	System.out.println("maximize");
	}
	
	@BeforeMethod
	public void getcookies()
	{
		System.out.println("getcookies");
	}
	@Test
	public void login() throws InterruptedException, IOException
	{
		String actual=driver.getTitle();
		String expected="Holiday Packages India - India Tour Packages, Trip to India, Honeymoon Packages India | Mercury Travels";
		Assert.assertEquals(expected, actual);
		System.out.println("assert passed");
		Test.info("assert title");
		
		System.out.println("ABC");
		driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//ul[@class='dropdown-menu user-login'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("sign_user_email")).sendKeys("dheerajk7703@gmail.com");
		Thread.sleep(2000);
		Test.info("username");
		driver.findElement(By.id("sign_user_password")).sendKeys("Admin@123");
		Thread.sleep(2000);
		Test.info("password");
		driver.findElement(By.xpath("(//button[@class='btn btn-lg btn-primary modal-btn ajax-submit'])[1]")).click();
		Thread.sleep(2000);
		Test.info("loginbutton");
		File src=((TakesScreenshot)driver).getScreenshotAs (OutputType.FILE);
		FileUtils.copyFileToDirectory(src,new File("C:\\Users\\Dheeraj\\eclipse-workspace\\Automation\\src"));
		System.out.println("sceenshot");
		driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[4]")).click();
		Thread.sleep(2000);
		Test.info("check");
		driver.findElement(By.xpath("(//a[@href='https://www.mercurytravels.co.in/b2c/logout'])[2]")).click();
		Thread.sleep(2000);
		Test.info("logout");
		System.out.println("logout");
		System.out.println("AAA");
		Test.info("successfull AAA");
	
	}
	@AfterMethod
	public void getscreenshot() throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs (OutputType.FILE);
		FileUtils.copyFileToDirectory(src,new File("C:\\Users\\Dheeraj\\eclipse-workspace\\Automation\\src"));
		System.out.println("sceenshot");
	}
	@AfterClass 
	public void deletecookies()
	{
		driver.manage().deleteAllCookies();
		System.out.println("deletcookies");
	}
	@AfterTest
	public void dbconnectionclose()
	{
		System.out.println("dbconnectionclose");
	}
	@AfterSuite
	public void close() {
		driver.close();
	}

}
