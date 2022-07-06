package TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement {

	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dheeraj\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println(driver);
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		
		
		List<WebElement> Elementlist=driver.findElements(By.xpath("(//div[@class='xtXmba'])[4]"));
		
	
		
		
		
		

	}

}
