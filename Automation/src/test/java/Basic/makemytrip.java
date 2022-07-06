package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class makemytrip {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\Dheeraj\\\\\\\\Downloads\\\\\\\\chromedriver_win32 (2)\\\\\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//span[@class='chNavText darkGreyText'])[2]")).click();
		Thread.sleep(2000);
		String title=driver.getTitle();
	    System.out.println(title);
	    String currenturl=driver.getCurrentUrl();
		System.out.println(currenturl);
		
		driver.findElement(By.xpath("(//span[@class='chNavText darkGreyText'])[2]")).click();
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)", "");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body[@class='desktop in webp']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class='font14 blueText latoBlack pushRight'])[1]")).click();
		Thread.sleep(2000);
		
		driver.close();
		

	}

}
