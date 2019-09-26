package SeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class google 
{

	public static void main(String[] args) throws Exception
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement s = driver.findElement(By.name("q"));
		s.sendKeys("Selenium");
		Thread.sleep(2000);
		s.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		s.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		s.sendKeys(Keys.ENTER);

	}

}
