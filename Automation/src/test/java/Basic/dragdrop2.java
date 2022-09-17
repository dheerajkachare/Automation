package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dragdrop2 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Dheeraj\\\\Downloads\\\\chromedriver_win32 (5)\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().window().maximize();
		
		WebElement frame=driver.findElement(By.id("google_esf"));
		driver.switchTo().frame(frame);
		Thread.sleep(2000);
		
		WebElement drag=driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement drop=driver.findElement(By.id("trash"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(drag, drop).build().perform();
		driver.switchTo().defaultContent();
		
		Thread.sleep(2000);
		
		driver.close();
		
		
		
		
		
		
		
		
	}

}
