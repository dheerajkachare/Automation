package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class H {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dheeraj\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(2000);
		String title=driver.getTitle();
		System.out.println(title);
		String currenturl=driver.getCurrentUrl();
		System.out.println(currenturl);
		driver.findElement(By.id("menu_leave_viewLeaveModule")).click();
		Thread.sleep(1000);
		String text=driver.findElement(By.id("menu_leave_viewLeaveModule")).getText();
		System.out.println(text);
		Thread.sleep(1000);
		driver.findElement(By.id("leaveList_txtEmployee_empName")).sendKeys("Dheeraj");
		Thread.sleep(1000);
		WebElement submit=driver.findElement(By.id("leaveList_cmbSubunit"));
		Select s=new Select(submit);
		s.selectByValue("2");
		driver.findElement(By.id("leaveList_txtEmployee_empName")).clear();
		boolean button=driver.findElement(By.id("btnReset")).isDisplayed();
		System.out.println("button");
		Thread.sleep(1000);
		driver.findElement(By.id("menu_dashboard_index")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='quickLinkText'])[6]")).click();
		Thread.sleep(1000);
		String text1=driver.findElement(By.id("menu_time_viewTimeModule")).getText();
		System.out.println(text1);
		WebElement choose=driver.findElement(By.id("startDates"));
		Select s1=new Select(choose);
		s1.selectByValue("4");
		driver.findElement(By.id("btnSubmit")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("menu_maintenance_purgeEmployee")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("welcome")).click();
		Thread.sleep(1000);
		driver.close();
	}

}