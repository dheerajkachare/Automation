package TestNG;

import org.openqa.selenium.By;
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
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Priority 
{
WebDriver driver;
	
	@BeforeSuite
	public void openbrowser()
	{
		System.out.println("openbrowser");
	
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Dheeraj\\\\Downloads\\\\chromedriver_win32 (2)\\\\chromedriver.exe");
		driver=new ChromeDriver();
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
	public void getcookie()
	{
		System.out.println("getcookies");
	}
  @Test(dataProvider = "datapro")
  public void AAAAA(String email, String pass) throws InterruptedException
  {
	  {
			System.out.println("AAAAA");
			driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//ul[@class='dropdown-menu user-login'])[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("sign_user_email")).sendKeys(email);
			Thread.sleep(2000);
			driver.findElement(By.id("sign_user_password")).sendKeys(pass);
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[@class='btn btn-lg btn-primary modal-btn ajax-submit'])[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[4]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//a[@href='https://www.mercurytravels.co.in/b2c/logout'])[2]")).click();
			Thread.sleep(2000);
				  }
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
