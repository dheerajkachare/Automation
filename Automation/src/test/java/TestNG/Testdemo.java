package TestNG;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testdemo {
	
	private static final Function ExpectedConditons = null;
	WebDriver driver;
	
	@SuppressWarnings("deprecation")
	@BeforeSuite
	public void openbrowser()
	{
		System.out.println("openbrowser");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dheeraj\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		
	}
	@BeforeTest
	public void geturl()
	{
		System.out.println("geturl");
		driver.get("https://www.kesari.in/");
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
	public void login()
	{
		driver.findElement(By.xpath("//li[@class='menu-item-has-children megamenu-menu group-tour-menu']")).click();
		String text=driver.findElement(By.xpath("(//div[@class='testimonial-box__text-text ng-binding'])[1]")).getText();
		System.out.println(text);
		WebElement holiday=driver.findElement(By.id("tailor-made-holidays"));
		Actions action=new Actions(driver);
		action.moveToElement(holiday).build().perform();
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Mumbai");
		driver.findElement(By.xpath("(//i[@class='fa fa-search'])[1]")).click();
	
		
		
		
		
		
	}
	@AfterMethod
	public void screenshot()
	{
		System.out.println("screenshot");
	}
	@AfterClass
	public void deletecokies()
	{
		System.out.println("deletecokies");
	}
	@AfterTest
	public void dbconnectionlost()
	{
		System.out.println("dbconnectionlost");
	}
	@AfterSuite
	public void closebrowser()
	{
	
		System.out.println("closebrowser");
		driver.close();
	}
	
}
