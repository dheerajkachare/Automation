package TestNG;

import org.testng.annotations.Test;
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

public class dataprovider 
{
	WebDriver driver;
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
	
	@Test(dataProvider= "datapro")
	public void AAAA(String username, String password) throws InterruptedException
	{
		
		System.out.println("AAAA");
		driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//ul[@class='dropdown-menu user-login'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("sign_user_email")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.id("sign_user_password")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class='btn btn-lg btn-primary modal-btn ajax-submit'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@href='https://www.mercurytravels.co.in/b2c/logout'])[2]")).click();
		Thread.sleep(2000);
		System.out.println("logout");
		Thread.sleep(2000);
		boolean crossbutton= driver.findElement(By.xpath("//button[@class='close open_parent']")).isDisplayed();
        if(crossbutton)
        {
        	 driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
             Thread.sleep(2000);
             driver.findElement(By.id("dheerajk7703@gmail.com")).clear();
             Thread.sleep(2000);
             driver.findElement(By.id("Admin@123")).clear();
             Thread.sleep(2000); 
           
             
        }
        else
        {
         driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[4]")).click();
         Thread.sleep(2000);
         driver.findElement(By.xpath("(//ul[@class='dropdown-menu user-login'])[4]/li[3]/a")).click();
   
         
        }
        
	
	}
	
  
  @DataProvider(name="datapro")
  public Object[][] dp()
  {
	  
    return new Object[][] 
    		
    		{
  
      new Object[] { "dheerajk77@gmail.com", "Admin@123" },
      new Object[] {"dheerajk7703@gmail.com", "Admin@123"},
      new Object[] {"dheerajk7703@gmail.com", "Admin@123"},
    
    		};
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
		System.out.println("dbconnectionclose");
	}
	
	@AfterSuite
	public void closebrowser()
	{
		System.out.println("closebrowser");
		driver.close();
	}
	

}
