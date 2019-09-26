package SeleniumPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class fb 
{
	@Test
	public void login() 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		/*List<WebElement> l1 = driver.findElements(By.tagName("option"));
		for(WebElement w:l1)
		{
			System.out.println(w.getText());
		}*/
		WebElement m = driver.findElement(By.id("month"));
		List<WebElement> l2 = m.findElements(By.tagName("option"));
		for(WebElement w:l2)
		{
			System.out.println(w.getText());
		}
		driver.close();
	}
	

}
