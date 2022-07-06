package Basic;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {

	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Dheeraj\\\\Downloads\\\\chromedriver_win32 (2)\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		

		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		WebElement type=driver.findElement(By.xpath("//input[@type='text']"));
		type.sendKeys("Iphone 13");
		Thread.sleep(2000);
		driver.findElement(By.className("L0Z3Pu")).click();
		Thread.sleep(2000);
		String parent=driver.getWindowHandle();
		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
		Thread.sleep(2000);
		Set<String> windows=driver.getWindowHandles();
		for(String x:windows)
		{
			driver.switchTo().window(x);
			
		}
    	driver.switchTo().window(parent);
    	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//img[@class='_2xm1JU']")).getCssValue("font-size");
    	driver.close();
		
		

	}


}
