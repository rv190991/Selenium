package SeleniumPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class gmailmsg 
{

	public static void main(String[] args) throws Exception
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.findElement(By.id("identifierId")).sendKeys("ravikiran.dbz");
		driver.findElement(By.id("identifierNext")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("*********");
		driver.findElement(By.id("passwordNext")).click();
		Thread.sleep(15000);
		driver.findElement(By.xpath("//div[@gh='cm']")).click();
		Thread.sleep(15000);
		driver.findElement(By.xpath("//textarea[@aria-label='To']")).sendKeys("ravikiran.vuyyala@gmail.com");
		driver.findElement(By.name("subjectbox")).sendKeys("Test");
		driver.findElement(By.xpath("//div[@aria-label='Message Body']")).sendKeys("This is a Test mail");
		driver.findElement(By.xpath("//div[text()='Send']")).click();
		System.out.println("Mail sent successfully");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@class='gb_z gb_Ia gb_g']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div/a[text()='Sign out']")).click();
		System.out.println("Signedout Successfully");
		Thread.sleep(5000);
		driver.close();
		

	}

}
