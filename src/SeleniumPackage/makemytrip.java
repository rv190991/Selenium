package SeleniumPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class makemytrip 
{

	public static void main(String[] args) throws Exception
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("fromCity")).click();
		Thread.sleep(2000);
		
		WebElement m = driver.findElement(By.xpath("//input[@placeholder='From']"));
		Thread.sleep(2000);
		m.sendKeys("Hyderabad");
		Thread.sleep(2000);
		m.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		m.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		//driver.findElement(By.id("toCity")).click();
		//Thread.sleep(5000);
		
		WebElement n = driver.findElement(By.xpath("//input[@placeholder='To']"));
		Thread.sleep(2000);
		n.sendKeys("Bangalore");
		Thread.sleep(2000);
		n.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		n.sendKeys(Keys.ENTER);
		
		WebElement date=driver.findElement(By.xpath("//div[@class='DayPicker-Month'][2]/div/div"));
		while(date.getText().contains("December")==false)
		{
			driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			Thread.sleep(3000);
		}
		driver.findElement(By.xpath("//div[@class='DayPicker-Month'][2]//p[text()='10']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//label[@for='travellers']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='appendBottom20']//ul/li[text()='3']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='makeFlex column']//ul/li[text()='2']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='APPLY']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		Thread.sleep(5000);
		
		
		
		

	}

}
