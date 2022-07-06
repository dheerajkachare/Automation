package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Addfile {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Dheeraj\\\\Downloads\\\\chromedriver_win32 (2)\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("uploadfile_0")).sendKeys("C:\\Users\\Dheeraj\\Documents");
		Thread.sleep(2000);
		driver.findElement(By.id("terms")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("submitbutton")).click();
		Thread.sleep(2000);
		
	}

}
