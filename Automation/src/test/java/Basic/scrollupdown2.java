package Basic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollupdown2 {

	public static void main(String[] args) throws InterruptedException  
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Dheeraj\\\\Downloads\\\\chromedriver_win32 (2)\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.kesari.in/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)", "");
		Thread.sleep(2000);
		JavascriptExecutor js1=(JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,-800)", "");
		Thread.sleep(2000);
		
		
		
	}

}
