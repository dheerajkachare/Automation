package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class B {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dheeraj\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.mercurytravels.co.in/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		String title=driver.getTitle();
		System.out.println(title);
		
		String currenturl=driver.getCurrentUrl();
		System.out.println(currenturl);
		
		String pagesource=driver.getPageSource();
		System.out.println(pagesource);
		
		int count=driver.findElements(By.tagName("a")).size();
		System.out.println(count);
		WebElement Select_duration=driver.findElement(By.id("duration_d"));
		
		Select s= new Select(Select_duration);
		s.selectByVisibleText("4Nights+5Days");
		s.selectByIndex(6);
		s.selectByValue("4Nights / 5Days");
		Thread.sleep(2000);
		
		WebElement Mice=driver.findElement(By.xpath("(//a[@class='font14'])[10]"));
		Mice.click();
		Thread.sleep(2000);
        
		WebElement hotel=driver.findElement(By.xpath("(//a[@class=\"font14\"])[12]"));
		hotel.click();
		Thread.sleep(2000);

		
		//System.out.println(count1);
		driver.findElement(By.xpath("(//input[@type='text'])[17]")).sendKeys("Pune");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//button[@type='submit'])[4]")).click();
		
		Thread.sleep(2000);
		
			
		

		
	}

}
