package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dheeraj\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.kesari.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement( By.xpath("(//input[@placeholder='Find Tours of a Destination'])[1]")).sendKeys("shimla");
		driver.findElement(By.xpath("(//i[@class='fa fa-search'])[1]")).click();
		Thread.sleep(2000);
		
		
	}
}
