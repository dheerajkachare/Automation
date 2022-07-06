package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Orange {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Dheeraj\\\\Downloads\\\\chromedriver_win32 (4)\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(2000);
		
		String text=driver.findElement(By.id("menu_pim_viewPimModule")).getText();
		System.out.println(text);
		String currenturl=driver.getCurrentUrl();
		System.out.println(currenturl);
		String title=driver.getTitle();
		System.out.println(title);
		String pagesource=driver.getPageSource();
		System.out.println(pagesource);
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("menu_pim_Configuration")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("menu_pim_configurePim")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Edit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("btnSave"));
		Thread.sleep(2000);
		driver.findElement(By.id("menu_recruitment_viewRecruitmentModule")).click();
		Thread.sleep(2000);
		WebElement choose=driver.findElement(By.id("candidateSearch_jobTitle"));
		Select s=new Select(choose);
		s.selectByValue("2");
		Thread.sleep(2000);
		
		
		
		
		
		
	}

}
