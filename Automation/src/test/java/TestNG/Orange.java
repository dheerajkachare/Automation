package TestNG;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Orange {
	WebDriver driver;
	ExtentHtmlReporter Htmlreporter;
	ExtentReports Extent;
	ExtentTest test;
	private boolean booleanbuttonPresence;
	
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
		  Htmlreporter=new ExtentHtmlReporter ("extent.html");
		  Extent=new ExtentReports();
		  Extent.attachReporter(Htmlreporter);
		  test=Extent.createTest("Orange","logintest");
		System.out.println("geturl");
		driver.get("https://opensource-demo.orangehrmlive.com/");
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
	  public void loginmercury() throws InterruptedException
	  {
		
		test.info("Websiteisopen");
		System.out.println("loginmercury");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		test.info("enterusername");
		Thread.sleep(2000);
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		test.info("enterpassword");
		Thread.sleep(2000);
		driver.findElement(By.id("btnLogin")).click();
		test.info("enterloginbutton");
		driver.findElement(By.id("menu_leave_viewLeaveModule")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("leaveList_chkSearchFilter_checkboxgroup_allcheck")).isSelected();
		Thread.sleep(2000);
		String text=driver.findElement(By.id("menu_leave_assignLeave")).getText();
		System.out.println(text);
		Thread.sleep(2000);
		driver.findElement(By.id("menu_directory_viewDirectory")).click();
		Thread.sleep(2000);
		options= driver.findElement(By.id("searchDirectory_job_title"));
	
	
		test.pass("successfullylogin");
		
      }
      
	  
	  
	  
	
	  @AfterMethod
	  public void screenshot() throws IOException 
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



