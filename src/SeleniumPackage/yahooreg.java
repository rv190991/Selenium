package SeleniumPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class yahooreg 
{

	public static void main(String[] args) throws Exception
	{
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://mail.yahoo.com");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//span[text()='Sign up']")).click();
		
		//new Actions(driver).moveToElement(driver.findElement(By.xpath("//span[text()='Sign Up']"))).click().perform();
		
		driver.findElement(By.id("usernamereg-firstName")).sendKeys("Deva");
		
		driver.findElement(By.id("usernamereg-lastName")).sendKeys("Sena");
		
		driver.findElement(By.id("usernamereg-yid")).sendKeys("deva.sena2");
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("usernamereg-password")).sendKeys("YahooReg22");
		
		//driver.findElement(By.xpath("//div[@class='arrow']")).click();
		
		
		
		Select s1 = new Select(driver.findElement(By.xpath(".//*[@name='shortCountryCode']")));
		
		s1.selectByValue("IN");
		
		driver.findElement(By.id("usernamereg-phone")).sendKeys("9550599755");
		
		Select s2 = new Select(driver.findElement(By.xpath(".//*[@name='mm']")));
		
		s2.selectByVisibleText("September");
		
		driver.findElement(By.id("usernamereg-day")).sendKeys("19");
		
		driver.findElement(By.id("usernamereg-year")).sendKeys("1992");
		
		driver.findElement(By.id("reg-submit-button")).click();
		
		Thread.sleep(5000);
		
		driver.close();
		
		
		
	
		

	}

}
