package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dheeraj\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/?utm_source=perf_google_search_brand&utm_medium=perf_google_search_brand&utm_campaign=Search%20-%20Myntra%20Brand%20(India)&gclid=EAIaIQobChMIkumB7Zvu9wIVbMEWBR2aXwQbEAAYASAAEgKpRPD_BwE");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("zara mens");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='desktop-navLink'])[3]")).click();
		Thread.sleep(2000);
		
		
      
	}

}
