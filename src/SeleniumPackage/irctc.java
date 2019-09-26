package SeleniumPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class irctc 
{

	@Test
	public void login() throws Exception
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in");
		Thread.sleep(5000);
		try
		{
			System.out.println("IN TRY");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//a[@class='fa fa-window-close pull-right']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@placeholder='From*']")).sendKeys("Secunderabad");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@placeholder='From*']")).sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@placeholder='To*']")).sendKeys("Kazipet");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@placeholder='To*']")).sendKeys(Keys.ENTER);
		}
		catch(Exception e)
		{
			System.out.println("IN CATCH");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@placeholder='From*']")).sendKeys("Secunderabad");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@placeholder='From*']")).sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@placeholder='To*']")).sendKeys("Kazipet");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@placeholder='To*']")).sendKeys(Keys.ENTER);
		}
		
		
		driver.close();
		
		

	}

}
