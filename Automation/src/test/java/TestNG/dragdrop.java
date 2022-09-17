package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
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

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class dragdrop {
	WebDriver driver;
	WebDriver wait;
	ExtentHtmlReporter Htmlreporter;
	ExtentReports Extent;
	ExtentTest test;
	
	@BeforeSuite
	public void openbrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Dheeraj\\\\Downloads\\\\chromedriver_win32 (4)\\\\chromedriver.exe");
		driver=new ChromeDriver();
	    System.out.println("chrome");
	    
	}
	
	@BeforeTest
	public void geturl()
	{
		Htmlreporter=new ExtentHtmlReporter ("extent.html");
		  Extent=new ExtentReports();
		  Extent.attachReporter(Htmlreporter);
		  test=Extent.createTest("dragdrop","visible");
		System.out.println("geturl");
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
	}
	@SuppressWarnings("deprecation")
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
	@Test(priority=0)
	public void AAA() throws InterruptedException
	{
		System.out.println("AAA");
		
		test.info("Websiteisopen");
		String colour=driver.findElement(By.xpath("//div[@class='page_heading']")).getCssValue("background-colour");
		System.out.println(colour);
		test.info("colouriswhite");
		String size=driver.findElement(By.xpath("//div[@class='page_heading']")).getCssValue("font-size");
		System.out.println(size);
		test.info("size");
		WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(frame);
		Basic.wait.timer();
		test.info("switchtoframe");
		
		WebElement drag=driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		WebElement drop=driver.findElement(By.id("trash"));
		Basic.wait.timer();
		test.info("draganddrop");
		
		Actions act=new Actions(driver);
		act.dragAndDrop(drag, drop).build().perform();
		Basic.wait.timer();
		test.info("succefulldraganddrop");
		driver.switchTo().defaultContent();
		test.info("switchtodefaultcontent");
		
	
		
		
	}
	@Test(priority=-1)
	public void BBB() throws InterruptedException
	{
		System.out.println("BBB");
		
		test.info("Websiteisopen");
		WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(frame);
		test.info("switchtoframe");
		WebElement drag1=driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
		WebElement drop2=driver.findElement(By.id("trash"));
		test.info("dragdropdone");
		
		
		Actions act=new Actions(driver);
		act.dragAndDrop(drag1, drop2).build().perform();
		Thread.sleep(2000);
		test.info("succefulldragdrop");
		driver.switchTo().defaultContent();
		test.info("defaultcontecthavebeenswitch");
		
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
		Extent.flush();
		System.out.println("dbconnectionclose");
	}
	@AfterSuite
	public void closebrowser()
	{
		System.out.println("closebrowser"); 
		
	}

}