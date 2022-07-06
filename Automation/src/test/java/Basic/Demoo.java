package Basic;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Demoo extends excelsheet
{
	WebDriver driver;
@Test
public void BCA() throws InterruptedException, IOException
{
	Thread.sleep(4000);
	  System.out.println("BCA");
	  Actions a =new Actions(driver);
	  a.moveToElement(driver.findElement(By.xpath("/html/body/nav[2]/div/div[2]/ul/li[1]/a"))).build().perform();
	  Thread.sleep(2000);
	 
	  driver.findElement(By.xpath("(//a[contains(text(),'User Login')])[2]")).click ();
	  Thread.sleep(2000);
	  
	
	 driver.findElement(By.id("sign_user_email")).sendKeys(excelsheet.getValue("email"));
	 Thread.sleep(2000);
	 
	 driver.findElement(By.id("sign_user_password")).sendKeys(excelsheet.getValue("pass"));
	 driver.findElement(By.xpath("(//button[@class='btn btn-lg btn-primary modal-btn ajax-submit'])[1]")).click();
	 Thread.sleep(2000);
	
	 
	 WebElement welcomeUser=driver.findElement(By.xpath("(//span[@class='caret'])[6]"));
		
	
		Actions action = new Actions(driver);
		action.moveToElement(welcomeUser).build().perform();
		
		Thread.sleep(2000);
		WebElement logout=driver.findElement(By.xpath("(//a[text()=' Log Out'])[2]"));
     logout.click();
		
		System.out.println("Logout successfully");
		
}
}
