package SeleniumPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class cleartrip 
{

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com");
		driver.findElement(By.id("RoundTrip")).click();
		if(driver.findElement(By.id("OneWay")).isDisplayed())
		{
			System.out.println("OneWay Radio button is displayed");
			if(driver.findElement(By.id("OneWay")).isEnabled())
			{
				System.out.println("OneWay Radio button is enabled");
				if(driver.findElement(By.id("OneWay")).isSelected())
				{
					System.out.println("OneWay Radio button is selected");
				}
				else
				{
					System.out.println("OneWay Radio button is not selected");
				}
			}
			else
			{
				System.out.println("OneWay Radio button is not enabled");
			}
		}
		else
		{
			System.out.println("OneWay Radio is not displayed");
		}

	}

}
