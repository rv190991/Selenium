package SeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class googletest 
{
	
	WebDriver driver;
	@Test
	@Parameters({"browser"})
	public void search(String str) throws Exception
	{
		if(str.matches("firefox"))
		{
			driver = new FirefoxDriver();
		}
		if(str.matches("chrome"))
		{
			driver = new ChromeDriver();
		}
		
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		driver.close();
	}
	
}
