package TestNG;

import java.io.File;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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


public class Mercuryydp
{
	  WebDriver driver;
	  @BeforeSuite
	  public void openbrowser()
	  {
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dheeraj\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
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
	  @Test(dataProvider="datapro")
	  public void loginmercury(String email,String pass) throws InterruptedException
	  {
		
		System.out.println("loginmercury");
		driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@data-toggle='modal'])[3]")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("sign_user_email")).sendKeys(email);
        Thread.sleep(2000);
        driver.findElement(By.id("sign_user_password")).sendKeys(pass);
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//button[@class='btn btn-lg btn-primary modal-btn ajax-submit'])[1]")).click();
        Thread.sleep(2000);	
        boolean crossbutton= driver.findElement(By.xpath("//button[@class='close open_parent']")).isDisplayed();
        Thread.sleep(2000);
        if(crossbutton)
        {
        	 driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
             Thread.sleep(2000);
             driver.findElement(By.id("sign_user_email")).clear();
             Thread.sleep(2000);
             driver.findElement(By.id("sign_user_password")).clear();
             Thread.sleep(2000);
             driver.findElement(By.id("modalLogin")).click();
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
	  public Object[][]dp()
	  {
		  return new Object[][]
				  {
			        new Object[] {"sayaleegadage55@gmail.com","9702116163"},
			        new Object[] {"sayaleegadage55@gmail.com","Sayalee55"},
			       
				  };
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
		  System.out.println("dbconnectionclose");
	  }
	  @AfterSuite
	  public void closebrowser()
	  {
		System.out.println("closebrowser"); 
		driver.close();
	  }
	  
	}


