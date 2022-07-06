package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class E
{

	public static void main(String[] args) throws InterruptedException
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Dheeraj\\\\Downloads\\\\chromedriver_win32 (2)\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googinhydr1-21&ref=pd_sl_5ikydyrck9_b&adgrpid=58972567855&hvpone=&hvptwo=&hvadid=294134771458&hvpos=&hvnetw=g&hvrand=18328611823224839995&hvqmt=b&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9300140&hvtargid=kwd-513872812020&hydadcr=5839_1914860&gclid=EAIaIQobChMI2aru6djh9wIVtpVLBR1RPQsTEAAYASAAEgL1CPD_BwE");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone 12");
		Thread.sleep(1000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='a-truncate-cut'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("add-to-cart-button")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("attach-view-cart-button-form")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("sc-buy-box-ptc-button-announce")).click();
		Thread.sleep(1000);
		
		driver.close();
		
		
	}

}
