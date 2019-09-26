package SeleniumPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class snapdeal 
{

	public static void main(String[] args) throws Exception 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.snapdeal.com");
		//driver.findElement(By.xpath("//a[@class='menuLinks leftCategoriesProduct']/span[2]")).click();
		WebElement w=driver.findElement(By.xpath("//span[text()='Electronics']"));
		new Actions(driver).moveToElement(w).perform();
		driver.findElement(By.linkText("Trimmers")).click();
		Thread.sleep(5000);
		driver.close();

	}

}
