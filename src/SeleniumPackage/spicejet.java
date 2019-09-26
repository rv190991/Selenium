package SeleniumPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class spicejet 
{

	public static void main(String[] args) throws Exception
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.spicejet.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@value='Departure City']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).sendKeys("hyderabad");
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).sendKeys("Bengaluru");
		Thread.sleep(1000);
		
		//WebElement date=driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div/div/div/span"));
		/*while(date.getText().contains("November")==false)
		{
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			Thread.sleep(3000);
		}*/
		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a[text()='10']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='1 Adult']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("hrefIncAdt")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("hrefIncAdt")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("hrefIncChd")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("hrefIncChd")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='buttonN']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		Thread.sleep(3000);

	}

}
