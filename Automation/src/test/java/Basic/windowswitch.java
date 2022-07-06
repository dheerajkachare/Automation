package Basic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowswitch {

	

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Dheeraj\\\\Downloads\\\\chromedriver_win32 (2)\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Iphone 12");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		String parent=driver.getWindowHandle();
		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
		Thread.sleep(2000);
		Set<String> windows=driver.getWindowHandles();
		for (String e:windows)
		{
			driver.switchTo().window(e);
		}
		
		driver.switchTo().window(parent);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).clear();
		Thread.sleep(2000);
		driver.quit();
		

	}

}
