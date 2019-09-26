package SeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class facebook 
{

	public static void main(String[] args) throws Exception 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.name("email")).sendKeys("ravikiran.dbz@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("123456");
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(5000);
		WebElement error = driver.findElement(By.xpath("//div[@class='_4rbf _53ij']"));
		System.out.println(error.getText());

	}

}
