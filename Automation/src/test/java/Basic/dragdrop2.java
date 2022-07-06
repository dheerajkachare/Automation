package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragdrop2 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Dheeraj\\\\Downloads\\\\chromedriver_win32 (2)\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().window().maximize();
		
		WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(frame);
		Basic.wait.timer();
		
		WebElement drag=driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));
		WebElement drop=driver.findElement(By.id("trash"));
		Basic.wait.timer();
		
		Actions act=new Actions(driver);
		act.dragAndDrop(drag, drop).build().perform();
		Basic.wait.timer();
		driver.switchTo().defaultContent();
			
		
	}

}
