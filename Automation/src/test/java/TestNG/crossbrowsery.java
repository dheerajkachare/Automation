package TestNG;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class crossbrowsery
{
	  WebDriver driver;
	  @BeforeSuite
	  @Parameters("browser")
	  public void openbrowser(String browser)
	  {
		    if(browser.equalsIgnoreCase("chrome"))
		    {
		    System.setProperty("webdriver.chrome.driver","C:\\Users\\Dheeraj\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		    driver=new ChromeDriver();
		    System.out.println("chrome"); 
		    }
		     
		    else if(browser.equalsIgnoreCase("gecko"))
		    {
		    System.setProperty("webdriver.gecko.driver","C:\\Users\\Dheeraj\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		    driver=new FirefoxDriver();
		    System.out.println("gecko");
		    }
		 }
		 
	  @BeforeTest
	  public void geturl()
	  {
		System.out.println("geturl");
		driver.get("https://www.mercurytravels.co.in/");
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
	  public void CDE() throws InterruptedException, IOException
	  {
		String expected="Mercury Travels: Holiday Packages, Flight Booking, Hotels, Forex, Visa & Travel Insurance";
		String actual=driver.getTitle();
		Assert.assertEquals(expected, actual);
		System.out.println("CDE");
		WebElement demo=driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[2]"));
		Actions act=new Actions(driver);
		act.moveToElement(demo).build().perform();
		Thread.sleep(2000);
		WebElement next=driver.findElement(By.xpath("(//a[@data-toggle='modal'])[3]"));
		Actions act1=new Actions(driver);
		act1.moveToElement(next).build().perform();
		next.click();
        Thread.sleep(3000);
        driver.findElement(By.id("sign_user_email")).sendKeys("satyajit2244@gmail.com");
        Thread.sleep(2000);
        File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFileToDirectory(src,new File("C:\\Users\\admin\\eclipse-workspace\\New_Project\\src"));
        driver.findElement(By.id("sign_user_password")).sendKeys("satyajit4477");
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//button[@class='btn btn-lg btn-primary modal-btn ajax-submit'])[1]")).click();
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