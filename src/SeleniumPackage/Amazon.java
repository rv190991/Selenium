package SeleniumPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon 
{

	public static void main(String[] args) throws Exception
	{
		FirefoxDriver F = new FirefoxDriver();
		F.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		F.get("https://www.amazon.in/");
		Thread.sleep(5000);
		//WebElement X=F.findElement(By.xpath("//span[text()='Hello. Sign in']"));
		//new Actions(F).moveToElement(X).perform();
		//Thread.sleep(3000);
		F.findElement(By.xpath("//span[text()='Hello. Sign in']")).click();
		Thread.sleep(5000);
		F.findElement(By.id("ap_email")).sendKeys("guruchaitanyav@gmail.com");
		F.findElement(By.id("continue")).click();
		F.findElement(By.id("ap_password")).sendKeys("Amazon1986@");
		F.findElement(By.id("signInSubmit")).click();
		Thread.sleep(5000);
		F.findElement(By.name("field-keywords")).sendKeys("Gatsby Facewash");
		F.findElement(By.name("field-keywords")).sendKeys(Keys.ENTER);
		Thread.sleep(10000);
		F.findElement(By.xpath("//i[@class='a-icon a-icon-checkbox']")).click();
		Thread.sleep(5000);
		F.findElement(By.xpath("//img[@alt='Gatsby Cooling Face Wash Ice Freeze, 100g']")).click();
		Thread.sleep(5000);

	}

}
